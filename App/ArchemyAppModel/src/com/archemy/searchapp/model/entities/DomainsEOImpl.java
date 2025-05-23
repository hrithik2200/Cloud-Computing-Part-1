package com.archemy.searchapp.model.entities;

import oracle.jbo.Key;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 28 14:26:18 EST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DomainsEOImpl extends AutoIncrementEntityImpl {
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
   */
  public enum AttributesEnum {
    DomainId {
      public Object get(DomainsEOImpl obj) {
        return obj.getDomainId();
      }

      public void put(DomainsEOImpl obj, Object value) {
        obj.setDomainId((Integer)value);
      }
    }
    ,
    DomainName {
      public Object get(DomainsEOImpl obj) {
        return obj.getDomainName();
      }

      public void put(DomainsEOImpl obj, Object value) {
        obj.setDomainName((String)value);
      }
    }
    ,
    DomainDescription {
      public Object get(DomainsEOImpl obj) {
        return obj.getDomainDescription();
      }

      public void put(DomainsEOImpl obj, Object value) {
        obj.setDomainDescription((String)value);
      }
    }
    ;
    private static AttributesEnum[] vals = null;
    private static int firstIndex = 0;

    public abstract Object get(DomainsEOImpl object);

    public abstract void put(DomainsEOImpl object, Object value);

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
  public static final int DOMAINID = AttributesEnum.DomainId.index();
  public static final int DOMAINNAME = AttributesEnum.DomainName.index();
  public static final int DOMAINDESCRIPTION = AttributesEnum.DomainDescription.index();

  /**
   * This is the default constructor (do not remove).
   */
  public DomainsEOImpl() {
  }

  /**
   * Gets the attribute value for DomainId, using the alias name DomainId.
   * @return the value of DomainId
   */
  public Integer getDomainId() {
    return (Integer)getAttributeInternal(DOMAINID);
  }

  /**
   * Sets <code>value</code> as the attribute value for DomainId.
   * @param value value to set the DomainId
   */
  public void setDomainId(Integer value) {
    setAttributeInternal(DOMAINID, value);
  }

  /**
   * Gets the attribute value for DomainName, using the alias name DomainName.
   * @return the value of DomainName
   */
  public String getDomainName() {
    return (String)getAttributeInternal(DOMAINNAME);
  }

  /**
   * Sets <code>value</code> as the attribute value for DomainName.
   * @param value value to set the DomainName
   */
  public void setDomainName(String value) {
    setAttributeInternal(DOMAINNAME, value);
  }

  /**
   * Gets the attribute value for DomainDescription, using the alias name DomainDescription.
   * @return the value of DomainDescription
   */
  public String getDomainDescription() {
    return (String)getAttributeInternal(DOMAINDESCRIPTION);
  }

  /**
   * Sets <code>value</code> as the attribute value for DomainDescription.
   * @param value value to set the DomainDescription
   */
  public void setDomainDescription(String value) {
    setAttributeInternal(DOMAINDESCRIPTION, value);
  }

  /**
   * getAttrInvokeAccessor: generated method. Do not modify.
   * @param index the index identifying the attribute
   * @param attrDef the attribute

   * @return the attribute value
   * @throws Exception
   */
  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
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

  /**
   * @param domainId key constituent

   * @return a Key object based on given key constituents.
   */
  public static Key createPrimaryKey(Integer domainId) {
    return new Key(new Object[]{domainId});
  }

  /**
   * @return the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject() {
    return EntityDefImpl.findDefObject("com.archemy.searchapp.model.entities.DomainsEO");
  }
}
