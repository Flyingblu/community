package io.xdea.xmux.forum.model;

import java.util.Date;

public class Report {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.report.id
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.report.uid
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.report.type_id
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    private Integer typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.report.target_id
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    private Integer targetId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.report.target_type
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    private Integer targetType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.report.reason
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    private String reason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum.report.created_at
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    private Date createdAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.report.id
     *
     * @return the value of forum.report.id
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.report
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public Report withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.report.id
     *
     * @param id the value for forum.report.id
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.report.uid
     *
     * @return the value of forum.report.uid
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.report
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public Report withUid(String uid) {
        this.setUid(uid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.report.uid
     *
     * @param uid the value for forum.report.uid
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.report.type_id
     *
     * @return the value of forum.report.type_id
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.report
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public Report withTypeId(Integer typeId) {
        this.setTypeId(typeId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.report.type_id
     *
     * @param typeId the value for forum.report.type_id
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.report.target_id
     *
     * @return the value of forum.report.target_id
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public Integer getTargetId() {
        return targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.report
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public Report withTargetId(Integer targetId) {
        this.setTargetId(targetId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.report.target_id
     *
     * @param targetId the value for forum.report.target_id
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.report.target_type
     *
     * @return the value of forum.report.target_type
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public Integer getTargetType() {
        return targetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.report
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public Report withTargetType(Integer targetType) {
        this.setTargetType(targetType);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.report.target_type
     *
     * @param targetType the value for forum.report.target_type
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.report.reason
     *
     * @return the value of forum.report.reason
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.report
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public Report withReason(String reason) {
        this.setReason(reason);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.report.reason
     *
     * @param reason the value for forum.report.reason
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum.report.created_at
     *
     * @return the value of forum.report.created_at
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.report
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public Report withCreatedAt(Date createdAt) {
        this.setCreatedAt(createdAt);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum.report.created_at
     *
     * @param createdAt the value for forum.report.created_at
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.report
     *
     * @mbg.generated Mon Nov 04 19:59:07 CST 2024
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
        sb.append(", targetId=").append(targetId);
        sb.append(", targetType=").append(targetType);
        sb.append(", reason=").append(reason);
        sb.append(", createdAt=").append(createdAt);
        sb.append("]");
        return sb.toString();
    }
}