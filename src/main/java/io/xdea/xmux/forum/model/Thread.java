package io.xdea.xmux.forum.model;

import java.util.Date;
import java.util.Map;

public class Thread {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.thread.id
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.thread.uid
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.thread.forum_id
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Integer forumId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.thread.title
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.thread.body_type
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Integer bodyType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.thread.body
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Map body;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.thread.create_at
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.thread.update_at
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Date updateAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.thread.last_update
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Date lastUpdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.thread.likes
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Integer likes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.thread.posts
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Integer posts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.thread.pinned
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Boolean pinned;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.thread.digest
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    private Boolean digest;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.thread.id
     *
     * @return the value of forum.thread.id
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Thread withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.thread.id
     *
     * @param id the value for forum.thread.id
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.thread.uid
     *
     * @return the value of forum.thread.uid
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Thread withUid(String uid) {
        this.setUid(uid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.thread.uid
     *
     * @param uid the value for forum.thread.uid
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.thread.forum_id
     *
     * @return the value of forum.thread.forum_id
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Integer getForumId() {
        return forumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Thread withForumId(Integer forumId) {
        this.setForumId(forumId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.thread.forum_id
     *
     * @param forumId the value for forum.thread.forum_id
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.thread.title
     *
     * @return the value of forum.thread.title
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Thread withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.thread.title
     *
     * @param title the value for forum.thread.title
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.thread.body_type
     *
     * @return the value of forum.thread.body_type
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Integer getBodyType() {
        return bodyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Thread withBodyType(Integer bodyType) {
        this.setBodyType(bodyType);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.thread.body_type
     *
     * @param bodyType the value for forum.thread.body_type
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setBodyType(Integer bodyType) {
        this.bodyType = bodyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.thread.body
     *
     * @return the value of forum.thread.body
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Map getBody() {
        return body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Thread withBody(Map body) {
        this.setBody(body);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.thread.body
     *
     * @param body the value for forum.thread.body
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setBody(Map body) {
        this.body = body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.thread.create_at
     *
     * @return the value of forum.thread.create_at
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Thread withCreateAt(Date createAt) {
        this.setCreateAt(createAt);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.thread.create_at
     *
     * @param createAt the value for forum.thread.create_at
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.thread.update_at
     *
     * @return the value of forum.thread.update_at
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Thread withUpdateAt(Date updateAt) {
        this.setUpdateAt(updateAt);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.thread.update_at
     *
     * @param updateAt the value for forum.thread.update_at
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.thread.last_update
     *
     * @return the value of forum.thread.last_update
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Thread withLastUpdate(Date lastUpdate) {
        this.setLastUpdate(lastUpdate);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.thread.last_update
     *
     * @param lastUpdate the value for forum.thread.last_update
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.thread.likes
     *
     * @return the value of forum.thread.likes
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Thread withLikes(Integer likes) {
        this.setLikes(likes);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.thread.likes
     *
     * @param likes the value for forum.thread.likes
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.thread.posts
     *
     * @return the value of forum.thread.posts
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Integer getPosts() {
        return posts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Thread withPosts(Integer posts) {
        this.setPosts(posts);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.thread.posts
     *
     * @param posts the value for forum.thread.posts
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.thread.pinned
     *
     * @return the value of forum.thread.pinned
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Boolean getPinned() {
        return pinned;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Thread withPinned(Boolean pinned) {
        this.setPinned(pinned);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.thread.pinned
     *
     * @param pinned the value for forum.thread.pinned
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.thread.digest
     *
     * @return the value of forum.thread.digest
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Boolean getDigest() {
        return digest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public Thread withDigest(Boolean digest) {
        this.setDigest(digest);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.thread.digest
     *
     * @param digest the value for forum.thread.digest
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    public void setDigest(Boolean digest) {
        this.digest = digest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
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
        sb.append(", forumId=").append(forumId);
        sb.append(", title=").append(title);
        sb.append(", bodyType=").append(bodyType);
        sb.append(", body=").append(body);
        sb.append(", createAt=").append(createAt);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append(", likes=").append(likes);
        sb.append(", posts=").append(posts);
        sb.append(", pinned=").append(pinned);
        sb.append(", digest=").append(digest);
        sb.append("]");
        return sb.toString();
    }
}