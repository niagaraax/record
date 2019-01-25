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
import java.text.DecimalFormat;

/**
 * numeric point record define for history
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BNumericHistoryRecord
    extends BValueHistoryRecord
{
/*-
  class BNumericHistoryRecord
  {
    properties
    {
      value : double
        default {[ 0.0d ]}
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
/*@ $com.guardian.history.records.BNumericHistoryRecord(1684664283)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "value"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>value</code> property.
   * @see com.guardian.history.records.BNumericHistoryRecord#getValue
   * @see com.guardian.history.records.BNumericHistoryRecord#setValue
   */
  public static final Property value = newProperty(Flags.SUMMARY, 0.0d,null);
  
  /**
   * Get the <code>value</code> property.
   * @see com.guardian.history.records.BNumericHistoryRecord#value
   */
  public double getValue() { return getDouble(value); }
  
  /**
   * Set the <code>value</code> property.
   * @see com.guardian.history.records.BNumericHistoryRecord#value
   */
  public void setValue(double v) { setDouble(value,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BNumericHistoryRecord.class);

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
    this.setValue(dataInput.readDouble());
  }

  /**
   *
   * @param dataOutput
   * @throws IOException
   */
  protected void doWriteTrend(DataOutput dataOutput) throws IOException {
    dataOutput.writeInt(this.getTypeTag().getOrdinal());
    dataOutput.writeDouble(this.getValue());
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
  public BNumericHistoryRecord set(BAbsTime timestamp,
                                   BHistoryTagEnum tag,
                                   double   value,
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