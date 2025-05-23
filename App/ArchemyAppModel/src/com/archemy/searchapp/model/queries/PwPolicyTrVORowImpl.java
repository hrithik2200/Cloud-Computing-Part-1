package com.archemy.searchapp.model.queries;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Dec 26 12:25:30 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PwPolicyTrVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        UserChangePwd {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getUserChangePwd();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setUserChangePwd((Boolean)value);
            }
        }
        ,
        ExpireWarningDays {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getExpireWarningDays();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setExpireWarningDays((Long)value);
            }
        }
        ,
        FailureCountInterval {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getFailureCountInterval();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setFailureCountInterval((Integer)value);
            }
        }
        ,
        GraceLoginLimit {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getGraceLoginLimit();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setGraceLoginLimit((Integer)value);
            }
        }
        ,
        PwdInHistory {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getPwdInHistory();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setPwdInHistory((Integer)value);
            }
        }
        ,
        AccountLockoutEnabled {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getAccountLockoutEnabled();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setAccountLockoutEnabled((Boolean)value);
            }
        }
        ,
        AccountLockoutDuration {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getAccountLockoutDuration();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setAccountLockoutDuration((Integer)value);
            }
        }
        ,
        MaxAge {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getMaxAge();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setMaxAge((Long)value);
            }
        }
        ,
        MaxFailure {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getMaxFailure();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setMaxFailure((Integer)value);
            }
        }
        ,
        MinAge {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getMinAge();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setMinAge((Integer)value);
            }
        }
        ,
        MinLength {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getMinLength();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setMinLength((Integer)value);
            }
        }
        ,
        MustChange {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getMustChange();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setMustChange((Boolean)value);
            }
        }
        ,
        Name {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getName();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setName((String)value);
            }
        }
        ,
        SafeModify {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getSafeModify();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setSafeModify((Boolean)value);
            }
        }
        ,
        RowStatus {
            public Object get(PwPolicyTrVORowImpl obj) {
                return obj.getRowStatus();
            }

            public void put(PwPolicyTrVORowImpl obj, Object value) {
                obj.setRowStatus((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(PwPolicyTrVORowImpl object);

        public abstract void put(PwPolicyTrVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int USERCHANGEPWD = AttributesEnum.UserChangePwd.index();
    public static final int EXPIREWARNINGDAYS = AttributesEnum.ExpireWarningDays.index();
    public static final int FAILURECOUNTINTERVAL = AttributesEnum.FailureCountInterval.index();
    public static final int GRACELOGINLIMIT = AttributesEnum.GraceLoginLimit.index();
    public static final int PWDINHISTORY = AttributesEnum.PwdInHistory.index();
    public static final int ACCOUNTLOCKOUTENABLED = AttributesEnum.AccountLockoutEnabled.index();
    public static final int ACCOUNTLOCKOUTDURATION = AttributesEnum.AccountLockoutDuration.index();
    public static final int MAXAGE = AttributesEnum.MaxAge.index();
    public static final int MAXFAILURE = AttributesEnum.MaxFailure.index();
    public static final int MINAGE = AttributesEnum.MinAge.index();
    public static final int MINLENGTH = AttributesEnum.MinLength.index();
    public static final int MUSTCHANGE = AttributesEnum.MustChange.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int SAFEMODIFY = AttributesEnum.SafeModify.index();
    public static final int ROWSTATUS = AttributesEnum.RowStatus.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PwPolicyTrVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute UserChangePwd.
     * @return the UserChangePwd
     */
    public Boolean getUserChangePwd() {
        return (Boolean) getAttributeInternal(USERCHANGEPWD);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UserChangePwd.
     * @param value value to set the  UserChangePwd
     */
    public void setUserChangePwd(Boolean value) {
        setAttributeInternal(USERCHANGEPWD, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ExpireWarningDays.
     * @return the ExpireWarningDays
     */
    public Long getExpireWarningDays() {
        return (Long) getAttributeInternal(EXPIREWARNINGDAYS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ExpireWarningDays.
     * @param value value to set the  ExpireWarningDays
     */
    public void setExpireWarningDays(Long value) {
        setAttributeInternal(EXPIREWARNINGDAYS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FailureCountInterval.
     * @return the FailureCountInterval
     */
    public Integer getFailureCountInterval() {
        return (Integer) getAttributeInternal(FAILURECOUNTINTERVAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FailureCountInterval.
     * @param value value to set the  FailureCountInterval
     */
    public void setFailureCountInterval(Integer value) {
        setAttributeInternal(FAILURECOUNTINTERVAL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute GraceLoginLimit.
     * @return the GraceLoginLimit
     */
    public Integer getGraceLoginLimit() {
        return (Integer) getAttributeInternal(GRACELOGINLIMIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute GraceLoginLimit.
     * @param value value to set the  GraceLoginLimit
     */
    public void setGraceLoginLimit(Integer value) {
        setAttributeInternal(GRACELOGINLIMIT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PwdInHistory.
     * @return the PwdInHistory
     */
    public Integer getPwdInHistory() {
        return (Integer) getAttributeInternal(PWDINHISTORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PwdInHistory.
     * @param value value to set the  PwdInHistory
     */
    public void setPwdInHistory(Integer value) {
        setAttributeInternal(PWDINHISTORY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AccountLockoutEnabled.
     * @return the AccountLockoutEnabled
     */
    public Boolean getAccountLockoutEnabled() {
        return (Boolean) getAttributeInternal(ACCOUNTLOCKOUTENABLED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AccountLockoutEnabled.
     * @param value value to set the  AccountLockoutEnabled
     */
    public void setAccountLockoutEnabled(Boolean value) {
        setAttributeInternal(ACCOUNTLOCKOUTENABLED, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AccountLockoutDuration.
     * @return the AccountLockoutDuration
     */
    public Integer getAccountLockoutDuration() {
        return (Integer) getAttributeInternal(ACCOUNTLOCKOUTDURATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AccountLockoutDuration.
     * @param value value to set the  AccountLockoutDuration
     */
    public void setAccountLockoutDuration(Integer value) {
        setAttributeInternal(ACCOUNTLOCKOUTDURATION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MaxAge.
     * @return the MaxAge
     */
    public Long getMaxAge() {
        return (Long) getAttributeInternal(MAXAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MaxAge.
     * @param value value to set the  MaxAge
     */
    public void setMaxAge(Long value) {
        setAttributeInternal(MAXAGE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MaxFailure.
     * @return the MaxFailure
     */
    public Integer getMaxFailure() {
        return (Integer) getAttributeInternal(MAXFAILURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MaxFailure.
     * @param value value to set the  MaxFailure
     */
    public void setMaxFailure(Integer value) {
        setAttributeInternal(MAXFAILURE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MinAge.
     * @return the MinAge
     */
    public Integer getMinAge() {
        return (Integer) getAttributeInternal(MINAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MinAge.
     * @param value value to set the  MinAge
     */
    public void setMinAge(Integer value) {
        setAttributeInternal(MINAGE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MinLength.
     * @return the MinLength
     */
    public Integer getMinLength() {
        return (Integer) getAttributeInternal(MINLENGTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MinLength.
     * @param value value to set the  MinLength
     */
    public void setMinLength(Integer value) {
        setAttributeInternal(MINLENGTH, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MustChange.
     * @return the MustChange
     */
    public Boolean getMustChange() {
        return (Boolean) getAttributeInternal(MUSTCHANGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MustChange.
     * @param value value to set the  MustChange
     */
    public void setMustChange(Boolean value) {
        setAttributeInternal(MUSTCHANGE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Name.
     * @return the Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Name.
     * @param value value to set the  Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SafeModify.
     * @return the SafeModify
     */
    public Boolean getSafeModify() {
        return (Boolean) getAttributeInternal(SAFEMODIFY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SafeModify.
     * @param value value to set the  SafeModify
     */
    public void setSafeModify(Boolean value) {
        setAttributeInternal(SAFEMODIFY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute RowStatus.
     * @return the RowStatus
     */
    public String getRowStatus() {
        return (String) getAttributeInternal(ROWSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RowStatus.
     * @param value value to set the  RowStatus
     */
    public void setRowStatus(String value) {
        setAttributeInternal(ROWSTATUS, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
