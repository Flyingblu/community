package io.xdea.xmux.forum.controller;

import com.google.protobuf.Empty;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import io.sentry.Sentry;
import io.xdea.xmux.forum.dto.SavedGrpcApi;
import io.xdea.xmux.forum.interceptor.AuthInterceptor;
import io.xdea.xmux.forum.service.*;

public abstract class SavedController extends PostController {
    protected final SavedService savedService;

    protected SavedController(ForumService forumService, NotifService notifService, ThreadService threadService,
                              PostService postService, SavedService savedService) {
        super(forumService, notifService, threadService, postService);
        this.savedService = savedService;
    }

    @Override
    public void savePost(SavedGrpcApi.SaveReq request, StreamObserver<SavedGrpcApi.SaveResp> responseObserver) {
        String uid = AuthInterceptor.UID.get();
        try {
            if (savedService.checkPostSaved(uid, request.getRefId())) {
                responseObserver.onNext(SavedGrpcApi.SaveResp.newBuilder().setAlreadySaved(true).build());
                responseObserver.onCompleted();
                return;
            }
            if (!savedService.savePost(uid, request.getRefId()))
                throw new Exception("savedService.savePost returned false");
        } catch (Exception e) {
            Sentry.captureException(e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("DB error").asException());
            return;
        }
        responseObserver.onNext(SavedGrpcApi.SaveResp.newBuilder().setAlreadySaved(false).build());
        responseObserver.onCompleted();
    }

    @Override
    public void saveReply(SavedGrpcApi.SaveReq request, StreamObserver<SavedGrpcApi.SaveResp> responseObserver) {
        String uid = AuthInterceptor.UID.get();
        try {
            if (savedService.checkReplySaved(uid, request.getRefId())) {
                responseObserver.onNext(SavedGrpcApi.SaveResp.newBuilder().setAlreadySaved(true).build());
                responseObserver.onCompleted();
                return;
            }
            if (!savedService.saveReply(uid, request.getRefId()))
                throw new Exception("savedService.saveReply returned false");
        } catch (Exception e) {
            Sentry.captureException(e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("DB error").asException());
            return;
        }
        responseObserver.onNext(SavedGrpcApi.SaveResp.newBuilder().setAlreadySaved(false).build());
        responseObserver.onCompleted();
    }

    @Override
    public void removeSavedPost(SavedGrpcApi.SaveReq request, StreamObserver<Empty> responseObserver) {
        String uid = AuthInterceptor.UID.get();
        try {
            savedService.removeSavedPost(uid, request.getRefId());
        } catch (Exception e) {
            Sentry.captureException(e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("DB error").asException());
            return;
        }
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }

    @Override
    public void removeSavedReply(SavedGrpcApi.SaveReq request, StreamObserver<Empty> responseObserver) {
        String uid = AuthInterceptor.UID.get();
        try {
            savedService.removeSavedReply(uid, request.getRefId());
        } catch (Exception e) {
            Sentry.captureException(e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("DB error").asException());
            return;
        }
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }
}
