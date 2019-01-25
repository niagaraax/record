/**
 * Copyright 2019 - All Rights Reserved.
 */
package com.guardian.history.records;

import com.guardian.enums.BDirectEnum;
import com.guardian.enums.BHistoryTagEnum;
import com.guardian.enums.BLatTagEnum;
import com.guardian.enums.BLngTagEnum;

import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * gps position & statue record define for history
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BGpsPositionHistoryRecord
    extends BValueHistoryRecord
{
/*-
  class BGpsPositionHistoryRecord
  {
    properties
    {
      longitude : String
        default {[ "nan" ]}
      longitudeTag : BLngTagEnum
        default {[ BLngTagEnum.east ]}
      latitude : String
        default {[ "nan" ]}
      latitudeTag : BLatTagEnum
        default {[ BLatTagEnum.north ]}
      height : String
        default {[ "nan" ]}
      speed : String
        default {[ "nan" ]}
      directAngel : double
        default {[ 0.0d ]}
      directTag : BDirectEnum
        default {[ BDirectEnum.still ]}
      updateTime : BAbsTime
        default {[ BAbsTime.DEFAULT ]}
      satelliteCount : String
        default {[ "nan" ]}
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
/*@ $com.guardian.history.records.BGpsPositionHistoryRecord(682095367)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "longitude"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>longitude</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#getLongitude
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#setLongitude
   */
  public static final Property longitude = newProperty(0, "nan",null);
  
  /**
   * Get the <code>longitude</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#longitude
   */
  public String getLongitude() { return getString(longitude); }
  
  /**
   * Set the <code>longitude</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#longitude
   */
  public void setLongitude(String v) { setString(longitude,v,null); }

////////////////////////////////////////////////////////////////
// Property "longitudeTag"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>longitudeTag</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#getLongitudeTag
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#setLongitudeTag
   */
  public static final Property longitudeTag = newProperty(0, BLngTagEnum.east,null);
  
  /**
   * Get the <code>longitudeTag</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#longitudeTag
   */
  public BLngTagEnum getLongitudeTag() { return (BLngTagEnum)get(longitudeTag); }
  
  /**
   * Set the <code>longitudeTag</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#longitudeTag
   */
  public void setLongitudeTag(BLngTagEnum v) { set(longitudeTag,v,null); }

////////////////////////////////////////////////////////////////
// Property "latitude"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>latitude</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#getLatitude
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#setLatitude
   */
  public static final Property latitude = newProperty(0, "nan",null);
  
  /**
   * Get the <code>latitude</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#latitude
   */
  public String getLatitude() { return getString(latitude); }
  
  /**
   * Set the <code>latitude</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#latitude
   */
  public void setLatitude(String v) { setString(latitude,v,null); }

////////////////////////////////////////////////////////////////
// Property "latitudeTag"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>latitudeTag</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#getLatitudeTag
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#setLatitudeTag
   */
  public static final Property latitudeTag = newProperty(0, BLatTagEnum.north,null);
  
  /**
   * Get the <code>latitudeTag</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#latitudeTag
   */
  public BLatTagEnum getLatitudeTag() { return (BLatTagEnum)get(latitudeTag); }
  
  /**
   * Set the <code>latitudeTag</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#latitudeTag
   */
  public void setLatitudeTag(BLatTagEnum v) { set(latitudeTag,v,null); }

////////////////////////////////////////////////////////////////
// Property "height"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>height</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#getHeight
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#setHeight
   */
  public static final Property height = newProperty(0, "nan",null);
  
  /**
   * Get the <code>height</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#height
   */
  public String getHeight() { return getString(height); }
  
  /**
   * Set the <code>height</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#height
   */
  public void setHeight(String v) { setString(height,v,null); }

////////////////////////////////////////////////////////////////
// Property "speed"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>speed</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#getSpeed
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#setSpeed
   */
  public static final Property speed = newProperty(0, "nan",null);
  
  /**
   * Get the <code>speed</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#speed
   */
  public String getSpeed() { return getString(speed); }
  
  /**
   * Set the <code>speed</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#speed
   */
  public void setSpeed(String v) { setString(speed,v,null); }

////////////////////////////////////////////////////////////////
// Property "directAngel"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>directAngel</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#getDirectAngel
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#setDirectAngel
   */
  public static final Property directAngel = newProperty(0, 0.0d,null);
  
  /**
   * Get the <code>directAngel</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#directAngel
   */
  public double getDirectAngel() { return getDouble(directAngel); }
  
  /**
   * Set the <code>directAngel</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#directAngel
   */
  public void setDirectAngel(double v) { setDouble(directAngel,v,null); }

////////////////////////////////////////////////////////////////
// Property "directTag"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>directTag</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#getDirectTag
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#setDirectTag
   */
  public static final Property directTag = newProperty(0, BDirectEnum.still,null);
  
  /**
   * Get the <code>directTag</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#directTag
   */
  public BDirectEnum getDirectTag() { return (BDirectEnum)get(directTag); }
  
  /**
   * Set the <code>directTag</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#directTag
   */
  public void setDirectTag(BDirectEnum v) { set(directTag,v,null); }

////////////////////////////////////////////////////////////////
// Property "updateTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>updateTime</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#getUpdateTime
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#setUpdateTime
   */
  public static final Property updateTime = newProperty(0, BAbsTime.DEFAULT,null);
  
  /**
   * Get the <code>updateTime</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#updateTime
   */
  public BAbsTime getUpdateTime() { return (BAbsTime)get(updateTime); }
  
  /**
   * Set the <code>updateTime</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#updateTime
   */
  public void setUpdateTime(BAbsTime v) { set(updateTime,v,null); }

////////////////////////////////////////////////////////////////
// Property "satelliteCount"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>satelliteCount</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#getSatelliteCount
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#setSatelliteCount
   */
  public static final Property satelliteCount = newProperty(0, "nan",null);
  
  /**
   * Get the <code>satelliteCount</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#satelliteCount
   */
  public String getSatelliteCount() { return getString(satelliteCount); }
  
  /**
   * Set the <code>satelliteCount</code> property.
   * @see com.guardian.history.records.BGpsPositionHistoryRecord#satelliteCount
   */
  public void setSatelliteCount(String v) { setString(satelliteCount,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BGpsPositionHistoryRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  public boolean isFixedSize() {
    return false;
  }

  public Property getValueProperty() {
    return null;
  }

  protected void doReadTrend(DataInput dataInput) throws IOException {
    this.setTypeTag(BHistoryTagEnum.make(dataInput.readInt()));
    this.setLongitude(dataInput.readUTF());
    this.setLongitudeTag(BLngTagEnum.make(dataInput.readInt()));
    this.setLatitude(dataInput.readUTF());
    this.setLatitudeTag(BLatTagEnum.make(dataInput.readInt()));
    this.setHeight(dataInput.readUTF());
    this.setSpeed(dataInput.readUTF());
    this.setDirectAngel(dataInput.readDouble());
    this.setDirectTag(BDirectEnum.make(dataInput.readInt()));
    this.setUpdateTime(BAbsTime.make(dataInput.readLong()));
    this.setSatelliteCount(dataInput.readUTF());
  }

  protected void doWriteTrend(DataOutput dataOutput) throws IOException {
    dataOutput.writeInt(this.getTypeTag().getOrdinal());
    dataOutput.writeUTF(this.getLongitude());
    dataOutput.writeInt(this.getLongitudeTag().getOrdinal());
    dataOutput.writeUTF(this.getLatitude());
    dataOutput.writeInt(this.getLatitudeTag().getOrdinal());
    dataOutput.writeUTF(this.getHeight());
    dataOutput.writeUTF(this.getSpeed());
    dataOutput.writeDouble(this.getDirectAngel());
    dataOutput.writeInt(this.getDirectTag().getOrdinal());
    dataOutput.writeLong(this.getUpdateTime().getMillis());
    dataOutput.writeUTF(this.getSatelliteCount());
  }

/**
 *
 * @param timestamp
 * @param typeTag
 * @param longitude
 * @param longitudeTag
 * @param latitude
 * @param latitudeTag
 * @param height
 * @param speed
 * @param directAngle
 * @param directTag
 * @param updateTime
 * @param satelliteCount
 * @return
 */
  public BGpsPositionHistoryRecord set(BAbsTime timestamp,
                                       BHistoryTagEnum typeTag,
                                       String longitude,
                                       BLngTagEnum longitudeTag,
                                       String latitude,
                                       BLatTagEnum latitudeTag,
                                       String height,
                                       String speed,
                                       double directAngle,
                                       BDirectEnum directTag,
                                       BAbsTime updateTime,
                                       String satelliteCount)
  {
    this.setTimestamp(timestamp);
    this.setTypeTag(typeTag);
    this.setLongitude(longitude);
    this.setLongitudeTag(longitudeTag);
    this.setLatitude(latitude);
    this.setLatitudeTag(latitudeTag);
    this.setHeight(height);
    this.setSpeed(speed);
    this.setDirectAngel(directAngle);
    this.setDirectTag(directTag);
    this.setUpdateTime(updateTime);
    this.setSatelliteCount(satelliteCount);
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