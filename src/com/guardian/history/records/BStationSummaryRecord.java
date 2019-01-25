/**
 * Copyright 2019 - All Rights Reserved.
 */
package com.guardian.history.records;

import com.guardian.enums.BHistoryTagEnum;

import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * station summary record define for history
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BStationSummaryRecord
    extends BValueHistoryRecord
{
/*-
  class BStationSummaryRecord
  {
    properties
    {
      deviceCount : long
        default {[ 0L ]}
      deviceOnlineCount : long
        default {[ 0L ]}
      deviceRunCount : long
        default {[ 0L ]}
      deviceRunMinutesInHour : long
        default {[ 0L ]}
      deviceAlarmingCount : long
        default {[ 0L ]}
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
/*@ $com.guardian.history.records.BStationSummaryRecord(1472635509)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "deviceCount"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>deviceCount</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#getDeviceCount
   * @see com.guardian.history.records.BStationSummaryRecord#setDeviceCount
   */
  public static final Property deviceCount = newProperty(0, 0L,null);
  
  /**
   * Get the <code>deviceCount</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#deviceCount
   */
  public long getDeviceCount() { return getLong(deviceCount); }
  
  /**
   * Set the <code>deviceCount</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#deviceCount
   */
  public void setDeviceCount(long v) { setLong(deviceCount,v,null); }

////////////////////////////////////////////////////////////////
// Property "deviceOnlineCount"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>deviceOnlineCount</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#getDeviceOnlineCount
   * @see com.guardian.history.records.BStationSummaryRecord#setDeviceOnlineCount
   */
  public static final Property deviceOnlineCount = newProperty(0, 0L,null);
  
  /**
   * Get the <code>deviceOnlineCount</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#deviceOnlineCount
   */
  public long getDeviceOnlineCount() { return getLong(deviceOnlineCount); }
  
  /**
   * Set the <code>deviceOnlineCount</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#deviceOnlineCount
   */
  public void setDeviceOnlineCount(long v) { setLong(deviceOnlineCount,v,null); }

////////////////////////////////////////////////////////////////
// Property "deviceRunCount"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>deviceRunCount</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#getDeviceRunCount
   * @see com.guardian.history.records.BStationSummaryRecord#setDeviceRunCount
   */
  public static final Property deviceRunCount = newProperty(0, 0L,null);
  
  /**
   * Get the <code>deviceRunCount</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#deviceRunCount
   */
  public long getDeviceRunCount() { return getLong(deviceRunCount); }
  
  /**
   * Set the <code>deviceRunCount</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#deviceRunCount
   */
  public void setDeviceRunCount(long v) { setLong(deviceRunCount,v,null); }

////////////////////////////////////////////////////////////////
// Property "deviceRunMinutesInHour"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>deviceRunMinutesInHour</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#getDeviceRunMinutesInHour
   * @see com.guardian.history.records.BStationSummaryRecord#setDeviceRunMinutesInHour
   */
  public static final Property deviceRunMinutesInHour = newProperty(0, 0L,null);
  
  /**
   * Get the <code>deviceRunMinutesInHour</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#deviceRunMinutesInHour
   */
  public long getDeviceRunMinutesInHour() { return getLong(deviceRunMinutesInHour); }
  
  /**
   * Set the <code>deviceRunMinutesInHour</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#deviceRunMinutesInHour
   */
  public void setDeviceRunMinutesInHour(long v) { setLong(deviceRunMinutesInHour,v,null); }

////////////////////////////////////////////////////////////////
// Property "deviceAlarmingCount"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>deviceAlarmingCount</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#getDeviceAlarmingCount
   * @see com.guardian.history.records.BStationSummaryRecord#setDeviceAlarmingCount
   */
  public static final Property deviceAlarmingCount = newProperty(0, 0L,null);
  
  /**
   * Get the <code>deviceAlarmingCount</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#deviceAlarmingCount
   */
  public long getDeviceAlarmingCount() { return getLong(deviceAlarmingCount); }
  
  /**
   * Set the <code>deviceAlarmingCount</code> property.
   * @see com.guardian.history.records.BStationSummaryRecord#deviceAlarmingCount
   */
  public void setDeviceAlarmingCount(long v) { setLong(deviceAlarmingCount,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BStationSummaryRecord.class);

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
    this.setDeviceCount(dataInput.readLong());
    this.setDeviceOnlineCount(dataInput.readLong());
    this.setDeviceRunCount(dataInput.readLong());
    this.setDeviceRunMinutesInHour(dataInput.readLong());
    this.setDeviceAlarmingCount(dataInput.readLong());
  }

  /**
   *
   * @param dataOutput
   * @throws IOException
   */
  protected void doWriteTrend(DataOutput dataOutput) throws IOException {
    dataOutput.writeInt(this.getTypeTag().getOrdinal());
    dataOutput.writeLong(this.getDeviceCount());
    dataOutput.writeLong(this.getDeviceOnlineCount());
    dataOutput.writeLong(this.getDeviceRunCount());
    dataOutput.writeLong(this.getDeviceRunMinutesInHour());
    dataOutput.writeLong(this.getDeviceAlarmingCount());
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
   * @param tag
   * @param deviceCount
   * @param deviceOnlineCount
   * @param deviceRunCount
   * @param deviceRunMinutes
   * @param deviceAlarmCount
   * @return
   */
  public BStationSummaryRecord set(BAbsTime timestamp,
                                   BHistoryTagEnum   tag,
                                   long   deviceCount,
                                   long   deviceOnlineCount,
                                   long   deviceRunCount,
                                   long   deviceRunMinutes,
                                   long   deviceAlarmCount)
  {
    this.setTimestamp(timestamp);
    this.setTypeTag(tag);
    this.setDeviceCount(deviceCount);
    this.setDeviceOnlineCount(deviceOnlineCount);
    this.setDeviceRunCount(deviceRunCount);
    this.setDeviceRunMinutesInHour(deviceRunMinutes);
    this.setDeviceAlarmingCount(deviceAlarmCount);
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