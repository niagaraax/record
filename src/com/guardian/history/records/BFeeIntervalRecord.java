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
public final class BFeeIntervalRecord
    extends BValueHistoryRecord
{
/*-
  class BFeeIntervalRecord
  {
    properties
    {
      endAt : BAbsTime
        default {[ BAbsTime.DEFAULT ]}
      cost : double
        default {[ 0.0d ]}
      fee : double
        default {[ 0.0d ]}
      bill : double
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
/*@ $com.guardian.history.records.BFeeIntervalRecord(2671922476)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "endAt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>endAt</code> property.
   * @see com.guardian.history.records.BFeeIntervalRecord#getEndAt
   * @see com.guardian.history.records.BFeeIntervalRecord#setEndAt
   */
  public static final Property endAt = newProperty(0, BAbsTime.DEFAULT,null);
  
  /**
   * Get the <code>endAt</code> property.
   * @see com.guardian.history.records.BFeeIntervalRecord#endAt
   */
  public BAbsTime getEndAt() { return (BAbsTime)get(endAt); }
  
  /**
   * Set the <code>endAt</code> property.
   * @see com.guardian.history.records.BFeeIntervalRecord#endAt
   */
  public void setEndAt(BAbsTime v) { set(endAt,v,null); }

////////////////////////////////////////////////////////////////
// Property "cost"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>cost</code> property.
   * @see com.guardian.history.records.BFeeIntervalRecord#getCost
   * @see com.guardian.history.records.BFeeIntervalRecord#setCost
   */
  public static final Property cost = newProperty(0, 0.0d,null);
  
  /**
   * Get the <code>cost</code> property.
   * @see com.guardian.history.records.BFeeIntervalRecord#cost
   */
  public double getCost() { return getDouble(cost); }
  
  /**
   * Set the <code>cost</code> property.
   * @see com.guardian.history.records.BFeeIntervalRecord#cost
   */
  public void setCost(double v) { setDouble(cost,v,null); }

////////////////////////////////////////////////////////////////
// Property "fee"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>fee</code> property.
   * @see com.guardian.history.records.BFeeIntervalRecord#getFee
   * @see com.guardian.history.records.BFeeIntervalRecord#setFee
   */
  public static final Property fee = newProperty(0, 0.0d,null);
  
  /**
   * Get the <code>fee</code> property.
   * @see com.guardian.history.records.BFeeIntervalRecord#fee
   */
  public double getFee() { return getDouble(fee); }
  
  /**
   * Set the <code>fee</code> property.
   * @see com.guardian.history.records.BFeeIntervalRecord#fee
   */
  public void setFee(double v) { setDouble(fee,v,null); }

////////////////////////////////////////////////////////////////
// Property "bill"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>bill</code> property.
   * @see com.guardian.history.records.BFeeIntervalRecord#getBill
   * @see com.guardian.history.records.BFeeIntervalRecord#setBill
   */
  public static final Property bill = newProperty(0, 0.0d,null);
  
  /**
   * Get the <code>bill</code> property.
   * @see com.guardian.history.records.BFeeIntervalRecord#bill
   */
  public double getBill() { return getDouble(bill); }
  
  /**
   * Set the <code>bill</code> property.
   * @see com.guardian.history.records.BFeeIntervalRecord#bill
   */
  public void setBill(double v) { setDouble(bill,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BFeeIntervalRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  /**
   * create method
   */
  public BFeeIntervalRecord() {}

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
    this.setCost((double) in.readFloat());
    this.setFee((double) in.readFloat());
    this.setBill((double) in.readFloat());
  }

  /**
   * Write the type specific fields to the specified output.
   */
  public void doWriteTrend(DataOutput out) throws IOException {
    out.writeInt(this.getTypeTag().getOrdinal());
    out.writeLong(this.getEndAt().getMillis());
    out.writeFloat((float) this.getCost());
    out.writeFloat((float) this.getFee());
    out.writeFloat((float) this.getBill());
  }

  /**
   * Set the values in this record.
   * @return Returns this instance with the new values set.
   */
  public BFeeIntervalRecord set(BAbsTime timestamp,
                                BHistoryTagEnum typeTag,
                                double   cost,
                                double   fee,
                                double   bill,
                                BStatus  status)
  {
    this.setTimestamp(timestamp);
    this.setTypeTag(typeTag);
    this.setEndAt(timestamp);
    this.setCost(cost);
    this.setFee(fee);
    this.setBill(bill);
    return this;
  }

  /**
   * draw curve using bill property
   */
  public Property getValueProperty() {
    return bill;
  }

  /**
   * Return <code>getValue()</code>.
   */
  public double getNumeric() {
    return getBill();
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