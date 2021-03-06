package pri.growup.persistence.dto;

import pri.growup.persistence.BaseExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GrowUpVlogExample extends BaseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
     */
    public GrowUpVlogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
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
     * This method corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andVlogIdIsNull() {
            addCriterion("VLOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andVlogIdIsNotNull() {
            addCriterion("VLOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVlogIdEqualTo(String value) {
            addCriterion("VLOG_ID =", value, "vlogId");
            return (Criteria) this;
        }

        public Criteria andVlogIdNotEqualTo(String value) {
            addCriterion("VLOG_ID <>", value, "vlogId");
            return (Criteria) this;
        }

        public Criteria andVlogIdGreaterThan(String value) {
            addCriterion("VLOG_ID >", value, "vlogId");
            return (Criteria) this;
        }

        public Criteria andVlogIdGreaterThanOrEqualTo(String value) {
            addCriterion("VLOG_ID >=", value, "vlogId");
            return (Criteria) this;
        }

        public Criteria andVlogIdLessThan(String value) {
            addCriterion("VLOG_ID <", value, "vlogId");
            return (Criteria) this;
        }

        public Criteria andVlogIdLessThanOrEqualTo(String value) {
            addCriterion("VLOG_ID <=", value, "vlogId");
            return (Criteria) this;
        }

        public Criteria andVlogIdLike(String value) {
            addCriterion("VLOG_ID like", value, "vlogId");
            return (Criteria) this;
        }

        public Criteria andVlogIdNotLike(String value) {
            addCriterion("VLOG_ID not like", value, "vlogId");
            return (Criteria) this;
        }

        public Criteria andVlogIdIn(List<String> values) {
            addCriterion("VLOG_ID in", values, "vlogId");
            return (Criteria) this;
        }

        public Criteria andVlogIdNotIn(List<String> values) {
            addCriterion("VLOG_ID not in", values, "vlogId");
            return (Criteria) this;
        }

        public Criteria andVlogIdBetween(String value1, String value2) {
            addCriterion("VLOG_ID between", value1, value2, "vlogId");
            return (Criteria) this;
        }

        public Criteria andVlogIdNotBetween(String value1, String value2) {
            addCriterion("VLOG_ID not between", value1, value2, "vlogId");
            return (Criteria) this;
        }

        public Criteria andVlogPathIsNull() {
            addCriterion("VLOG_PATH is null");
            return (Criteria) this;
        }

        public Criteria andVlogPathIsNotNull() {
            addCriterion("VLOG_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andVlogPathEqualTo(String value) {
            addCriterion("VLOG_PATH =", value, "vlogPath");
            return (Criteria) this;
        }

        public Criteria andVlogPathNotEqualTo(String value) {
            addCriterion("VLOG_PATH <>", value, "vlogPath");
            return (Criteria) this;
        }

        public Criteria andVlogPathGreaterThan(String value) {
            addCriterion("VLOG_PATH >", value, "vlogPath");
            return (Criteria) this;
        }

        public Criteria andVlogPathGreaterThanOrEqualTo(String value) {
            addCriterion("VLOG_PATH >=", value, "vlogPath");
            return (Criteria) this;
        }

        public Criteria andVlogPathLessThan(String value) {
            addCriterion("VLOG_PATH <", value, "vlogPath");
            return (Criteria) this;
        }

        public Criteria andVlogPathLessThanOrEqualTo(String value) {
            addCriterion("VLOG_PATH <=", value, "vlogPath");
            return (Criteria) this;
        }

        public Criteria andVlogPathLike(String value) {
            addCriterion("VLOG_PATH like", value, "vlogPath");
            return (Criteria) this;
        }

        public Criteria andVlogPathNotLike(String value) {
            addCriterion("VLOG_PATH not like", value, "vlogPath");
            return (Criteria) this;
        }

        public Criteria andVlogPathIn(List<String> values) {
            addCriterion("VLOG_PATH in", values, "vlogPath");
            return (Criteria) this;
        }

        public Criteria andVlogPathNotIn(List<String> values) {
            addCriterion("VLOG_PATH not in", values, "vlogPath");
            return (Criteria) this;
        }

        public Criteria andVlogPathBetween(String value1, String value2) {
            addCriterion("VLOG_PATH between", value1, value2, "vlogPath");
            return (Criteria) this;
        }

        public Criteria andVlogPathNotBetween(String value1, String value2) {
            addCriterion("VLOG_PATH not between", value1, value2, "vlogPath");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("DELETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("DELETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("DELETE_TIME =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("DELETE_TIME <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("DELETE_TIME >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DELETE_TIME >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("DELETE_TIME <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("DELETE_TIME <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("DELETE_TIME in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("DELETE_TIME not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("DELETE_TIME between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("DELETE_TIME not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNull() {
            addCriterion("DELETE_FLG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNotNull() {
            addCriterion("DELETE_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgEqualTo(Byte value) {
            addCriterion("DELETE_FLG =", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotEqualTo(Byte value) {
            addCriterion("DELETE_FLG <>", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThan(Byte value) {
            addCriterion("DELETE_FLG >", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThanOrEqualTo(Byte value) {
            addCriterion("DELETE_FLG >=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThan(Byte value) {
            addCriterion("DELETE_FLG <", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThanOrEqualTo(Byte value) {
            addCriterion("DELETE_FLG <=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIn(List<Byte> values) {
            addCriterion("DELETE_FLG in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotIn(List<Byte> values) {
            addCriterion("DELETE_FLG not in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgBetween(Byte value1, Byte value2) {
            addCriterion("DELETE_FLG between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotBetween(Byte value1, Byte value2) {
            addCriterion("DELETE_FLG not between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table grow_up_vlog
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table grow_up_vlog
     *
     * @mbggenerated
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