/**
 * Copyright 2019 - All Rights Reserved.
 */
package com.guardian.history.records;

import com.guardian.enums.BHistoryTagEnum;
import com.guardian.enums.BLogTypeEnum;

import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * device summary define for history
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BDeviceSummaryRecord
    extends BValueHistoryRecord
{
/*-
  class BDeviceSummaryRecord
  {
    properties
    {
      deviceLogTag : BLogTypeEnum
        default {[ BLogTypeEnum.modify ]}
      startTime : BAbsTime
        default {[ BAbsTime.DEFAULT ]}
      endTime : BAbsTime
        default {[ BAbsTime.DEFAULT ]}
      holdTime : BRelTime
        default {[ BRelTime.DEFAULT ]}
      note : String
        default {[ "-" ]}
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
/*@ $com.guardian.history.records.BDeviceSummaryRecord(110057696)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "deviceLogTag"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>deviceLogTag</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#getDeviceLogTag
   * @see com.guardian.history.records.BDeviceSummaryRecord#setDeviceLogTag
   */
  public static final Property deviceLogTag = newProperty(0, BLogTypeEnum.modify,null);
  
  /**
   * Get the <code>deviceLogTag</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#deviceLogTag
   */
  public BLogTypeEnum getDeviceLogTag() { return (BLogTypeEnum)get(deviceLogTag); }
  
  /**
   * Set the <code>deviceLogTag</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#deviceLogTag
   */
  public void setDeviceLogTag(BLogTypeEnum v) { set(deviceLogTag,v,null); }

////////////////////////////////////////////////////////////////
// Property "startTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>startTime</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#getStartTime
   * @see com.guardian.history.records.BDeviceSummaryRecord#setStartTime
   */
  public static final Property startTime = newProperty(0, BAbsTime.DEFAULT,null);
  
  /**
   * Get the <code>startTime</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#startTime
   */
  public BAbsTime getStartTime() { return (BAbsTime)get(startTime); }
  
  /**
   * Set the <code>startTime</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#startTime
   */
  public void setStartTime(BAbsTime v) { set(startTime,v,null); }

////////////////////////////////////////////////////////////////
// Property "endTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>endTime</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#getEndTime
   * @see com.guardian.history.records.BDeviceSummaryRecord#setEndTime
   */
  public static final Property endTime = newProperty(0, BAbsTime.DEFAULT,null);
  
  /**
   * Get the <code>endTime</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#endTime
   */
  public BAbsTime getEndTime() { return (BAbsTime)get(endTime); }
  
  /**
   * Set the <code>endTime</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#endTime
   */
  public void setEndTime(BAbsTime v) { set(endTime,v,null); }

////////////////////////////////////////////////////////////////
// Property "holdTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>holdTime</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#getHoldTime
   * @see com.guardian.history.records.BDeviceSummaryRecord#setHoldTime
   */
  public static final Property holdTime = newProperty(0, BRelTime.DEFAULT,null);
  
  /**
   * Get the <code>holdTime</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#holdTime
   */
  public BRelTime getHoldTime() { return (BRelTime)get(holdTime); }
  
  /**
   * Set the <code>holdTime</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#holdTime
   */
  public void setHoldTime(BRelTime v) { set(holdTime,v,null); }

////////////////////////////////////////////////////////////////
// Property "note"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>note</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#getNote
   * @see com.guardian.history.records.BDeviceSummaryRecord#setNote
   */
  public static final Property note = newProperty(0, "-",null);
  
  /**
   * Get the <code>note</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#note
   */
  public String getNote() { return getString(note); }
  
  /**
   * Set the <code>note</code> property.
   * @see com.guardian.history.records.BDeviceSummaryRecord#note
   */
  public void setNote(String v) { setString(note,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BDeviceSummaryRecord.class);

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
    this.setDeviceLogTag(BLogTypeEnum.make(dataInput.readInt()));
    this.setStartTime(BAbsTime.make(dataInput.readLong()));
    this.setEndTime(BAbsTime.make(dataInput.readLong()));
    this.setHoldTime(BRelTime.make(dataInput.readLong()));
    this.setNote(dataInput.readLine());
  }

  /**
   *
   * @param dataOutput
   * @throws IOException
   */
  protected void doWriteTrend(DataOutput dataOutput) throws IOException {
    dataOutput.writeInt(this.getTypeTag().getOrdinal());
    dataOutput.writeInt(this.getDeviceLogTag().getOrdinal());
    dataOutput.writeLong(this.getStartTime().getMillis());
    dataOutput.writeLong(this.getEndTime().getMillis());
    dataOutput.writeLong(this.getHoldTime().getMillis());
    dataOutput.writeUTF(this.getNote());
  }

  /**
   *
   * @return
   */
  public Property getValueProperty() {
      return null;
  }

  /**
   *
   * @param timestamp
   * @param historyTag
   * @param logType
   * @param startTime
   * @param endTime
   * @param note
   * @return
   */
  public BDeviceSummaryRecord set(BAbsTime timestamp,
                                  BHistoryTagEnum   historyTag,
                                  BLogTypeEnum   logType,
                                  BAbsTime   startTime,
                                  BAbsTime   endTime,
                                  String  note)
  {
    this.setTimestamp(timestamp);
    this.setTypeTag(historyTag);
    this.setDeviceLogTag(logType);
    this.setStartTime(startTime);
    this.setEndTime(endTime);
    this.setHoldTime(endTime.delta(startTime));
    this.setNote(note);
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