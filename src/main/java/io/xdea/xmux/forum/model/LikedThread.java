package io.xdea.xmux.forum.model;

import java.util.Date;

public class LikedThread {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.liked_thread.id
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.liked_thread.uid
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.liked_thread.thread_id
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Integer threadId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.liked_thread.liked
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Boolean liked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.liked_thread.create_at
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Date createAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.liked_thread.id
     *
     * @return the value of forum.liked_thread.id
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public LikedThread withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.liked_thread.id
     *
     * @param id the value for forum.liked_thread.id
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.liked_thread.uid
     *
     * @return the value of forum.liked_thread.uid
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public LikedThread withUid(String uid) {
        this.setUid(uid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.liked_thread.uid
     *
     * @param uid the value for forum.liked_thread.uid
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.liked_thread.thread_id
     *
     * @return the value of forum.liked_thread.thread_id
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Integer getThreadId() {
        return threadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public LikedThread withThreadId(Integer threadId) {
        this.setThreadId(threadId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.liked_thread.thread_id
     *
     * @param threadId the value for forum.liked_thread.thread_id
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.liked_thread.liked
     *
     * @return the value of forum.liked_thread.liked
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Boolean getLiked() {
        return liked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public LikedThread withLiked(Boolean liked) {
        this.setLiked(liked);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.liked_thread.liked
     *
     * @param liked the value for forum.liked_thread.liked
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setLiked(Boolean liked) {
        this.liked = liked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.liked_thread.create_at
     *
     * @return the value of forum.liked_thread.create_at
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public LikedThread withCreateAt(Date createAt) {
        this.setCreateAt(createAt);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.liked_thread.create_at
     *
     * @param createAt the value for forum.liked_thread.create_at
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", threadId=").append(threadId);
        sb.append(", liked=").append(liked);
        sb.append(", createAt=").append(createAt);
        sb.append("]");
        return sb.toString();
    }
}