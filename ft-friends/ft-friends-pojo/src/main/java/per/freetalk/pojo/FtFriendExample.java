package per.freetalk.pojo;

import java.util.ArrayList;
import java.util.List;

public class FtFriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FtFriendExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMyidIsNull() {
            addCriterion("MYID is null");
            return (Criteria) this;
        }

        public Criteria andMyidIsNotNull() {
            addCriterion("MYID is not null");
            return (Criteria) this;
        }

        public Criteria andMyidEqualTo(String value) {
            addCriterion("MYID =", value, "myid");
            return (Criteria) this;
        }

        public Criteria andMyidNotEqualTo(String value) {
            addCriterion("MYID <>", value, "myid");
            return (Criteria) this;
        }

        public Criteria andMyidGreaterThan(String value) {
            addCriterion("MYID >", value, "myid");
            return (Criteria) this;
        }

        public Criteria andMyidGreaterThanOrEqualTo(String value) {
            addCriterion("MYID >=", value, "myid");
            return (Criteria) this;
        }

        public Criteria andMyidLessThan(String value) {
            addCriterion("MYID <", value, "myid");
            return (Criteria) this;
        }

        public Criteria andMyidLessThanOrEqualTo(String value) {
            addCriterion("MYID <=", value, "myid");
            return (Criteria) this;
        }

        public Criteria andMyidLike(String value) {
            addCriterion("MYID like", value, "myid");
            return (Criteria) this;
        }

        public Criteria andMyidNotLike(String value) {
            addCriterion("MYID not like", value, "myid");
            return (Criteria) this;
        }

        public Criteria andMyidIn(List<String> values) {
            addCriterion("MYID in", values, "myid");
            return (Criteria) this;
        }

        public Criteria andMyidNotIn(List<String> values) {
            addCriterion("MYID not in", values, "myid");
            return (Criteria) this;
        }

        public Criteria andMyidBetween(String value1, String value2) {
            addCriterion("MYID between", value1, value2, "myid");
            return (Criteria) this;
        }

        public Criteria andMyidNotBetween(String value1, String value2) {
            addCriterion("MYID not between", value1, value2, "myid");
            return (Criteria) this;
        }

        public Criteria andMyfriendidIsNull() {
            addCriterion("MYFRIENDID is null");
            return (Criteria) this;
        }

        public Criteria andMyfriendidIsNotNull() {
            addCriterion("MYFRIENDID is not null");
            return (Criteria) this;
        }

        public Criteria andMyfriendidEqualTo(String value) {
            addCriterion("MYFRIENDID =", value, "myfriendid");
            return (Criteria) this;
        }

        public Criteria andMyfriendidNotEqualTo(String value) {
            addCriterion("MYFRIENDID <>", value, "myfriendid");
            return (Criteria) this;
        }

        public Criteria andMyfriendidGreaterThan(String value) {
            addCriterion("MYFRIENDID >", value, "myfriendid");
            return (Criteria) this;
        }

        public Criteria andMyfriendidGreaterThanOrEqualTo(String value) {
            addCriterion("MYFRIENDID >=", value, "myfriendid");
            return (Criteria) this;
        }

        public Criteria andMyfriendidLessThan(String value) {
            addCriterion("MYFRIENDID <", value, "myfriendid");
            return (Criteria) this;
        }

        public Criteria andMyfriendidLessThanOrEqualTo(String value) {
            addCriterion("MYFRIENDID <=", value, "myfriendid");
            return (Criteria) this;
        }

        public Criteria andMyfriendidLike(String value) {
            addCriterion("MYFRIENDID like", value, "myfriendid");
            return (Criteria) this;
        }

        public Criteria andMyfriendidNotLike(String value) {
            addCriterion("MYFRIENDID not like", value, "myfriendid");
            return (Criteria) this;
        }

        public Criteria andMyfriendidIn(List<String> values) {
            addCriterion("MYFRIENDID in", values, "myfriendid");
            return (Criteria) this;
        }

        public Criteria andMyfriendidNotIn(List<String> values) {
            addCriterion("MYFRIENDID not in", values, "myfriendid");
            return (Criteria) this;
        }

        public Criteria andMyfriendidBetween(String value1, String value2) {
            addCriterion("MYFRIENDID between", value1, value2, "myfriendid");
            return (Criteria) this;
        }

        public Criteria andMyfriendidNotBetween(String value1, String value2) {
            addCriterion("MYFRIENDID not between", value1, value2, "myfriendid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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