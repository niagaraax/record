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
 * alarm log define for history
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BAlarmLogRecord
    extends BHistoryRecord
{
/*-
  class BAlarmLogRecord
  {
    properties
    {
      occureTime : BAbsTime
        default {[ BAbsTime.NULL ]}
      recoverTime : BAbsTime
        default {[ BAbsTime.NULL ]}
      ackTime : BAbsTime
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
/*@ $com.guardian.history.records.BAlarmLogRecord(2084069211)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "occureTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>occureTime</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getOccureTime
   * @see com.guardian.history.records.BAlarmLogRecord#setOccureTime
   */
  public static final Property occureTime = newProperty(0, BAbsTime.NULL,null);
  
  /**
   * Get the <code>occureTime</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#occureTime
   */
  public BAbsTime getOccureTime() { return (BAbsTime)get(occureTime); }
  
  /**
   * Set the <code>occureTime</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#occureTime
   */
  public void setOccureTime(BAbsTime v) { set(occureTime,v,null); }

////////////////////////////////////////////////////////////////
// Property "recoverTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>recoverTime</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getRecoverTime
   * @see com.guardian.history.records.BAlarmLogRecord#setRecoverTime
   */
  public static final Property recoverTime = newProperty(0, BAbsTime.NULL,null);
  
  /**
   * Get the <code>recoverTime</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#recoverTime
   */
  public BAbsTime getRecoverTime() { return (BAbsTime)get(recoverTime); }
  
  /**
   * Set the <code>recoverTime</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#recoverTime
   */
  public void setRecoverTime(BAbsTime v) { set(recoverTime,v,null); }

////////////////////////////////////////////////////////////////
// Property "ackTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>ackTime</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getAckTime
   * @see com.guardian.history.records.BAlarmLogRecord#setAckTime
   */
  public static final Property ackTime = newProperty(0, BAbsTime.NULL,null);
  
  /**
   * Get the <code>ackTime</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#ackTime
   */
  public BAbsTime getAckTime() { return (BAbsTime)get(ackTime); }
  
  /**
   * Set the <code>ackTime</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#ackTime
   */
  public void setAckTime(BAbsTime v) { set(ackTime,v,null); }

////////////////////////////////////////////////////////////////
// Property "alarmUuid"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>alarmUuid</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getAlarmUuid
   * @see com.guardian.history.records.BAlarmLogRecord#setAlarmUuid
   */
  public static final Property alarmUuid = newProperty(Flags.HIDDEN, "-",null);
  
  /**
   * Get the <code>alarmUuid</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#alarmUuid
   */
  public String getAlarmUuid() { return getString(alarmUuid); }
  
  /**
   * Set the <code>alarmUuid</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#alarmUuid
   */
  public void setAlarmUuid(String v) { setString(alarmUuid,v,null); }

////////////////////////////////////////////////////////////////
// Property "sourceUuid"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>sourceUuid</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getSourceUuid
   * @see com.guardian.history.records.BAlarmLogRecord#setSourceUuid
   */
  public static final Property sourceUuid = newProperty(Flags.HIDDEN, "-",null);
  
  /**
   * Get the <code>sourceUuid</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#sourceUuid
   */
  public String getSourceUuid() { return getString(sourceUuid); }
  
  /**
   * Set the <code>sourceUuid</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#sourceUuid
   */
  public void setSourceUuid(String v) { setString(sourceUuid,v,null); }

////////////////////////////////////////////////////////////////
// Property "stationName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>stationName</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getStationName
   * @see com.guardian.history.records.BAlarmLogRecord#setStationName
   */
  public static final Property stationName = newProperty(Flags.READONLY|Flags.HIDDEN, "-",null);
  
  /**
   * Get the <code>stationName</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#stationName
   */
  public String getStationName() { return getString(stationName); }
  
  /**
   * Set the <code>stationName</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#stationName
   */
  public void setStationName(String v) { setString(stationName,v,null); }

////////////////////////////////////////////////////////////////
// Property "stationDisplayName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>stationDisplayName</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getStationDisplayName
   * @see com.guardian.history.records.BAlarmLogRecord#setStationDisplayName
   */
  public static final Property stationDisplayName = newProperty(Flags.READONLY|Flags.HIDDEN, "-",null);
  
  /**
   * Get the <code>stationDisplayName</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#stationDisplayName
   */
  public String getStationDisplayName() { return getString(stationDisplayName); }
  
  /**
   * Set the <code>stationDisplayName</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#stationDisplayName
   */
  public void setStationDisplayName(String v) { setString(stationDisplayName,v,null); }

////////////////////////////////////////////////////////////////
// Property "deviceName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>deviceName</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getDeviceName
   * @see com.guardian.history.records.BAlarmLogRecord#setDeviceName
   */
  public static final Property deviceName = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>deviceName</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#deviceName
   */
  public String getDeviceName() { return getString(deviceName); }
  
  /**
   * Set the <code>deviceName</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#deviceName
   */
  public void setDeviceName(String v) { setString(deviceName,v,null); }

////////////////////////////////////////////////////////////////
// Property "deviceDisplayName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>deviceDisplayName</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getDeviceDisplayName
   * @see com.guardian.history.records.BAlarmLogRecord#setDeviceDisplayName
   */
  public static final Property deviceDisplayName = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>deviceDisplayName</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#deviceDisplayName
   */
  public String getDeviceDisplayName() { return getString(deviceDisplayName); }
  
  /**
   * Set the <code>deviceDisplayName</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#deviceDisplayName
   */
  public void setDeviceDisplayName(String v) { setString(deviceDisplayName,v,null); }

////////////////////////////////////////////////////////////////
// Property "sourceString"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>sourceString</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getSourceString
   * @see com.guardian.history.records.BAlarmLogRecord#setSourceString
   */
  public static final Property sourceString = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>sourceString</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#sourceString
   */
  public String getSourceString() { return getString(sourceString); }
  
  /**
   * Set the <code>sourceString</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#sourceString
   */
  public void setSourceString(String v) { setString(sourceString,v,null); }

////////////////////////////////////////////////////////////////
// Property "sourceTarget"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>sourceTarget</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getSourceTarget
   * @see com.guardian.history.records.BAlarmLogRecord#setSourceTarget
   */
  public static final Property sourceTarget = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>sourceTarget</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#sourceTarget
   */
  public String getSourceTarget() { return getString(sourceTarget); }
  
  /**
   * Set the <code>sourceTarget</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#sourceTarget
   */
  public void setSourceTarget(String v) { setString(sourceTarget,v,null); }

////////////////////////////////////////////////////////////////
// Property "alarmMessage"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>alarmMessage</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getAlarmMessage
   * @see com.guardian.history.records.BAlarmLogRecord#setAlarmMessage
   */
  public static final Property alarmMessage = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>alarmMessage</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#alarmMessage
   */
  public String getAlarmMessage() { return getString(alarmMessage); }
  
  /**
   * Set the <code>alarmMessage</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#alarmMessage
   */
  public void setAlarmMessage(String v) { setString(alarmMessage,v,null); }

////////////////////////////////////////////////////////////////
// Property "alarmValue"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>alarmValue</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getAlarmValue
   * @see com.guardian.history.records.BAlarmLogRecord#setAlarmValue
   */
  public static final Property alarmValue = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>alarmValue</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#alarmValue
   */
  public String getAlarmValue() { return getString(alarmValue); }
  
  /**
   * Set the <code>alarmValue</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#alarmValue
   */
  public void setAlarmValue(String v) { setString(alarmValue,v,null); }

////////////////////////////////////////////////////////////////
// Property "limitValue"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>limitValue</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getLimitValue
   * @see com.guardian.history.records.BAlarmLogRecord#setLimitValue
   */
  public static final Property limitValue = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>limitValue</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#limitValue
   */
  public String getLimitValue() { return getString(limitValue); }
  
  /**
   * Set the <code>limitValue</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#limitValue
   */
  public void setLimitValue(String v) { setString(limitValue,v,null); }

////////////////////////////////////////////////////////////////
// Property "note"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>note</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getNote
   * @see com.guardian.history.records.BAlarmLogRecord#setNote
   */
  public static final Property note = newProperty(Flags.READONLY, "-",null);
  
  /**
   * Get the <code>note</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#note
   */
  public String getNote() { return getString(note); }
  
  /**
   * Set the <code>note</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#note
   */
  public void setNote(String v) { setString(note,v,null); }

////////////////////////////////////////////////////////////////
// Property "repeatTimes"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>repeatTimes</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#getRepeatTimes
   * @see com.guardian.history.records.BAlarmLogRecord#setRepeatTimes
   */
  public static final Property repeatTimes = newProperty(Flags.READONLY, 0L,null);
  
  /**
   * Get the <code>repeatTimes</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#repeatTimes
   */
  public long getRepeatTimes() { return getLong(repeatTimes); }
  
  /**
   * Set the <code>repeatTimes</code> property.
   * @see com.guardian.history.records.BAlarmLogRecord#repeatTimes
   */
  public void setRepeatTimes(long v) { setLong(repeatTimes,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BAlarmLogRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  public boolean isFixedSize() {
    return false;
  }

  protected void doRead(DataInput dataInput) throws IOException {
    this.setOccureTime(BAbsTime.make(dataInput.readLong()));
    this.setRecoverTime(BAbsTime.make(dataInput.readLong()));
    this.setAckTime(BAbsTime.make(dataInput.readLong()));
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
    dataOutput.writeLong(this.getRecoverTime().getMillis());
    dataOutput.writeLong(this.getAckTime().getMillis());
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
    this.setRecoverTime(record.getNormalTime());
    this.setAckTime(record.getAckTime());
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