package com.guardian.enums;

import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BLngTagEnum
 * longitude tag : primeMeridian(0), east, west
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BLngTagEnum
    extends BFrozenEnum
{
/*-
  enum BLngTagEnum
  {
    range
    {
      primeMeridian,
      east,
      west
    }
    default {[ primeMeridian ]}  
  }
-*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.enums.BLngTagEnum(854497250)1.0$ @*/
/* Generated Thu Jan 24 16:16:41 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */
  
  /** Ordinal value for primeMeridian. */
  public static final int PRIME_MERIDIAN = 0;
  /** Ordinal value for east. */
  public static final int EAST = 1;
  /** Ordinal value for west. */
  public static final int WEST = 2;
  
  /** BLngTagEnum constant for primeMeridian. */
  public static final BLngTagEnum primeMeridian = new BLngTagEnum(PRIME_MERIDIAN);
  /** BLngTagEnum constant for east. */
  public static final BLngTagEnum east = new BLngTagEnum(EAST);
  /** BLngTagEnum constant for west. */
  public static final BLngTagEnum west = new BLngTagEnum(WEST);

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BLngTagEnum.class);
  
  /** Factory method with ordinal. */
  public static BLngTagEnum make(int ordinal)
  {
    return (BLngTagEnum)primeMeridian.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BLngTagEnum make(String tag)
  {
    return (BLngTagEnum)primeMeridian.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BLngTagEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BLngTagEnum DEFAULT = primeMeridian;

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  /**
   * a short tag for read
   * @param direct
   * @return "E""W""Zero"
   */
  public static String getDirectTag(BLngTagEnum direct) {
    if(direct.equals(BLngTagEnum.east)) {
      return "E";
    } else if(direct.equals(BLngTagEnum.west)) {
      return "W";
    } else {
      return "Zero";
    }
  }

  /**
   * get a user readable tag using lexicon in module with tag start with "display.enum.{TYPE}.{TAG}"
   * @param enumValue the value
   * @return a user readable text string
   */
  public static String getDisplayText(BLngTagEnum enumValue) {
    return enumValue.getLexicon().get("display.enum.lngTag." + enumValue.getTag(), enumValue.getTag());
  }

  /**
   * call the static function with this value
   * @return getDisplayText(this)
   */
  public String getDisplayText() {
    return BLngTagEnum.getDisplayText(this);
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