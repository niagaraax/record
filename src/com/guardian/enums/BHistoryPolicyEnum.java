package com.guardian.enums;

import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BHistoryPolicyEnum
 * the value record in numeric type, like:
 * average, sum, max, min, input
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BHistoryPolicyEnum
    extends
    BFrozenEnum
{
/*-
  enum BHistoryPolicyEnum
  {
    range
    {
      average,
      sum,
      max,
      min,
      input
    }
    default {[ input ]}  
  }
-*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.enums.BHistoryPolicyEnum(4283307154)1.0$ @*/
/* Generated Thu Jan 24 16:16:41 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */
  
  /** Ordinal value for average. */
  public static final int AVERAGE = 0;
  /** Ordinal value for sum. */
  public static final int SUM = 1;
  /** Ordinal value for max. */
  public static final int MAX = 2;
  /** Ordinal value for min. */
  public static final int MIN = 3;
  /** Ordinal value for input. */
  public static final int INPUT = 4;
  
  /** BHistoryPolicyEnum constant for average. */
  public static final BHistoryPolicyEnum average = new BHistoryPolicyEnum(AVERAGE);
  /** BHistoryPolicyEnum constant for sum. */
  public static final BHistoryPolicyEnum sum = new BHistoryPolicyEnum(SUM);
  /** BHistoryPolicyEnum constant for max. */
  public static final BHistoryPolicyEnum max = new BHistoryPolicyEnum(MAX);
  /** BHistoryPolicyEnum constant for min. */
  public static final BHistoryPolicyEnum min = new BHistoryPolicyEnum(MIN);
  /** BHistoryPolicyEnum constant for input. */
  public static final BHistoryPolicyEnum input = new BHistoryPolicyEnum(INPUT);

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BHistoryPolicyEnum.class);
  
  /** Factory method with ordinal. */
  public static BHistoryPolicyEnum make(int ordinal)
  {
    return (BHistoryPolicyEnum)average.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BHistoryPolicyEnum make(String tag)
  {
    return (BHistoryPolicyEnum)average.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BHistoryPolicyEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BHistoryPolicyEnum DEFAULT = input;

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  /**
   * get a user readable tag using lexicon in module with tag start with "display.enum.{TYPE}.{TAG}"
   * @param enumValue the value
   * @return a user readable text string
   */
  public static String getDisplayText(BHistoryPolicyEnum enumValue) {
    return enumValue.getLexicon().get("display.enum.historyPolicy." + enumValue.getTag(), enumValue.getTag());
  }

  /**
   * call the static function with this value
   * @return getDisplayText(this)
   */
  public String getDisplayText() {
    return BHistoryPolicyEnum.getDisplayText(this);
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