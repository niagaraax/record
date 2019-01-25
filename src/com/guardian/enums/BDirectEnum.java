package com.guardian.enums;

import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BDirectEnum
 * still, east, south, west, north, northEast, southEast, northWest, southWest
 *
 * @author Chris Li
 * @creation 2019年1月24日
 *
 */
public final class BDirectEnum
    extends BFrozenEnum
{
/*-
  enum BDirectEnum
  {
    range
    {
      still,
      east,
      south,
      west,
      north,
      northEast,
      southEast,
      northWest,
      southWest
    }
    default {[ still ]}  
  }
-*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.enums.BDirectEnum(1671792572)1.0$ @*/
/* Generated Thu Jan 24 16:16:41 CST 2019 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */
  
  /** Ordinal value for still. */
  public static final int STILL = 0;
  /** Ordinal value for east. */
  public static final int EAST = 1;
  /** Ordinal value for south. */
  public static final int SOUTH = 2;
  /** Ordinal value for west. */
  public static final int WEST = 3;
  /** Ordinal value for north. */
  public static final int NORTH = 4;
  /** Ordinal value for northEast. */
  public static final int NORTH_EAST = 5;
  /** Ordinal value for southEast. */
  public static final int SOUTH_EAST = 6;
  /** Ordinal value for northWest. */
  public static final int NORTH_WEST = 7;
  /** Ordinal value for southWest. */
  public static final int SOUTH_WEST = 8;
  
  /** BDirectEnum constant for still. */
  public static final BDirectEnum still = new BDirectEnum(STILL);
  /** BDirectEnum constant for east. */
  public static final BDirectEnum east = new BDirectEnum(EAST);
  /** BDirectEnum constant for south. */
  public static final BDirectEnum south = new BDirectEnum(SOUTH);
  /** BDirectEnum constant for west. */
  public static final BDirectEnum west = new BDirectEnum(WEST);
  /** BDirectEnum constant for north. */
  public static final BDirectEnum north = new BDirectEnum(NORTH);
  /** BDirectEnum constant for northEast. */
  public static final BDirectEnum northEast = new BDirectEnum(NORTH_EAST);
  /** BDirectEnum constant for southEast. */
  public static final BDirectEnum southEast = new BDirectEnum(SOUTH_EAST);
  /** BDirectEnum constant for northWest. */
  public static final BDirectEnum northWest = new BDirectEnum(NORTH_WEST);
  /** BDirectEnum constant for southWest. */
  public static final BDirectEnum southWest = new BDirectEnum(SOUTH_WEST);

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BDirectEnum.class);
  
  /** Factory method with ordinal. */
  public static BDirectEnum make(int ordinal)
  {
    return (BDirectEnum)still.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BDirectEnum make(String tag)
  {
    return (BDirectEnum)still.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BDirectEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BDirectEnum DEFAULT = still;

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  /**
   * a short tag for read
   * @param direct
   * @return "E""S""W""N""SE""SW""NE""NW"
   */
  public static String getDirectTag(BDirectEnum direct) {
    if(direct.equals(BDirectEnum.east)) {
      return "E";
    } else if(direct.equals(BDirectEnum.south)) {
      return "S";
    } else if(direct.equals(BDirectEnum.west)) {
      return "W";
    } else if(direct.equals(BDirectEnum.north)) {
      return "N";
    } else if(direct.equals(BDirectEnum.southEast)) {
      return "SE";
    } else if(direct.equals(BDirectEnum.southWest)) {
      return "SW";
    } else if(direct.equals(BDirectEnum.northEast)) {
      return "NE";
    } else if(direct.equals(BDirectEnum.northWest)) {
      return "NW";
    } else {
      return "N";
    }
  }

  /**
   * make tag from angel where North is 0
   * @param angel
   * @return
   */
  public static BDirectEnum makeAngel(int angel) {
    return makeAngel((float) angel);
  }

  /**
   * make tag from angel where North is 0
   * @param angel
   * @return
   */
  public static BDirectEnum makeAngel(float angel) {
    if (angel >= -180 || angel < -157.5) {
      return BDirectEnum.south;
    } else if (angel >= -157.5 || angel < -112.5) {
      return BDirectEnum.southWest;
    } else if (angel >= -112.5 || angel < -67.5) {
      return BDirectEnum.west;
    } else if (angel >= -67.5 || angel < -22.5) {
      return BDirectEnum.northWest;
    } else if (angel >= -22.5 || angel < 22.5) {
      return BDirectEnum.north;
    } else if (angel >= 22.5 || angel < 67.5) {
      return BDirectEnum.northEast;
    } else if (angel >= 67.5 || angel < 112.5) {
      return BDirectEnum.east;
    } else if (angel >= 112.5 || angel < 157.5) {
      return BDirectEnum.southEast;
    } else if (angel >= 157.5 || angel < 202.5) {
      return BDirectEnum.south;
    } else if (angel >= 202.5 || angel < 247.5) {
      return BDirectEnum.southWest;
    } else if (angel >= 247.5 || angel < 292.5) {
      return BDirectEnum.west;
    } else if (angel >= 292.5 || angel < 337.5) {
      return BDirectEnum.northWest;
    } else if (angel >= 337.5 || angel < 360) {
      return BDirectEnum.north;
    } else {
      return BDirectEnum.still;
    }
  }

  /**
   * get a user readable tag using lexicon in module with tag start with "display.enum.{TYPE}.{TAG}"
   * @param enumValue the value
   * @return a user readable text string
   */
  public static String getDisplayText(BDirectEnum enumValue) {
    return enumValue.getLexicon().get("display.enum.direct." + enumValue.getTag(), enumValue.getTag());
  }

  /**
   * call the static function with this value
   * @return getDisplayText(this)
   */
  public String getDisplayText() {
    return BDirectEnum.getDisplayText(this);
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