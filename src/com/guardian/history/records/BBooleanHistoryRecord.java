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
public final class BBooleanHistoryRecord
    extends BValueHistoryRecord
{
/*-
  class BBooleanHistoryRecord
  {
    properties
    {
      value : boolean
        default {[ false ]}
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
/*@ $com.guardian.history.records.BBooleanHistoryRecord(3254211346)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "value"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>value</code> property.
   * @see com.guardian.history.records.BBooleanHistoryRecord#getValue
   * @see com.guardian.history.records.BBooleanHistoryRecord#setValue
   */
  public static final Property value = newProperty(Flags.SUMMARY, false,null);
  
  /**
   * Get the <code>value</code> property.
   * @see com.guardian.history.records.BBooleanHistoryRecord#value
   */
  public boolean getValue() { return getBoolean(value); }
  
  /**
   * Set the <code>value</code> property.
   * @see com.guardian.history.records.BBooleanHistoryRecord#value
   */
  public void setValue(boolean v) { setBoolean(value,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BBooleanHistoryRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  /**
   *
   * @return
   */
  public boolean isFixedSize() {
    return true;
  }

  /**
   *
   * @param dataInput
   * @throws IOException
   */
  protected void doReadTrend(DataInput dataInput) throws IOException {
    this.setTypeTag(BHistoryTagEnum.make(dataInput.readInt()));
    this.setValue(dataInput.readBoolean());
  }

  /**
   *
   * @param dataOutput
   * @throws IOException
   */
  protected void doWriteTrend(DataOutput dataOutput) throws IOException {
    dataOutput.writeInt(this.getTypeTag().getOrdinal());
    dataOutput.writeBoolean(this.getValue());
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
   * @return
   */
  public BBooleanHistoryRecord set(BAbsTime timestamp,
                                   BHistoryTagEnum   tag,
                                   boolean   value,
                                   BStatus  status)
  {
    this.setTimestamp(timestamp);
    this.setTypeTag(tag);
    this.setValue(value);
    this.setStatus(status);
    return this;
  }

  /**
   *
   * @param tag
   * @return
   */
  public boolean fitTag(BHistoryTagEnum tag) {
    return this.getTypeTag().equals(tag);
  }
}