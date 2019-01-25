/**
 * Copyright 2019 - All Rights Reserved.
 */
package com.guardian.history.records;

import com.guardian.enums.BHistoryTagEnum;

import javax.baja.history.BTrendRecord;
import javax.baja.sys.*;

/**
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public abstract class BValueHistoryRecord
    extends BTrendRecord
{
/*-
  class BValueHistoryRecord
  {
    properties
    {
      typeTag : BHistoryTagEnum
        default {[ BHistoryTagEnum.DEFAULT ]}
    }
    actions
    {
    }
    topics
    {
    }
  }
-*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.history.records.BValueHistoryRecord(578391318)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "typeTag"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>typeTag</code> property.
   * @see com.guardian.history.records.BValueHistoryRecord#getTypeTag
   * @see com.guardian.history.records.BValueHistoryRecord#setTypeTag
   */
  public static final Property typeTag = newProperty(0, BHistoryTagEnum.DEFAULT,null);
  
  /**
   * Get the <code>typeTag</code> property.
   * @see com.guardian.history.records.BValueHistoryRecord#typeTag
   */
  public BHistoryTagEnum getTypeTag() { return (BHistoryTagEnum)get(typeTag); }
  
  /**
   * Set the <code>typeTag</code> property.
   * @see com.guardian.history.records.BValueHistoryRecord#typeTag
   */
  public void setTypeTag(BHistoryTagEnum v) { set(typeTag,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BValueHistoryRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}