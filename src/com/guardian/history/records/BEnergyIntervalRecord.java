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
 * energy trend record define for history
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BEnergyIntervalRecord
    extends BValueHistoryRecord
{
/*-
  class BEnergyIntervalRecord
  {
    properties
    {
      endAt : BAbsTime
        default {[ BAbsTime.DEFAULT ]}
      meterRead : double
        default {[ 0.0d ]}
      cost : double
        default {[ 0.0d ]}
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
/*@ $com.guardian.history.records.BEnergyIntervalRecord(1620699663)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "endAt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>endAt</code> property.
   * @see com.guardian.history.records.BEnergyIntervalRecord#getEndAt
   * @see com.guardian.history.records.BEnergyIntervalRecord#setEndAt
   */
  public static final Property endAt = newProperty(0, BAbsTime.DEFAULT,null);
  
  /**
   * Get the <code>endAt</code> property.
   * @see com.guardian.history.records.BEnergyIntervalRecord#endAt
   */
  public BAbsTime getEndAt() { return (BAbsTime)get(endAt); }
  
  /**
   * Set the <code>endAt</code> property.
   * @see com.guardian.history.records.BEnergyIntervalRecord#endAt
   */
  public void setEndAt(BAbsTime v) { set(endAt,v,null); }

////////////////////////////////////////////////////////////////
// Property "meterRead"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>meterRead</code> property.
   * @see com.guardian.history.records.BEnergyIntervalRecord#getMeterRead
   * @see com.guardian.history.records.BEnergyIntervalRecord#setMeterRead
   */
  public static final Property meterRead = newProperty(0, 0.0d,null);
  
  /**
   * Get the <code>meterRead</code> property.
   * @see com.guardian.history.records.BEnergyIntervalRecord#meterRead
   */
  public double getMeterRead() { return getDouble(meterRead); }
  
  /**
   * Set the <code>meterRead</code> property.
   * @see com.guardian.history.records.BEnergyIntervalRecord#meterRead
   */
  public void setMeterRead(double v) { setDouble(meterRead,v,null); }

////////////////////////////////////////////////////////////////
// Property "cost"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>cost</code> property.
   * @see com.guardian.history.records.BEnergyIntervalRecord#getCost
   * @see com.guardian.history.records.BEnergyIntervalRecord#setCost
   */
  public static final Property cost = newProperty(0, 0.0d,null);
  
  /**
   * Get the <code>cost</code> property.
   * @see com.guardian.history.records.BEnergyIntervalRecord#cost
   */
  public double getCost() { return getDouble(cost); }
  
  /**
   * Set the <code>cost</code> property.
   * @see com.guardian.history.records.BEnergyIntervalRecord#cost
   */
  public void setCost(double v) { setDouble(cost,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BEnergyIntervalRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  /**
   * create method
   */
  public BEnergyIntervalRecord() {}

  /**
   * Tests whether this record type has a fixed size.  Float records
   * do have a fixed size.
   */
  public boolean isFixedSize() { return true; }

  /**
   * Read the type specific fields from the specified input.
   */
  public void doReadTrend(DataInput in) throws IOException {
    this.setTypeTag(BHistoryTagEnum.make(in.readInt()));
    this.setEndAt(BAbsTime.make(in.readLong()));
    this.setMeterRead((double) in.readFloat());
    this.setCost((double) in.readFloat());
  }

  /**
   * Write the type specific fields to the specified output.
   */
  public void doWriteTrend(DataOutput out) throws IOException {
    out.writeInt(this.getTypeTag().getOrdinal());
    out.writeLong(this.getEndAt().getMillis());
    out.writeFloat((float) this.getMeterRead());
    out.writeFloat((float) this.getCost());
  }

  /**
   * Set the values in this record.
   * @return Returns this instance with the new values set.
   */
  public BEnergyIntervalRecord set(BAbsTime timestamp,
                                   BHistoryTagEnum typeTag,
                                   double   meterRead,
                                   double   cost,
                                   BStatus  status)
  {
    this.setTimestamp(timestamp);
    this.setTypeTag(typeTag);
    this.setEndAt(timestamp);
    this.setMeterRead(meterRead);
    this.setCost(cost);
    this.setStatus(status);
    return this;
  }

  /**
   * draw curve using bill property
   */
  public Property getValueProperty() {
    return cost;
  }

  /**
   * Return <code>getValue()</code>.
   */
  public double getNumeric() {
    return getCost();
  }

  /**
   * Return <code>BFacets.NULL</code>.
   */
  public BFacets getNumericFacets() {
    return BFacets.NULL;
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