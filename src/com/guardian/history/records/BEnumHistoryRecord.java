/**
 * Copyright 2019 - All Rights Reserved.
 */
package com.guardian.history.records;

import com.guardian.enums.BHistoryTagEnum;

import javax.baja.status.BStatus;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * boolean point record define for history
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BEnumHistoryRecord
    extends BValueHistoryRecord
{
/*-
  class BEnumHistoryRecord
  {
    properties
    {
      value : BDynamicEnum
        default {[ BDynamicEnum.DEFAULT ]}
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
/*@ $com.guardian.history.records.BEnumHistoryRecord(2440943275)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "value"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>value</code> property.
   * @see com.guardian.history.records.BEnumHistoryRecord#getValue
   * @see com.guardian.history.records.BEnumHistoryRecord#setValue
   */
  public static final Property value = newProperty(0, BDynamicEnum.DEFAULT,null);
  
  /**
   * Get the <code>value</code> property.
   * @see com.guardian.history.records.BEnumHistoryRecord#value
   */
  public BDynamicEnum getValue() { return (BDynamicEnum)get(value); }
  
  /**
   * Set the <code>value</code> property.
   * @see com.guardian.history.records.BEnumHistoryRecord#value
   */
  public void setValue(BDynamicEnum v) { set(value,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BEnumHistoryRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  /**
   *
   * @return
   */
  public boolean isFixedSize() {
    return true;
  }

  protected void doReadTrend(DataInput in) throws IOException {
    this.setTypeTag(BHistoryTagEnum.make(in.readInt()));
    this.setValue(BDynamicEnum.make(in.readInt()));
  }

  protected void doWriteTrend(DataOutput out) throws IOException {
    out.writeInt(this.getTypeTag().getOrdinal());
    out.writeInt(this.getValue().getOrdinal());
  }

  /**
   *
   * @return
   */
  public Property getValueProperty() {
    return value;
  }

  /**
   *
   * @param timestamp
   * @param tag
   * @param value
   * @param status
   * @return
   */
  public BEnumHistoryRecord set(BAbsTime timestamp,
                                   BHistoryTagEnum tag,
                                   BDynamicEnum value,
                                   BStatus  status)
  {
    this.setTimestamp(timestamp);
    this.setTypeTag(tag);
    this.setValue(value);
    this.setStatus(status);
    return this;
  }
}