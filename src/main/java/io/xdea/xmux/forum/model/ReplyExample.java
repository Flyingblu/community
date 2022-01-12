package io.xdea.xmux.forum.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    public ReplyExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andVoteIsNull() {
            addCriterion("vote is null");
            return (Criteria) this;
        }

        public Criteria andVoteIsNotNull() {
            addCriterion("vote is not null");
            return (Criteria) this;
        }

        public Criteria andVoteEqualTo(Integer value) {
            addCriterion("vote =", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteNotEqualTo(Integer value) {
            addCriterion("vote <>", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteGreaterThan(Integer value) {
            addCriterion("vote >", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote >=", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteLessThan(Integer value) {
            addCriterion("vote <", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteLessThanOrEqualTo(Integer value) {
            addCriterion("vote <=", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteIn(List<Integer> values) {
            addCriterion("vote in", values, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteNotIn(List<Integer> values) {
            addCriterion("vote not in", values, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteBetween(Integer value1, Integer value2) {
            addCriterion("vote between", value1, value2, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteNotBetween(Integer value1, Integer value2) {
            addCriterion("vote not between", value1, value2, "vote");
            return (Criteria) this;
        }

        public Criteria andRefPostIdIsNull() {
            addCriterion("ref_post_id is null");
            return (Criteria) this;
        }

        public Criteria andRefPostIdIsNotNull() {
            addCriterion("ref_post_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefPostIdEqualTo(Integer value) {
            addCriterion("ref_post_id =", value, "refPostId");
            return (Criteria) this;
        }

        public Criteria andRefPostIdNotEqualTo(Integer value) {
            addCriterion("ref_post_id <>", value, "refPostId");
            return (Criteria) this;
        }

        public Criteria andRefPostIdGreaterThan(Integer value) {
            addCriterion("ref_post_id >", value, "refPostId");
            return (Criteria) this;
        }

        public Criteria andRefPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ref_post_id >=", value, "refPostId");
            return (Criteria) this;
        }

        public Criteria andRefPostIdLessThan(Integer value) {
            addCriterion("ref_post_id <", value, "refPostId");
            return (Criteria) this;
        }

        public Criteria andRefPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("ref_post_id <=", value, "refPostId");
            return (Criteria) this;
        }

        public Criteria andRefPostIdIn(List<Integer> values) {
            addCriterion("ref_post_id in", values, "refPostId");
            return (Criteria) this;
        }

        public Criteria andRefPostIdNotIn(List<Integer> values) {
            addCriterion("ref_post_id not in", values, "refPostId");
            return (Criteria) this;
        }

        public Criteria andRefPostIdBetween(Integer value1, Integer value2) {
            addCriterion("ref_post_id between", value1, value2, "refPostId");
            return (Criteria) this;
        }

        public Criteria andRefPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ref_post_id not between", value1, value2, "refPostId");
            return (Criteria) this;
        }

        public Criteria andRefReplyIdIsNull() {
            addCriterion("ref_reply_id is null");
            return (Criteria) this;
        }

        public Criteria andRefReplyIdIsNotNull() {
            addCriterion("ref_reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefReplyIdEqualTo(Integer value) {
            addCriterion("ref_reply_id =", value, "refReplyId");
            return (Criteria) this;
        }

        public Criteria andRefReplyIdNotEqualTo(Integer value) {
            addCriterion("ref_reply_id <>", value, "refReplyId");
            return (Criteria) this;
        }

        public Criteria andRefReplyIdGreaterThan(Integer value) {
            addCriterion("ref_reply_id >", value, "refReplyId");
            return (Criteria) this;
        }

        public Criteria andRefReplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ref_reply_id >=", value, "refReplyId");
            return (Criteria) this;
        }

        public Criteria andRefReplyIdLessThan(Integer value) {
            addCriterion("ref_reply_id <", value, "refReplyId");
            return (Criteria) this;
        }

        public Criteria andRefReplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("ref_reply_id <=", value, "refReplyId");
            return (Criteria) this;
        }

        public Criteria andRefReplyIdIn(List<Integer> values) {
            addCriterion("ref_reply_id in", values, "refReplyId");
            return (Criteria) this;
        }

        public Criteria andRefReplyIdNotIn(List<Integer> values) {
            addCriterion("ref_reply_id not in", values, "refReplyId");
            return (Criteria) this;
        }

        public Criteria andRefReplyIdBetween(Integer value1, Integer value2) {
            addCriterion("ref_reply_id between", value1, value2, "refReplyId");
            return (Criteria) this;
        }

        public Criteria andRefReplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ref_reply_id not between", value1, value2, "refReplyId");
            return (Criteria) this;
        }

        public Criteria andToppedIsNull() {
            addCriterion("topped is null");
            return (Criteria) this;
        }

        public Criteria andToppedIsNotNull() {
            addCriterion("topped is not null");
            return (Criteria) this;
        }

        public Criteria andToppedEqualTo(Boolean value) {
            addCriterion("topped =", value, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedNotEqualTo(Boolean value) {
            addCriterion("topped <>", value, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedGreaterThan(Boolean value) {
            addCriterion("topped >", value, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("topped >=", value, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedLessThan(Boolean value) {
            addCriterion("topped <", value, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedLessThanOrEqualTo(Boolean value) {
            addCriterion("topped <=", value, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedIn(List<Boolean> values) {
            addCriterion("topped in", values, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedNotIn(List<Boolean> values) {
            addCriterion("topped not in", values, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedBetween(Boolean value1, Boolean value2) {
            addCriterion("topped between", value1, value2, "topped");
            return (Criteria) this;
        }

        public Criteria andToppedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("topped not between", value1, value2, "topped");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andRefUidIsNull() {
            addCriterion("ref_uid is null");
            return (Criteria) this;
        }

        public Criteria andRefUidIsNotNull() {
            addCriterion("ref_uid is not null");
            return (Criteria) this;
        }

        public Criteria andRefUidEqualTo(String value) {
            addCriterion("ref_uid =", value, "refUid");
            return (Criteria) this;
        }

        public Criteria andRefUidNotEqualTo(String value) {
            addCriterion("ref_uid <>", value, "refUid");
            return (Criteria) this;
        }

        public Criteria andRefUidGreaterThan(String value) {
            addCriterion("ref_uid >", value, "refUid");
            return (Criteria) this;
        }

        public Criteria andRefUidGreaterThanOrEqualTo(String value) {
            addCriterion("ref_uid >=", value, "refUid");
            return (Criteria) this;
        }

        public Criteria andRefUidLessThan(String value) {
            addCriterion("ref_uid <", value, "refUid");
            return (Criteria) this;
        }

        public Criteria andRefUidLessThanOrEqualTo(String value) {
            addCriterion("ref_uid <=", value, "refUid");
            return (Criteria) this;
        }

        public Criteria andRefUidLike(String value) {
            addCriterion("ref_uid like", value, "refUid");
            return (Criteria) this;
        }

        public Criteria andRefUidNotLike(String value) {
            addCriterion("ref_uid not like", value, "refUid");
            return (Criteria) this;
        }

        public Criteria andRefUidIn(List<String> values) {
            addCriterion("ref_uid in", values, "refUid");
            return (Criteria) this;
        }

        public Criteria andRefUidNotIn(List<String> values) {
            addCriterion("ref_uid not in", values, "refUid");
            return (Criteria) this;
        }

        public Criteria andRefUidBetween(String value1, String value2) {
            addCriterion("ref_uid between", value1, value2, "refUid");
            return (Criteria) this;
        }

        public Criteria andRefUidNotBetween(String value1, String value2) {
            addCriterion("ref_uid not between", value1, value2, "refUid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table forum.reply
     *
     * @mbg.generated do_not_delete_during_merge Wed Jan 12 21:30:43 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 12 21:30:43 CST 2022
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}