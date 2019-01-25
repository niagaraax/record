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
public final class BStringHistoryRecord
    extends BValueHistoryRecord
{
/*-
  class BStringHistoryRecord
  {
    properties
    {
      value : String
        default {[ "" ]}
        flags { summary }
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
/*@ $com.guardian.history.records.BStringHistoryRecord(3710664378)1.0$ @*/
/* Generated Fri Jan 25 10:51:39 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "value"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>value</code> property.
   * @see com.guardian.history.records.BStringHistoryRecord#getValue
   * @see com.guardian.history.records.BStringHistoryRecord#setValue
   */
  public static final Property value = newProperty(Flags.SUMMARY, "",null);
  
  /**
   * Get the <code>value</code> property.
   * @see com.guardian.history.records.BStringHistoryRecord#value
   */
  public String getValue() { return getString(value); }
  
  /**
   * Set the <code>value</code> property.
   * @see com.guardian.history.records.BStringHistoryRecord#value
   */
  public void setValue(String v) { setString(value,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BStringHistoryRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  /**
   *
   * @return
   */
  public boolean isFixedSize() {
    return false;
  }

  protected void doReadTrend(DataInput in) throws IOException {
    this.setTypeTag(BHistoryTagEnum.make(in.readInt()));
    this.setValue(in.readUTF());
  }

  protected void doWriteTrend(DataOutput out) throws IOException {
    out.writeInt(this.getTypeTag().getOrdinal());
    out.writeUTF(this.getValue());
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
  public BStringHistoryRecord set(BAbsTime timestamp,
                                BHistoryTagEnum tag,
                                String value,
                                BStatus  status)
  {
    this.setTimestamp(timestamp);
    this.setTypeTag(tag);
    this.setValue(value);
    this.setStatus(status);
    return this;
  }
}