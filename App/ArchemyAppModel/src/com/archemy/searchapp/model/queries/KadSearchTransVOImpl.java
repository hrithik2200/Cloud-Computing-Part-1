package com.archemy.searchapp.model.queries;

import java.sql.ResultSet;

import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 10 19:58:58 EST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class KadSearchTransVOImpl extends CustomViewObjectImpl {
  /**
   * This is the default constructor (do not remove).
   */
  public KadSearchTransVOImpl() {
  }

  /**
   * executeQueryForCollection - overridden for custom java data source support.
   */
  protected void executeQueryForCollection(Object qc, Object[] params, int noUserParams) {
    super.executeQueryForCollection(qc, params, noUserParams);
  }

  /**
   * hasNextForCollection - overridden for custom java data source support.
   */
  protected boolean hasNextForCollection(Object qc) {
    boolean bRet = super.hasNextForCollection(qc);
    return bRet;
  }

  /**
   * createRowFromResultSet - overridden for custom java data source support.
   */
  protected ViewRowImpl createRowFromResultSet(Object qc, ResultSet resultSet) {
    ViewRowImpl value = super.createRowFromResultSet(qc, resultSet);
    return value;
  }

  /**
   * getQueryHitCount - overridden for custom java data source support.
   */
  public long getQueryHitCount(ViewRowSetImpl viewRowSet) {
    long value = super.getQueryHitCount(viewRowSet);
    return value;
  }
}
