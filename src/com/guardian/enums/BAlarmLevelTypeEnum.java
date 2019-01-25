package com.guardian.enums;

import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * 
 *  - Insert description here.
 *
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BAlarmLevelTypeEnum
    extends BFrozenEnum
{
/*-
  enum BAlarmLevelTypeEnum
  {
    range
    {
      emergency,
      booleanTrip,
      booleanAlarm,
      booleanWarning,
      numericHighTrip,
      numericHighAlarm,
      numericHighWarning,
      numericLowTrip,
      numericLowAlarm,
      numericLowWarning,
      enumTrip,
      enumAlarm,
      enumWarning
    }
    default {[ booleanAlarm ]}  
  }
-*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.enums.BAlarmLevelTypeEnum(946001310)1.0$ @*/
/* Generated Thu Jan 24 16:16:41 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */
  
  /** Ordinal value for emergency. */
  public static final int EMERGENCY = 0;
  /** Ordinal value for booleanTrip. */
  public static final int BOOLEAN_TRIP = 1;
  /** Ordinal value for booleanAlarm. */
  public static final int BOOLEAN_ALARM = 2;
  /** Ordinal value for booleanWarning. */
  public static final int BOOLEAN_WARNING = 3;
  /** Ordinal value for numericHighTrip. */
  public static final int NUMERIC_HIGH_TRIP = 4;
  /** Ordinal value for numericHighAlarm. */
  public static final int NUMERIC_HIGH_ALARM = 5;
  /** Ordinal value for numericHighWarning. */
  public static final int NUMERIC_HIGH_WARNING = 6;
  /** Ordinal value for numericLowTrip. */
  public static final int NUMERIC_LOW_TRIP = 7;
  /** Ordinal value for numericLowAlarm. */
  public static final int NUMERIC_LOW_ALARM = 8;
  /** Ordinal value for numericLowWarning. */
  public static final int NUMERIC_LOW_WARNING = 9;
  /** Ordinal value for enumTrip. */
  public static final int ENUM_TRIP = 10;
  /** Ordinal value for enumAlarm. */
  public static final int ENUM_ALARM = 11;
  /** Ordinal value for enumWarning. */
  public static final int ENUM_WARNING = 12;
  
  /** BAlarmLevelTypeEnum constant for emergency. */
  public static final BAlarmLevelTypeEnum emergency = new BAlarmLevelTypeEnum(EMERGENCY);
  /** BAlarmLevelTypeEnum constant for booleanTrip. */
  public static final BAlarmLevelTypeEnum booleanTrip = new BAlarmLevelTypeEnum(BOOLEAN_TRIP);
  /** BAlarmLevelTypeEnum constant for booleanAlarm. */
  public static final BAlarmLevelTypeEnum booleanAlarm = new BAlarmLevelTypeEnum(BOOLEAN_ALARM);
  /** BAlarmLevelTypeEnum constant for booleanWarning. */
  public static final BAlarmLevelTypeEnum booleanWarning = new BAlarmLevelTypeEnum(BOOLEAN_WARNING);
  /** BAlarmLevelTypeEnum constant for numericHighTrip. */
  public static final BAlarmLevelTypeEnum numericHighTrip = new BAlarmLevelTypeEnum(NUMERIC_HIGH_TRIP);
  /** BAlarmLevelTypeEnum constant for numericHighAlarm. */
  public static final BAlarmLevelTypeEnum numericHighAlarm = new BAlarmLevelTypeEnum(NUMERIC_HIGH_ALARM);
  /** BAlarmLevelTypeEnum constant for numericHighWarning. */
  public static final BAlarmLevelTypeEnum numericHighWarning = new BAlarmLevelTypeEnum(NUMERIC_HIGH_WARNING);
  /** BAlarmLevelTypeEnum constant for numericLowTrip. */
  public static final BAlarmLevelTypeEnum numericLowTrip = new BAlarmLevelTypeEnum(NUMERIC_LOW_TRIP);
  /** BAlarmLevelTypeEnum constant for numericLowAlarm. */
  public static final BAlarmLevelTypeEnum numericLowAlarm = new BAlarmLevelTypeEnum(NUMERIC_LOW_ALARM);
  /** BAlarmLevelTypeEnum constant for numericLowWarning. */
  public static final BAlarmLevelTypeEnum numericLowWarning = new BAlarmLevelTypeEnum(NUMERIC_LOW_WARNING);
  /** BAlarmLevelTypeEnum constant for enumTrip. */
  public static final BAlarmLevelTypeEnum enumTrip = new BAlarmLevelTypeEnum(ENUM_TRIP);
  /** BAlarmLevelTypeEnum constant for enumAlarm. */
  public static final BAlarmLevelTypeEnum enumAlarm = new BAlarmLevelTypeEnum(ENUM_ALARM);
  /** BAlarmLevelTypeEnum constant for enumWarning. */
  public static final BAlarmLevelTypeEnum enumWarning = new BAlarmLevelTypeEnum(ENUM_WARNING);

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BAlarmLevelTypeEnum.class);
  
  /** Factory method with ordinal. */
  public static BAlarmLevelTypeEnum make(int ordinal)
  {
    return (BAlarmLevelTypeEnum)emergency.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BAlarmLevelTypeEnum make(String tag)
  {
    return (BAlarmLevelTypeEnum)emergency.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BAlarmLevelTypeEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BAlarmLevelTypeEnum DEFAULT = booleanAlarm;

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/  

  /**
   * get a user readable tag using lexicon in module with tag start with "display.enum.{TYPE}.{TAG}"
   * @param enumValue the value
   * @return a user readable text string
   */
  public static String getDisplayText(BAlarmLevelTypeEnum enumValue) {
    return enumValue.getLexicon().get("display.enum.alarmLevelType." + enumValue.getTag(), enumValue.getTag());
  }

  /**
   * call the static function with this value
   * @return getDisplayText(this)
   */
  public String getDisplayText() {
    return BAlarmLevelTypeEnum.getDisplayText(this);
  }

  /**
   * Get a user readable version of the tag identifier.
   * @param context
   * @return this.getDisplayText()
   */
  public String getDisplayTag(Context context) {
    return this.getDisplayText();
  }

  /**
   * override toString function
   * @param context
   * @return {DISPLAY_TAG}[{TAG}]:{ORDINAL}
   */
  public String toString(Context context) {
    return this.getDisplayTag(context) + "[" + this.getTag() + "]:" + this.getOrdinal();
  }
}