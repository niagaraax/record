/**
 * Copyright 2019 - All Rights Reserved.
 */
package com.guardian.history.records;

import javax.baja.history.BHistoryRecord;
import javax.baja.sys.BAbsTime;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * history of log
 * "timeStamp":STRING,  --yyyy-MM-dd hh:mm:ss
 * "logText":STRING
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BLogTrendRecord
    extends BHistoryRecord
{
/*-
  class BLogTrendRecord
  {
    properties
    {
      time : BAbsTime
        -- log time
        default {[ BAbsTime.now() ]}
      logText : String
        -- log text
        default {[ "" ]}
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
/*@ $com.guardian.history.records.BLogTrendRecord(1962977505)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "time"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>time</code> property.
   * log time
   * @see com.guardian.history.records.BLogTrendRecord#getTime
   * @see com.guardian.history.records.BLogTrendRecord#setTime
   */
  public static final Property time = newProperty(0, BAbsTime.now(),null);
  
  /**
   * Get the <code>time</code> property.
   * log time
   * @see com.guardian.history.records.BLogTrendRecord#time
   */
  public BAbsTime getTime() { return (BAbsTime)get(time); }
  
  /**
   * Set the <code>time</code> property.
   * log time
   * @see com.guardian.history.records.BLogTrendRecord#time
   */
  public void setTime(BAbsTime v) { set(time,v,null); }

////////////////////////////////////////////////////////////////
// Property "logText"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>logText</code> property.
   * log text
   * @see com.guardian.history.records.BLogTrendRecord#getLogText
   * @see com.guardian.history.records.BLogTrendRecord#setLogText
   */
  public static final Property logText = newProperty(0, "",null);
  
  /**
   * Get the <code>logText</code> property.
   * log text
   * @see com.guardian.history.records.BLogTrendRecord#logText
   */
  public String getLogText() { return getString(logText); }
  
  /**
   * Set the <code>logText</code> property.
   * log text
   * @see com.guardian.history.records.BLogTrendRecord#logText
   */
  public void setLogText(String v) { setString(logText,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BLogTrendRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  /**
   * Tests whether this record type has a fixed size. BAlarmTrendRecord have a variable size.
   * @see BHistoryRecord#isFixedSize()
   */
  public boolean isFixedSize() { return false; }


  /**
   * Read the type specific fields from the specified input.
   * @see javax.baja.history.BTrendRecord#doReadTrend(DataInput)
   */
  public void doRead(DataInput in) throws IOException {
    this.setTime(BAbsTime.make(in.readLong()));
    this.setLogText(in.readUTF());
  }

  /**
   * Write the type specific fields to the specified output.
   * @see javax.baja.history.BTrendRecord#doWriteTrend(DataOutput)
   */
  public void doWrite(DataOutput out) throws IOException {
    out.writeLong(this.getTime().getMillis());
    out.writeUTF(this.getLogText());
  }

  /**
   * @see javax.baja.history.BTrendRecord#getValueProperty()
   */
  public Property getValueProperty() {
    return null;
  }

  /**
   * Set the values in this record.
   * @return Returns this instance with the new values set.
   */
  public BLogTrendRecord set(BAbsTime timestamp,
                             String text) {
    this.setTime(timestamp);
    this.setLogText(text);
    return this;
  }

  /**
   * make a readable string of this record
   * @see BHistoryRecord#toString(Context)
   */
  public String toString(Context ctx) {
    StringBuffer s = new StringBuffer(64);
    s.append(super.toString(ctx));
    s.append(" timeStamp=");
    s.append(this.getTime());
    s.append(" logText=");
    s.append(this.getLogText());
    return s.toString();
  }
}