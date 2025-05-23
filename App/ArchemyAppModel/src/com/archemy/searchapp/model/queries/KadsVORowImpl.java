package com.archemy.searchapp.model.queries;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 14 15:39:44 EST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class KadsVORowImpl extends ViewRowImpl {
  public static final int ENTITY_KADSEO = 0;

  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
   */
  public enum AttributesEnum {
    KadId {
      public Object get(KadsVORowImpl obj) {
        return obj.getKadId();
      }

      public void put(KadsVORowImpl obj, Object value) {
        obj.setKadId((Integer)value);
      }
    }
    ,
    KadName {
      public Object get(KadsVORowImpl obj) {
        return obj.getKadName();
      }

      public void put(KadsVORowImpl obj, Object value) {
        obj.setKadName((String)value);
      }
    }
    ,
    DomainId {
      public Object get(KadsVORowImpl obj) {
        return obj.getDomainId();
      }

      public void put(KadsVORowImpl obj, Object value) {
        obj.setDomainId((Integer)value);
      }
    }
    ,
    Kads {
      public Object get(KadsVORowImpl obj) {
        return obj.getKads();
      }

      public void put(KadsVORowImpl obj, Object value) {
        obj.setAttributeInternal(index(), value);
      }
    }
    ,
    DomainsVO1 {
      public Object get(KadsVORowImpl obj) {
        return obj.getDomainsVO1();
      }

      public void put(KadsVORowImpl obj, Object value) {
        obj.setAttributeInternal(index(), value);
      }
    }
    ;
    private static AttributesEnum[] vals = null;
    private static int firstIndex = 0;

    public abstract Object get(KadsVORowImpl object);

    public abstract void put(KadsVORowImpl object, Object value);

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
  public static final int KADID = AttributesEnum.KadId.index();
  public static final int KADNAME = AttributesEnum.KadName.index();
  public static final int DOMAINID = AttributesEnum.DomainId.index();
  public static final int KADS = AttributesEnum.Kads.index();
  public static final int DOMAINSVO1 = AttributesEnum.DomainsVO1.index();

  /**
   * This is the default constructor (do not remove).
   */
  public KadsVORowImpl() {
  }

  /**
   * Gets KadsEO entity object.
   * @return the KadsEO
   */
  public EntityImpl getKadsEO() {
    return (EntityImpl)getEntity(ENTITY_KADSEO);
  }

  /**
   * Gets the attribute value for KAD_ID using the alias name KadId.
   * @return the KAD_ID
   */
  public Integer getKadId() {
    return (Integer) getAttributeInternal(KADID);
  }

  /**
   * Sets <code>value</code> as attribute value for KAD_ID using the alias name KadId.
   * @param value value to set the KAD_ID
   */
  public void setKadId(Integer value) {
    setAttributeInternal(KADID, value);
  }

  /**
   * Gets the attribute value for KAD_NAME using the alias name KadName.
   * @return the KAD_NAME
   */
  public String getKadName() {
    return (String) getAttributeInternal(KADNAME);
  }

  /**
   * Sets <code>value</code> as attribute value for KAD_NAME using the alias name KadName.
   * @param value value to set the KAD_NAME
   */
  public void setKadName(String value) {
    setAttributeInternal(KADNAME, value);
  }

  /**
   * Gets the attribute value for DOMAIN_ID using the alias name DomainId.
   * @return the DOMAIN_ID
   */
  public Integer getDomainId() {
    return (Integer) getAttributeInternal(DOMAINID);
  }

  /**
   * Sets <code>value</code> as attribute value for DOMAIN_ID using the alias name DomainId.
   * @param value value to set the DOMAIN_ID
   */
  public void setDomainId(Integer value) {
    setAttributeInternal(DOMAINID, value);
  }

  /**
   * Gets the associated <code>RowIterator</code> using master-detail link Kads.
   */
  public RowIterator getKads() {
    return (RowIterator)getAttributeInternal(KADS);
  }

  /**
   * Gets the view accessor <code>RowSet</code> DomainsVO1.
   */
  public RowSet getDomainsVO1() {
    return (RowSet)getAttributeInternal(DOMAINSVO1);
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
}
