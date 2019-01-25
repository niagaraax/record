/**
 * Copyright 2019 - All Rights Reserved.
 */
package com.guardian.history.records;

import javax.baja.alarm.BAlarmRecord;
import javax.baja.history.BHistoryRecord;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * alarming record define for log
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BAlarmOpenRecord
    extends BHistoryRecord
{
/*-
  class BAlarmOpenRecord
  {
    properties
    {
      occureTime : BAbsTime
        default {[ BAbsTime.NULL ]}
      alarmUuid : String
        default {[ "-" ]}
        flags { hidden }
      sourceUuid : String
        default {[ "-" ]}
        flags { hidden }
      stationName : String
        default {[ "-" ]}
        flags { readonly,hidden }
      stationDisplayName : String
        default {[ "-" ]}
        flags { readonly,hidden }
      deviceName : String
        default {[ "-" ]}
        flags { readonly }
      deviceDisplayName : String
        default {[ "-" ]}
        flags { readonly }
      sourceString : String
        default {[ "-" ]}
        flags { readonly }
      sourceTarget : String
        default {[ "-" ]}
        flags { readonly }
      alarmMessage : String
        default {[ "-" ]}
        flags { readonly }
      alarmValue : String
        default {[ "-" ]}
        flags { readonly }
      limitValue : String
        default {[ "-" ]}
        flags { readonly }
      note : String
        default {[ "-" ]}
        flags { readonly }
      repeatTimes : long
        default {[ 0L ]}
        flags { readonly }
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
/*@ $com.guardian.history.records.BAlarmOpenRecord(2939257797)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "occureTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>occureTime</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#getOccureTime
   * @see com.guardian.history.records.BAlarmOpenRecord#setOccureTime
   */
  public static final Property occureTime = newProperty(0, BAbsTime.NULL,null);
  
  /**
   * Get the <code>occureTime</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#occureTime
   */
  public BAbsTime getOccureTime() { return (BAbsTime)get(occureTime); }
  
  /**
   * Set the <code>occureTime</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#occureTime
   */
  public void setOccureTime(BAbsTime v) { set(occureTime,v,null); }

////////////////////////////////////////////////////////////////
// Property "alarmUuid"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>alarmUuid</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#getAlarmUuid
   * @see com.guardian.history.records.BAlarmOpenRecord#setAlarmUuid
   */
  public static final Property alarmUuid = newProperty(Flags.HIDDEN, "-",null);
  
  /**
   * Get the <code>alarmUuid</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#alarmUuid
   */
  public String getAlarmUuid() { return getString(alarmUuid); }
  
  /**
   * Set the <code>alarmUuid</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#alarmUuid
   */
  public void setAlarmUuid(String v) { setString(alarmUuid,v,null); }

////////////////////////////////////////////////////////////////
// Property "sourceUuid"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>sourceUuid</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#getSourceUuid
   * @see com.guardian.history.records.BAlarmOpenRecord#setSourceUuid
   */
  public static final Property sourceUuid = newProperty(Flags.HIDDEN, "-",null);
  
  /**
   * Get the <code>sourceUuid</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#sourceUuid
   */
  public String getSourceUuid() { return getString(sourceUuid); }
  
  /**
   * Set the <code>sourceUuid</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#sourceUuid
   */
  public void setSourceUuid(String v) { setString(sourceUuid,v,null); }

////////////////////////////////////////////////////////////////
// Property "stationName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>stationName</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#getStationName
   * @see com.guardian.history.records.BAlarmOpenRecord#setStationName
   */
  public static final Property stationName = newProperty(Flags.READONLY|Flags.HIDDEN, "-",null);
  
  /**
   * Get the <code>stationName</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#stationName
   */
  public String getStationName() { return getString(stationName); }
  
  /**
   * Set the <code>stationName</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#stationName
   */
  public void setStationName(String v) { setString(stationName,v,null); }

////////////////////////////////////////////////////////////////
// Property "stationDisplayName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>stationDisplayName</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#getStationDisplayName
   * @see com.guardian.history.records.BAlarmOpenRecord#setStationDisplayName
   */
  public static final Property stationDisplayName = newProperty(Flags.READONLY|Flags.HIDDEN, "-",null);
  
  /**
   * Get the <code>stationDisplayName</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#stationDisplayName
   */
  public String getStationDisplayName() { return getString(stationDisplayName); }
  
  /**
   * Set the <code>stationDisplayName</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#stationDisplayName
   */
  public void setStationDisplayName(String v) { setString(stationDisplayName,v,null); }

////////////////////////////////////////////////////////////////
// Property "deviceName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>deviceName</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#getDeviceName
   * @see com.guardian.history.records.BAlarmOpenRecord#setDeviceName
   */
  public static final Property deviceName = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>deviceName</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#deviceName
   */
  public String getDeviceName() { return getString(deviceName); }
  
  /**
   * Set the <code>deviceName</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#deviceName
   */
  public void setDeviceName(String v) { setString(deviceName,v,null); }

////////////////////////////////////////////////////////////////
// Property "deviceDisplayName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>deviceDisplayName</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#getDeviceDisplayName
   * @see com.guardian.history.records.BAlarmOpenRecord#setDeviceDisplayName
   */
  public static final Property deviceDisplayName = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>deviceDisplayName</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#deviceDisplayName
   */
  public String getDeviceDisplayName() { return getString(deviceDisplayName); }
  
  /**
   * Set the <code>deviceDisplayName</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#deviceDisplayName
   */
  public void setDeviceDisplayName(String v) { setString(deviceDisplayName,v,null); }

////////////////////////////////////////////////////////////////
// Property "sourceString"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>sourceString</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#getSourceString
   * @see com.guardian.history.records.BAlarmOpenRecord#setSourceString
   */
  public static final Property sourceString = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>sourceString</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#sourceString
   */
  public String getSourceString() { return getString(sourceString); }
  
  /**
   * Set the <code>sourceString</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#sourceString
   */
  public void setSourceString(String v) { setString(sourceString,v,null); }

////////////////////////////////////////////////////////////////
// Property "sourceTarget"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>sourceTarget</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#getSourceTarget
   * @see com.guardian.history.records.BAlarmOpenRecord#setSourceTarget
   */
  public static final Property sourceTarget = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>sourceTarget</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#sourceTarget
   */
  public String getSourceTarget() { return getString(sourceTarget); }
  
  /**
   * Set the <code>sourceTarget</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#sourceTarget
   */
  public void setSourceTarget(String v) { setString(sourceTarget,v,null); }

////////////////////////////////////////////////////////////////
// Property "alarmMessage"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>alarmMessage</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#getAlarmMessage
   * @see com.guardian.history.records.BAlarmOpenRecord#setAlarmMessage
   */
  public static final Property alarmMessage = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>alarmMessage</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#alarmMessage
   */
  public String getAlarmMessage() { return getString(alarmMessage); }
  
  /**
   * Set the <code>alarmMessage</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#alarmMessage
   */
  public void setAlarmMessage(String v) { setString(alarmMessage,v,null); }

////////////////////////////////////////////////////////////////
// Property "alarmValue"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>alarmValue</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#getAlarmValue
   * @see com.guardian.history.records.BAlarmOpenRecord#setAlarmValue
   */
  public static final Property alarmValue = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>alarmValue</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#alarmValue
   */
  public String getAlarmValue() { return getString(alarmValue); }
  
  /**
   * Set the <code>alarmValue</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#alarmValue
   */
  public void setAlarmValue(String v) { setString(alarmValue,v,null); }

////////////////////////////////////////////////////////////////
// Property "limitValue"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>limitValue</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#getLimitValue
   * @see com.guardian.history.records.BAlarmOpenRecord#setLimitValue
   */
  public static final Property limitValue = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>limitValue</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#limitValue
   */
  public String getLimitValue() { return getString(limitValue); }
  
  /**
   * Set the <code>limitValue</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#limitValue
   */
  public void setLimitValue(String v) { setString(limitValue,v,null); }

////////////////////////////////////////////////////////////////
// Property "note"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>note</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#getNote
   * @see com.guardian.history.records.BAlarmOpenRecord#setNote
   */
  public static final Property note = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>note</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#note
   */
  public String getNote() { return getString(note); }
  
  /**
   * Set the <code>note</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#note
   */
  public void setNote(String v) { setString(note,v,null); }

////////////////////////////////////////////////////////////////
// Property "repeatTimes"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>repeatTimes</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#getRepeatTimes
   * @see com.guardian.history.records.BAlarmOpenRecord#setRepeatTimes
   */
  public static final Property repeatTimes = newProperty(Flags.READONLY, 0L,null);
  
  /**
   * Get the <code>repeatTimes</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#repeatTimes
   */
  public long getRepeatTimes() { return getLong(repeatTimes); }
  
  /**
   * Set the <code>repeatTimes</code> property.
   * @see com.guardian.history.records.BAlarmOpenRecord#repeatTimes
   */
  public void setRepeatTimes(long v) { setLong(repeatTimes,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BAlarmOpenRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  public boolean isFixedSize() {
    return false;
  }

  protected void doRead(DataInput dataInput) throws IOException {
    this.setOccureTime(BAbsTime.make(dataInput.readLong()));
    this.setAlarmUuid(dataInput.readUTF());
    this.setSourceUuid(dataInput.readUTF());
    this.setStationName(dataInput.readUTF());
    this.setStationDisplayName(dataInput.readUTF());
    this.setDeviceName(dataInput.readUTF());
    this.setDeviceDisplayName(dataInput.readUTF());
    this.setSourceString(dataInput.readUTF());
    this.setSourceTarget(dataInput.readUTF());
    this.setAlarmMessage(dataInput.readUTF());
    this.setAlarmValue(dataInput.readUTF());
    this.setLimitValue(dataInput.readUTF());
    this.setNote(dataInput.readUTF());
    this.setRepeatTimes(dataInput.readLong());
  }

  protected void doWrite(DataOutput dataOutput) throws IOException {
    dataOutput.writeLong(this.getOccureTime().getMillis());
    dataOutput.writeUTF(this.getAlarmUuid());
    dataOutput.writeUTF(this.getSourceUuid());
    dataOutput.writeUTF(this.getStationName());
    dataOutput.writeUTF(this.getStationDisplayName());
    dataOutput.writeUTF(this.getDeviceName());
    dataOutput.writeUTF(this.getDeviceDisplayName());
    dataOutput.writeUTF(this.getSourceString());
    dataOutput.writeUTF(this.getSourceTarget());
    dataOutput.writeUTF(this.getAlarmMessage());
    dataOutput.writeUTF(this.getAlarmValue());
    dataOutput.writeUTF(this.getLimitValue());
    dataOutput.writeUTF(this.getNote());
    dataOutput.writeLong(this.getRepeatTimes());
  }

  /**
   *
   * @param record
   */
  public void set(BAlarmRecord record) {
    this.setOccureTime(record.getTimestamp());
    this.setAlarmUuid(record.getUuid().toString());
    String v;
    try {
      v = record.getAlarmData().get(BAlarmOpenRecord.SOURCE_UUID).toString();
      this.setSourceUuid(v);
    } catch (Exception e) {}
    try {
      v = record.getAlarmData().get(BAlarmOpenRecord.STATION_NAME).toString();
      this.setStationName(v);
    } catch (Exception e) {}
    try {
      v = record.getAlarmData().get(BAlarmOpenRecord.STATION_DISPLAY_NAME).toString();
      this.setStationDisplayName(v);
    } catch (Exception e) {}
    try {
      v = record.getAlarmData().get(BAlarmOpenRecord.DEVICE_NAME).toString();
      this.setDeviceName(v);
    } catch (Exception e) {}
    try {
      v = record.getAlarmData().get(BAlarmOpenRecord.DEVICE_DISPLAY_NAME).toString();
      this.setDeviceDisplayName(v);
    } catch (Exception e) {}
    try {
      v = record.getAlarmData().get(BAlarmOpenRecord.SOURCE_STRING).toString();
      this.setSourceString(v);
    } catch (Exception e) {}
    try {
      v = record.getAlarmData().get(BAlarmOpenRecord.SOURCE_TARGET).toString();
      this.setSourceTarget(v);
    } catch (Exception e) {}
    try {
      v = record.getAlarmData().get(BAlarmOpenRecord.ALARM_MESSAGE).toString();
      this.setAlarmMessage(v);
    } catch (Exception e) {}
    try {
      v = record.getAlarmData().get(BAlarmOpenRecord.ALARM_VALUE).toString();
      this.setAlarmValue(v);
    } catch (Exception e) {}
    try {
      v = record.getAlarmData().get(BAlarmOpenRecord.LIMIT_VALUE).toString();
      this.setLimitValue(v);
    } catch (Exception e) {}
    try {
      v = record.getAlarmData().get(BAlarmOpenRecord.NOTE).toString();
      this.setNote(v);
    } catch (Exception e) {}
    try {
      v = record.getAlarmData().get(BAlarmOpenRecord.REPEAT_TIMES).toString();
      this.setRepeatTimes(Long.valueOf(v).longValue());
    } catch (Exception e) {}
  }

  public final static String SOURCE_UUID = "sourceUuid";
  public final static String STATION_NAME = "stationName";
  public final static String STATION_DISPLAY_NAME = "stationDisplayName";
  public final static String DEVICE_NAME = "deviceName";
  public final static String DEVICE_DISPLAY_NAME = "deviceDisplayName";
  public final static String SOURCE_STRING = "sourceString";
  public final static String SOURCE_TARGET = "sourceTarget";
  public final static String ALARM_MESSAGE = "alarmMessage";
  public final static String ALARM_VALUE = "alarmValue";
  public final static String LIMIT_VALUE = "limitValue";
  public final static String NOTE = "note";
  public final static String REPEAT_TIMES = "repeatTimes";
}