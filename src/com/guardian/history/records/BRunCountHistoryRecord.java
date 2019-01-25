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
 * run count record define for device
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BRunCountHistoryRecord
    extends BValueHistoryRecord
{
/*-
  class BRunCountHistoryRecord
  {
    properties
    {
      value : boolean
        default {[ false ]}
      startCount : int
        default {[ 0 ]}
      startFrom : BAbsTime
        default {[ BAbsTime.DEFAULT ]}
      endAt : BAbsTime
        default {[ BAbsTime.DEFAULT ]}
      keptTime : BRelTime
        default {[ BRelTime.DEFAULT ]}
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
/*@ $com.guardian.history.records.BRunCountHistoryRecord(3102623460)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "value"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>value</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#getValue
   * @see com.guardian.history.records.BRunCountHistoryRecord#setValue
   */
  public static final Property value = newProperty(0, false,null);
  
  /**
   * Get the <code>value</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#value
   */
  public boolean getValue() { return getBoolean(value); }
  
  /**
   * Set the <code>value</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#value
   */
  public void setValue(boolean v) { setBoolean(value,v,null); }

////////////////////////////////////////////////////////////////
// Property "startCount"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>startCount</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#getStartCount
   * @see com.guardian.history.records.BRunCountHistoryRecord#setStartCount
   */
  public static final Property startCount = newProperty(0, 0,null);
  
  /**
   * Get the <code>startCount</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#startCount
   */
  public int getStartCount() { return getInt(startCount); }
  
  /**
   * Set the <code>startCount</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#startCount
   */
  public void setStartCount(int v) { setInt(startCount,v,null); }

////////////////////////////////////////////////////////////////
// Property "startFrom"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>startFrom</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#getStartFrom
   * @see com.guardian.history.records.BRunCountHistoryRecord#setStartFrom
   */
  public static final Property startFrom = newProperty(0, BAbsTime.DEFAULT,null);
  
  /**
   * Get the <code>startFrom</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#startFrom
   */
  public BAbsTime getStartFrom() { return (BAbsTime)get(startFrom); }
  
  /**
   * Set the <code>startFrom</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#startFrom
   */
  public void setStartFrom(BAbsTime v) { set(startFrom,v,null); }

////////////////////////////////////////////////////////////////
// Property "endAt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>endAt</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#getEndAt
   * @see com.guardian.history.records.BRunCountHistoryRecord#setEndAt
   */
  public static final Property endAt = newProperty(0, BAbsTime.DEFAULT,null);
  
  /**
   * Get the <code>endAt</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#endAt
   */
  public BAbsTime getEndAt() { return (BAbsTime)get(endAt); }
  
  /**
   * Set the <code>endAt</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#endAt
   */
  public void setEndAt(BAbsTime v) { set(endAt,v,null); }

////////////////////////////////////////////////////////////////
// Property "keptTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>keptTime</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#getKeptTime
   * @see com.guardian.history.records.BRunCountHistoryRecord#setKeptTime
   */
  public static final Property keptTime = newProperty(0, BRelTime.DEFAULT,null);
  
  /**
   * Get the <code>keptTime</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#keptTime
   */
  public BRelTime getKeptTime() { return (BRelTime)get(keptTime); }
  
  /**
   * Set the <code>keptTime</code> property.
   * @see com.guardian.history.records.BRunCountHistoryRecord#keptTime
   */
  public void setKeptTime(BRelTime v) { set(keptTime,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BRunCountHistoryRecord.class);

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
    this.setStartCount(dataInput.readInt());
    this.setStartFrom(BAbsTime.make(dataInput.readLong()));
    this.setEndAt(BAbsTime.make(dataInput.readLong()));
    this.setKeptTime(BRelTime.make(dataInput.readLong()));
  }

  /**
   *
   * @param dataOutput
   * @throws IOException
   */
  protected void doWriteTrend(DataOutput dataOutput) throws IOException {
    dataOutput.writeInt(this.getTypeTag().getOrdinal());
    dataOutput.writeBoolean(this.getValue());
    dataOutput.writeInt(this.getStartCount());
    dataOutput.writeLong(this.getStartFrom().getMillis());
    dataOutput.writeLong(this.getEndAt().getMillis());
    dataOutput.writeLong(this.getKeptTime().getMillis());
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
   * @param count
   * @param startFrom
   * @return
   */
  public BRunCountHistoryRecord set(BAbsTime timestamp,
                                    BHistoryTagEnum   tag,
                                    boolean   value,
                                    int   count,
                                    BAbsTime   startFrom,
                                    BRelTime  keptTime,
                                    BStatus  status)
  {
    this.setTimestamp(timestamp);
    this.setTypeTag(tag);
    this.setValue(value);
    this.setStartCount(count);
    this.setStartFrom(startFrom);
    this.setEndAt(BAbsTime.now());
    this.setKeptTime(keptTime);
    this.setStatus(status);
    return this;
  }

  /**
   *
   * @param timestamp
   * @param tag
   * @param value
   * @param count
   * @param startFrom
   * @return
   */
  public BRunCountHistoryRecord set(BAbsTime timestamp,
                                    BHistoryTagEnum   tag,
                                    boolean   value,
                                    int   count,
                                    BAbsTime   startFrom,
                                    BAbsTime   endAt,
                                    BRelTime  keptTime,
                                    BStatus  status)
  {
    this.setTimestamp(timestamp);
    this.setTypeTag(tag);
    this.setValue(value);
    this.setStartCount(count);
    this.setStartFrom(startFrom);
    this.setEndAt(endAt);
    this.setKeptTime(keptTime);
    this.setStatus(status);
    return this;
  }

  /**
   *
   * @return
   */
  public String getValueString() {
    if(this.getValue()) {
      return this.getLexicon().get("api.json.value.runCount.value.true");
    } else {
      return this.getLexicon().get("api.json.value.runCount.value.false");
    }
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