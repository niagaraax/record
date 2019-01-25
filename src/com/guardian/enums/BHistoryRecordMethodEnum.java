package com.guardian.enums;

import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BHistoryRecordMethodEnum
 * the way history is recorded : Interval or ChangeOfValue
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BHistoryRecordMethodEnum
    extends
    BFrozenEnum
{
/*-
  enum BHistoryRecordMethodEnum
  {
    range
    {
      interval,
      changeOfValue
    }
    default {[ interval ]}  
  }
-*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.enums.BHistoryRecordMethodEnum(679012385)1.0$ @*/
/* Generated Thu Jan 24 16:16:41 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */
  
  /** Ordinal value for interval. */
  public static final int INTERVAL = 0;
  /** Ordinal value for changeOfValue. */
  public static final int CHANGE_OF_VALUE = 1;
  
  /** BHistoryRecordMethodEnum constant for interval. */
  public static final BHistoryRecordMethodEnum interval = new BHistoryRecordMethodEnum(INTERVAL);
  /** BHistoryRecordMethodEnum constant for changeOfValue. */
  public static final BHistoryRecordMethodEnum changeOfValue = new BHistoryRecordMethodEnum(CHANGE_OF_VALUE);

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BHistoryRecordMethodEnum.class);
  
  /** Factory method with ordinal. */
  public static BHistoryRecordMethodEnum make(int ordinal)
  {
    return (BHistoryRecordMethodEnum)interval.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BHistoryRecordMethodEnum make(String tag)
  {
    return (BHistoryRecordMethodEnum)interval.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BHistoryRecordMethodEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BHistoryRecordMethodEnum DEFAULT = interval;

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  /**
   * get a user readable tag using lexicon in module with tag start with "display.enum.{TYPE}.{TAG}"
   * @param enumValue the value
   * @return a user readable text string
   */
  public static String getDisplayText(BHistoryRecordMethodEnum enumValue) {
    return enumValue.getLexicon().get("display.enum.historyRecordMethod." + enumValue.getTag(), enumValue.getTag());
  }

  /**
   * call the static function with this value
   * @return getDisplayText(this)
   */
  public String getDisplayText() {
    return BHistoryRecordMethodEnum.getDisplayText(this);
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