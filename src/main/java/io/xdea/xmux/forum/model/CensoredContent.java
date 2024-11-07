package io.xdea.xmux.forum.model;

import java.util.Date;

public class CensoredContent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.censored_content.id
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.censored_content.uid
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.censored_content.type_id
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    private Integer typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.censored_content.content_type
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    private Integer contentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.censored_content.content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.censored_content.reason
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    private String reason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.censored_content.created_at
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    private Date createdAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.censored_content.id
     *
     * @return the value of forum.censored_content.id
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public CensoredContent withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.censored_content.id
     *
     * @param id the value for forum.censored_content.id
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.censored_content.uid
     *
     * @return the value of forum.censored_content.uid
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public CensoredContent withUid(String uid) {
        this.setUid(uid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.censored_content.uid
     *
     * @param uid the value for forum.censored_content.uid
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.censored_content.type_id
     *
     * @return the value of forum.censored_content.type_id
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public CensoredContent withTypeId(Integer typeId) {
        this.setTypeId(typeId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.censored_content.type_id
     *
     * @param typeId the value for forum.censored_content.type_id
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.censored_content.content_type
     *
     * @return the value of forum.censored_content.content_type
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public Integer getContentType() {
        return contentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public CensoredContent withContentType(Integer contentType) {
        this.setContentType(contentType);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.censored_content.content_type
     *
     * @param contentType the value for forum.censored_content.content_type
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.censored_content.content
     *
     * @return the value of forum.censored_content.content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public CensoredContent withContent(String content) {
        this.setContent(content);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.censored_content.content
     *
     * @param content the value for forum.censored_content.content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.censored_content.reason
     *
     * @return the value of forum.censored_content.reason
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public CensoredContent withReason(String reason) {
        this.setReason(reason);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.censored_content.reason
     *
     * @param reason the value for forum.censored_content.reason
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.censored_content.created_at
     *
     * @return the value of forum.censored_content.created_at
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public CensoredContent withCreatedAt(Date createdAt) {
        this.setCreatedAt(createdAt);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.censored_content.created_at
     *
     * @param createdAt the value for forum.censored_content.created_at
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
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
        sb.append(", typeId=").append(typeId);
        sb.append(", contentType=").append(contentType);
        sb.append(", content=").append(content);
        sb.append(", reason=").append(reason);
        sb.append(", createdAt=").append(createdAt);
        sb.append("]");
        return sb.toString();
    }
}