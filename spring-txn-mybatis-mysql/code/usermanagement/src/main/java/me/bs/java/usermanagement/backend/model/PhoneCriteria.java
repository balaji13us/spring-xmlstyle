package me.bs.java.usermanagement.backend.model;

import java.util.ArrayList;
import java.util.List;

public class PhoneCriteria {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	public PhoneCriteria() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
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

		public Criteria andNumberIsNull() {
			addCriterion("NUMBER is null");
			return (Criteria) this;
		}

		public Criteria andNumberIsNotNull() {
			addCriterion("NUMBER is not null");
			return (Criteria) this;
		}

		public Criteria andNumberEqualTo(String value) {
			addCriterion("NUMBER =", value, "number");
			return (Criteria) this;
		}

		public Criteria andNumberNotEqualTo(String value) {
			addCriterion("NUMBER <>", value, "number");
			return (Criteria) this;
		}

		public Criteria andNumberGreaterThan(String value) {
			addCriterion("NUMBER >", value, "number");
			return (Criteria) this;
		}

		public Criteria andNumberGreaterThanOrEqualTo(String value) {
			addCriterion("NUMBER >=", value, "number");
			return (Criteria) this;
		}

		public Criteria andNumberLessThan(String value) {
			addCriterion("NUMBER <", value, "number");
			return (Criteria) this;
		}

		public Criteria andNumberLessThanOrEqualTo(String value) {
			addCriterion("NUMBER <=", value, "number");
			return (Criteria) this;
		}

		public Criteria andNumberLike(String value) {
			addCriterion("NUMBER like", value, "number");
			return (Criteria) this;
		}

		public Criteria andNumberNotLike(String value) {
			addCriterion("NUMBER not like", value, "number");
			return (Criteria) this;
		}

		public Criteria andNumberIn(List<String> values) {
			addCriterion("NUMBER in", values, "number");
			return (Criteria) this;
		}

		public Criteria andNumberNotIn(List<String> values) {
			addCriterion("NUMBER not in", values, "number");
			return (Criteria) this;
		}

		public Criteria andNumberBetween(String value1, String value2) {
			addCriterion("NUMBER between", value1, value2, "number");
			return (Criteria) this;
		}

		public Criteria andNumberNotBetween(String value1, String value2) {
			addCriterion("NUMBER not between", value1, value2, "number");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryIsNull() {
			addCriterion("IS_PRIMARY is null");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryIsNotNull() {
			addCriterion("IS_PRIMARY is not null");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryEqualTo(String value) {
			addCriterion("IS_PRIMARY =", value, "isPrimary");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryNotEqualTo(String value) {
			addCriterion("IS_PRIMARY <>", value, "isPrimary");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryGreaterThan(String value) {
			addCriterion("IS_PRIMARY >", value, "isPrimary");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryGreaterThanOrEqualTo(String value) {
			addCriterion("IS_PRIMARY >=", value, "isPrimary");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryLessThan(String value) {
			addCriterion("IS_PRIMARY <", value, "isPrimary");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryLessThanOrEqualTo(String value) {
			addCriterion("IS_PRIMARY <=", value, "isPrimary");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryLike(String value) {
			addCriterion("IS_PRIMARY like", value, "isPrimary");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryNotLike(String value) {
			addCriterion("IS_PRIMARY not like", value, "isPrimary");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryIn(List<String> values) {
			addCriterion("IS_PRIMARY in", values, "isPrimary");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryNotIn(List<String> values) {
			addCriterion("IS_PRIMARY not in", values, "isPrimary");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryBetween(String value1, String value2) {
			addCriterion("IS_PRIMARY between", value1, value2, "isPrimary");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryNotBetween(String value1, String value2) {
			addCriterion("IS_PRIMARY not between", value1, value2, "isPrimary");
			return (Criteria) this;
		}

		public Criteria andProxyIsNull() {
			addCriterion("PROXY is null");
			return (Criteria) this;
		}

		public Criteria andProxyIsNotNull() {
			addCriterion("PROXY is not null");
			return (Criteria) this;
		}

		public Criteria andProxyEqualTo(String value) {
			addCriterion("PROXY =", value, "proxy");
			return (Criteria) this;
		}

		public Criteria andProxyNotEqualTo(String value) {
			addCriterion("PROXY <>", value, "proxy");
			return (Criteria) this;
		}

		public Criteria andProxyGreaterThan(String value) {
			addCriterion("PROXY >", value, "proxy");
			return (Criteria) this;
		}

		public Criteria andProxyGreaterThanOrEqualTo(String value) {
			addCriterion("PROXY >=", value, "proxy");
			return (Criteria) this;
		}

		public Criteria andProxyLessThan(String value) {
			addCriterion("PROXY <", value, "proxy");
			return (Criteria) this;
		}

		public Criteria andProxyLessThanOrEqualTo(String value) {
			addCriterion("PROXY <=", value, "proxy");
			return (Criteria) this;
		}

		public Criteria andProxyLike(String value) {
			addCriterion("PROXY like", value, "proxy");
			return (Criteria) this;
		}

		public Criteria andProxyNotLike(String value) {
			addCriterion("PROXY not like", value, "proxy");
			return (Criteria) this;
		}

		public Criteria andProxyIn(List<String> values) {
			addCriterion("PROXY in", values, "proxy");
			return (Criteria) this;
		}

		public Criteria andProxyNotIn(List<String> values) {
			addCriterion("PROXY not in", values, "proxy");
			return (Criteria) this;
		}

		public Criteria andProxyBetween(String value1, String value2) {
			addCriterion("PROXY between", value1, value2, "proxy");
			return (Criteria) this;
		}

		public Criteria andProxyNotBetween(String value1, String value2) {
			addCriterion("PROXY not between", value1, value2, "proxy");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeIsNull() {
			addCriterion("PHONE_TYPE is null");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeIsNotNull() {
			addCriterion("PHONE_TYPE is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeEqualTo(String value) {
			addCriterion("PHONE_TYPE =", value, "phoneType");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeNotEqualTo(String value) {
			addCriterion("PHONE_TYPE <>", value, "phoneType");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeGreaterThan(String value) {
			addCriterion("PHONE_TYPE >", value, "phoneType");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeGreaterThanOrEqualTo(String value) {
			addCriterion("PHONE_TYPE >=", value, "phoneType");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeLessThan(String value) {
			addCriterion("PHONE_TYPE <", value, "phoneType");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeLessThanOrEqualTo(String value) {
			addCriterion("PHONE_TYPE <=", value, "phoneType");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeLike(String value) {
			addCriterion("PHONE_TYPE like", value, "phoneType");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeNotLike(String value) {
			addCriterion("PHONE_TYPE not like", value, "phoneType");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeIn(List<String> values) {
			addCriterion("PHONE_TYPE in", values, "phoneType");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeNotIn(List<String> values) {
			addCriterion("PHONE_TYPE not in", values, "phoneType");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeBetween(String value1, String value2) {
			addCriterion("PHONE_TYPE between", value1, value2, "phoneType");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeNotBetween(String value1, String value2) {
			addCriterion("PHONE_TYPE not between", value1, value2, "phoneType");
			return (Criteria) this;
		}

		public Criteria andPersonIdIsNull() {
			addCriterion("PERSON_ID is null");
			return (Criteria) this;
		}

		public Criteria andPersonIdIsNotNull() {
			addCriterion("PERSON_ID is not null");
			return (Criteria) this;
		}

		public Criteria andPersonIdEqualTo(Long value) {
			addCriterion("PERSON_ID =", value, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdNotEqualTo(Long value) {
			addCriterion("PERSON_ID <>", value, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdGreaterThan(Long value) {
			addCriterion("PERSON_ID >", value, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdGreaterThanOrEqualTo(Long value) {
			addCriterion("PERSON_ID >=", value, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdLessThan(Long value) {
			addCriterion("PERSON_ID <", value, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdLessThanOrEqualTo(Long value) {
			addCriterion("PERSON_ID <=", value, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdIn(List<Long> values) {
			addCriterion("PERSON_ID in", values, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdNotIn(List<Long> values) {
			addCriterion("PERSON_ID not in", values, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdBetween(Long value1, Long value2) {
			addCriterion("PERSON_ID between", value1, value2, "personId");
			return (Criteria) this;
		}

		public Criteria andPersonIdNotBetween(Long value1, Long value2) {
			addCriterion("PERSON_ID not between", value1, value2, "personId");
			return (Criteria) this;
		}

		public Criteria andNumberLikeInsensitive(String value) {
			addCriterion("upper(NUMBER) like", value.toUpperCase(), "number");
			return (Criteria) this;
		}

		public Criteria andIsPrimaryLikeInsensitive(String value) {
			addCriterion("upper(IS_PRIMARY) like", value.toUpperCase(), "isPrimary");
			return (Criteria) this;
		}

		public Criteria andProxyLikeInsensitive(String value) {
			addCriterion("upper(PROXY) like", value.toUpperCase(), "proxy");
			return (Criteria) this;
		}

		public Criteria andPhoneTypeLikeInsensitive(String value) {
			addCriterion("upper(PHONE_TYPE) like", value.toUpperCase(), "phoneType");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PHONE
     *
     * @mbg.generated do_not_delete_during_merge Sat Apr 06 19:44:43 IST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}