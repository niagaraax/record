/**
 * Copyright 2019 - All Rights Reserved.
 */
package com.guardian.history.records;

import javax.baja.history.BHistoryRecord;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BMessageTrendRecord
    extends BHistoryRecord
{
/*-
  class BMessageTrendRecord
  {
    properties
    {
      time : BAbsTime
        default {[ BAbsTime.now() ]}
      messageType : String
        default {[ "-" ]}
      receiverName : String
        default {[ "-" ]}
      receiverAddress : String
        default {[ "-" ]}
      messageText : String
        default {[ "-" ]}
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
/*@ $com.guardian.history.records.BMessageTrendRecord(241171409)1.0$ @*/
/* Generated Fri Jan 25 13:03:00 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "time"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>time</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#getTime
   * @see com.guardian.history.records.BMessageTrendRecord#setTime
   */
  public static final Property time = newProperty(0, BAbsTime.now(),null);
  
  /**
   * Get the <code>time</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#time
   */
  public BAbsTime getTime() { return (BAbsTime)get(time); }
  
  /**
   * Set the <code>time</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#time
   */
  public void setTime(BAbsTime v) { set(time,v,null); }

////////////////////////////////////////////////////////////////
// Property "messageType"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>messageType</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#getMessageType
   * @see com.guardian.history.records.BMessageTrendRecord#setMessageType
   */
  public static final Property messageType = newProperty(0, "-",null);
  
  /**
   * Get the <code>messageType</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#messageType
   */
  public String getMessageType() { return getString(messageType); }
  
  /**
   * Set the <code>messageType</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#messageType
   */
  public void setMessageType(String v) { setString(messageType,v,null); }

////////////////////////////////////////////////////////////////
// Property "receiverName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>receiverName</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#getReceiverName
   * @see com.guardian.history.records.BMessageTrendRecord#setReceiverName
   */
  public static final Property receiverName = newProperty(0, "-",null);
  
  /**
   * Get the <code>receiverName</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#receiverName
   */
  public String getReceiverName() { return getString(receiverName); }
  
  /**
   * Set the <code>receiverName</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#receiverName
   */
  public void setReceiverName(String v) { setString(receiverName,v,null); }

////////////////////////////////////////////////////////////////
// Property "receiverAddress"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>receiverAddress</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#getReceiverAddress
   * @see com.guardian.history.records.BMessageTrendRecord#setReceiverAddress
   */
  public static final Property receiverAddress = newProperty(0, "-",null);
  
  /**
   * Get the <code>receiverAddress</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#receiverAddress
   */
  public String getReceiverAddress() { return getString(receiverAddress); }
  
  /**
   * Set the <code>receiverAddress</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#receiverAddress
   */
  public void setReceiverAddress(String v) { setString(receiverAddress,v,null); }

////////////////////////////////////////////////////////////////
// Property "messageText"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>messageText</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#getMessageText
   * @see com.guardian.history.records.BMessageTrendRecord#setMessageText
   */
  public static final Property messageText = newProperty(0, "-",null);
  
  /**
   * Get the <code>messageText</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#messageText
   */
  public String getMessageText() { return getString(messageText); }
  
  /**
   * Set the <code>messageText</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#messageText
   */
  public void setMessageText(String v) { setString(messageText,v,null); }

////////////////////////////////////////////////////////////////
// Property "note"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>note</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#getNote
   * @see com.guardian.history.records.BMessageTrendRecord#setNote
   */
  public static final Property note = newProperty(0, "-",null);
  
  /**
   * Get the <code>note</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#note
   */
  public String getNote() { return getString(note); }
  
  /**
   * Set the <code>note</code> property.
   * @see com.guardian.history.records.BMessageTrendRecord#note
   */
  public void setNote(String v) { setString(note,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BMessageTrendRecord.class);

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
    this.setMessageType(in.readUTF());
    this.setReceiverName(in.readUTF());
    this.setReceiverAddress(in.readUTF());
    this.setMessageText(in.readUTF());
    this.setNote(in.readUTF());
  }

  /**
   * Write the type specific fields to the specified output.
   * @see javax.baja.history.BTrendRecord#doWriteTrend(DataOutput)
   */
  public void doWrite(DataOutput out) throws IOException {
    out.writeLong(this.getTime().getMillis());
    out.writeUTF(this.getMessageType());
    out.writeUTF(this.getReceiverName());
    out.writeUTF(this.getReceiverAddress());
    out.writeUTF(this.getMessageText());
    out.writeUTF(this.getNote());
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
  public BMessageTrendRecord set(BAbsTime timestamp,
                                 String msgType,
                                 String receiver,
                                 String msgToAddress,
                                 String text,
                                 String note) {
    this.setTime(timestamp);
    this.setMessageType(msgType);
    this.setReceiverName(receiver);
    this.setReceiverAddress(msgToAddress);
    this.setMessageText(text);
    this.setNote(note);
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
    s.append(" to=");
    s.append(this.getReceiverName());
    s.append("[");
    s.append(this.getReceiverAddress());
    s.append("](");
    s.append(this.getMessageType());
    s.append(")");
    return s.toString();
  }
}