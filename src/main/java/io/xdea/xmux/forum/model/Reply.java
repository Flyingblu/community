package io.xdea.xmux.forum.model;

import java.util.Date;

public class Reply {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.reply.id
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.reply.content
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.reply.create_time
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.reply.uid
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.reply.vote
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    private Integer vote;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.reply.ref_post_id
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    private Integer refPostId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.reply.ref_reply_id
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    private Integer refReplyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.reply.topped
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    private Boolean topped;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.reply.delete_time
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    private Date deleteTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.reply.id
     *
     * @return the value of forum.reply.id
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Reply withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.reply.id
     *
     * @param id the value for forum.reply.id
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.reply.content
     *
     * @return the value of forum.reply.content
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Reply withContent(String content) {
        this.setContent(content);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.reply.content
     *
     * @param content the value for forum.reply.content
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.reply.create_time
     *
     * @return the value of forum.reply.create_time
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Reply withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.reply.create_time
     *
     * @param createTime the value for forum.reply.create_time
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.reply.uid
     *
     * @return the value of forum.reply.uid
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Reply withUid(String uid) {
        this.setUid(uid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.reply.uid
     *
     * @param uid the value for forum.reply.uid
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.reply.vote
     *
     * @return the value of forum.reply.vote
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Integer getVote() {
        return vote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Reply withVote(Integer vote) {
        this.setVote(vote);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.reply.vote
     *
     * @param vote the value for forum.reply.vote
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public void setVote(Integer vote) {
        this.vote = vote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.reply.ref_post_id
     *
     * @return the value of forum.reply.ref_post_id
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Integer getRefPostId() {
        return refPostId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Reply withRefPostId(Integer refPostId) {
        this.setRefPostId(refPostId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.reply.ref_post_id
     *
     * @param refPostId the value for forum.reply.ref_post_id
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public void setRefPostId(Integer refPostId) {
        this.refPostId = refPostId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.reply.ref_reply_id
     *
     * @return the value of forum.reply.ref_reply_id
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Integer getRefReplyId() {
        return refReplyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Reply withRefReplyId(Integer refReplyId) {
        this.setRefReplyId(refReplyId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.reply.ref_reply_id
     *
     * @param refReplyId the value for forum.reply.ref_reply_id
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public void setRefReplyId(Integer refReplyId) {
        this.refReplyId = refReplyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.reply.topped
     *
     * @return the value of forum.reply.topped
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Boolean getTopped() {
        return topped;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Reply withTopped(Boolean topped) {
        this.setTopped(topped);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.reply.topped
     *
     * @param topped the value for forum.reply.topped
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public void setTopped(Boolean topped) {
        this.topped = topped;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.reply.delete_time
     *
     * @return the value of forum.reply.delete_time
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public Reply withDeleteTime(Date deleteTime) {
        this.setDeleteTime(deleteTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.reply.delete_time
     *
     * @param deleteTime the value for forum.reply.delete_time
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Sun Jan 09 20:42:28 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", uid=").append(uid);
        sb.append(", vote=").append(vote);
        sb.append(", refPostId=").append(refPostId);
        sb.append(", refReplyId=").append(refReplyId);
        sb.append(", topped=").append(topped);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append("]");
        return sb.toString();
    }
}