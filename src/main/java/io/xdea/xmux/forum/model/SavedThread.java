package io.xdea.xmux.forum.model;

import java.util.Date;

public class SavedThread {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.saved_thread.id
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.saved_thread.uid
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.saved_thread.thread_id
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    private Integer threadId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.saved_thread.create_at
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    private Date createAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.saved_thread.id
     *
     * @return the value of forum.saved_thread.id
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.saved_thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public SavedThread withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.saved_thread.id
     *
     * @param id the value for forum.saved_thread.id
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.saved_thread.uid
     *
     * @return the value of forum.saved_thread.uid
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.saved_thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public SavedThread withUid(String uid) {
        this.setUid(uid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.saved_thread.uid
     *
     * @param uid the value for forum.saved_thread.uid
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.saved_thread.thread_id
     *
     * @return the value of forum.saved_thread.thread_id
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public Integer getThreadId() {
        return threadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.saved_thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public SavedThread withThreadId(Integer threadId) {
        this.setThreadId(threadId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.saved_thread.thread_id
     *
     * @param threadId the value for forum.saved_thread.thread_id
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.saved_thread.create_at
     *
     * @return the value of forum.saved_thread.create_at
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.saved_thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public SavedThread withCreateAt(Date createAt) {
        this.setCreateAt(createAt);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.saved_thread.create_at
     *
     * @param createAt the value for forum.saved_thread.create_at
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.saved_thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
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
        sb.append(", createAt=").append(createAt);
        sb.append("]");
        return sb.toString();
    }
}