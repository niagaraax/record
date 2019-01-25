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
 * alarm count record define
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BAlarmCountHistoryRecord
    extends BValueHistoryRecord
{
/*-
  class BAlarmCountHistoryRecord
  {
    properties
    {
      value : boolean
        default {[ false ]}
      count : int
        default {[ 0 ]}
      startFrom : BAbsTime
        default {[ BAbsTime.DEFAULT ]}
      EndAt : BAbsTime
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
/*@ $com.guardian.history.records.BAlarmCountHistoryRecord(4206302254)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "value"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>value</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#getValue
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#setValue
   */
  public static final Property value = newProperty(0, false,null);
  
  /**
   * Get the <code>value</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#value
   */
  public boolean getValue() { return getBoolean(value); }
  
  /**
   * Set the <code>value</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#value
   */
  public void setValue(boolean v) { setBoolean(value,v,null); }

////////////////////////////////////////////////////////////////
// Property "count"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>count</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#getCount
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#setCount
   */
  public static final Property count = newProperty(0, 0,null);
  
  /**
   * Get the <code>count</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#count
   */
  public int getCount() { return getInt(count); }
  
  /**
   * Set the <code>count</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#count
   */
  public void setCount(int v) { setInt(count,v,null); }

////////////////////////////////////////////////////////////////
// Property "startFrom"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>startFrom</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#getStartFrom
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#setStartFrom
   */
  public static final Property startFrom = newProperty(0, BAbsTime.DEFAULT,null);
  
  /**
   * Get the <code>startFrom</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#startFrom
   */
  public BAbsTime getStartFrom() { return (BAbsTime)get(startFrom); }
  
  /**
   * Set the <code>startFrom</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#startFrom
   */
  public void setStartFrom(BAbsTime v) { set(startFrom,v,null); }

////////////////////////////////////////////////////////////////
// Property "EndAt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>EndAt</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#getEndAt
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#setEndAt
   */
  public static final Property EndAt = newProperty(0, BAbsTime.DEFAULT,null);
  
  /**
   * Get the <code>EndAt</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#EndAt
   */
  public BAbsTime getEndAt() { return (BAbsTime)get(EndAt); }
  
  /**
   * Set the <code>EndAt</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#EndAt
   */
  public void setEndAt(BAbsTime v) { set(EndAt,v,null); }

////////////////////////////////////////////////////////////////
// Property "keptTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>keptTime</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#getKeptTime
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#setKeptTime
   */
  public static final Property keptTime = newProperty(0, BRelTime.DEFAULT,null);
  
  /**
   * Get the <code>keptTime</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#keptTime
   */
  public BRelTime getKeptTime() { return (BRelTime)get(keptTime); }
  
  /**
   * Set the <code>keptTime</code> property.
   * @see com.guardian.history.records.BAlarmCountHistoryRecord#keptTime
   */
  public void setKeptTime(BRelTime v) { set(keptTime,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BAlarmCountHistoryRecord.class);

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
    this.setCount(dataInput.readInt());
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
    dataOutput.writeInt(this.getCount());
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
  public BAlarmCountHistoryRecord set(BAbsTime timestamp,
                                      BHistoryTagEnum   tag,
                                      boolean   value,
                                      int   count,
                                      BAbsTime   startFrom,
                                      BRelTime   keptTime,
                                      BStatus  status)
  {
    this.setTimestamp(timestamp);
    this.setTypeTag(tag);
    this.setValue(value);
    this.setCount(count);
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
  public BAlarmCountHistoryRecord set(BAbsTime timestamp,
                                      BHistoryTagEnum   tag,
                                      boolean   value,
                                      int   count,
                                      BAbsTime   startFrom,
                                      BAbsTime   endAt,
                                      BRelTime   keptTime,
                                      BStatus  status)
  {
    this.setTimestamp(timestamp);
    this.setTypeTag(tag);
    this.setValue(value);
    this.setCount(count);
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
      return this.getLexicon().get("api.json.value.alarmCount.value.true");
    } else {
      return this.getLexicon().get("api.json.value.alarmCount.value.false");
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