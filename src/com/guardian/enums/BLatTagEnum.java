package com.guardian.enums;

import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BLatTagEnum
 * latitude tag : equator(0), north, south
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BLatTagEnum
    extends BFrozenEnum
{
/*-
  enum BLatTagEnum
  {
    range
    {
      equator,
      north,
      south
    }
    default {[ equator ]}  
  }
-*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.enums.BLatTagEnum(2179877431)1.0$ @*/
/* Generated Thu Jan 24 16:16:41 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */
  
  /** Ordinal value for equator. */
  public static final int EQUATOR = 0;
  /** Ordinal value for north. */
  public static final int NORTH = 1;
  /** Ordinal value for south. */
  public static final int SOUTH = 2;
  
  /** BLatTagEnum constant for equator. */
  public static final BLatTagEnum equator = new BLatTagEnum(EQUATOR);
  /** BLatTagEnum constant for north. */
  public static final BLatTagEnum north = new BLatTagEnum(NORTH);
  /** BLatTagEnum constant for south. */
  public static final BLatTagEnum south = new BLatTagEnum(SOUTH);

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BLatTagEnum.class);
  
  /** Factory method with ordinal. */
  public static BLatTagEnum make(int ordinal)
  {
    return (BLatTagEnum)equator.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BLatTagEnum make(String tag)
  {
    return (BLatTagEnum)equator.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BLatTagEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BLatTagEnum DEFAULT = equator;

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  /**
   * a short tag for read
   * @param direct
   * @return "S""N""Zero"
   */
  public static String getDirectTag(BLatTagEnum direct) {
    if(direct.equals(BLatTagEnum.south)) {
      return "S";
    } else if(direct.equals(BLatTagEnum.north)) {
      return "N";
    } else {
      return "Zero";
    }
  }

  /**
   * get a user readable tag using lexicon in module with tag start with "display.enum.{TYPE}.{TAG}"
   * @param enumValue the value
   * @return a user readable text string
   */
  public static String getDisplayText(BLatTagEnum enumValue) {
    return enumValue.getLexicon().get("display.enum.latTag." + enumValue.getTag(), enumValue.getTag());
  }

  /**
   * call the static function with this value
   * @return getDisplayText(this)
   */
  public String getDisplayText() {
    return BLatTagEnum.getDisplayText(this);
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