package io.xdea.xmux.forum.model;

import java.util.Date;

public class Group {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.group.id
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.group.title
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.group.description
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.group.create_time
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.group.delete_time
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    private Date deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.group.creator_uid
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    private String creatorUid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.group.id
     *
     * @return the value of forum.group.id
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.group
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public Group withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.group.id
     *
     * @param id the value for forum.group.id
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.group.title
     *
     * @return the value of forum.group.title
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.group
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public Group withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.group.title
     *
     * @param title the value for forum.group.title
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.group.description
     *
     * @return the value of forum.group.description
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.group
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public Group withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.group.description
     *
     * @param description the value for forum.group.description
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.group.create_time
     *
     * @return the value of forum.group.create_time
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.group
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public Group withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.group.create_time
     *
     * @param createTime the value for forum.group.create_time
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.group.delete_time
     *
     * @return the value of forum.group.delete_time
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.group
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public Group withDeleteTime(Date deleteTime) {
        this.setDeleteTime(deleteTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.group.delete_time
     *
     * @param deleteTime the value for forum.group.delete_time
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.group.creator_uid
     *
     * @return the value of forum.group.creator_uid
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public String getCreatorUid() {
        return creatorUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.group
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public Group withCreatorUid(String creatorUid) {
        this.setCreatorUid(creatorUid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.group.creator_uid
     *
     * @param creatorUid the value for forum.group.creator_uid
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    public void setCreatorUid(String creatorUid) {
        this.creatorUid = creatorUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.group
     *
     * @mbg.generated Thu Jan 13 15:50:17 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", creatorUid=").append(creatorUid);
        sb.append("]");
        return sb.toString();
    }
}