/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.thrudb.thrudex;


import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

public class Analyzer {
  public static final int STANDARD = 1;
  public static final int KEYWORD = 2;
  public static final int SIMPLE = 3;
  public static final int STOP = 4;
  public static final int WHITESPACE = 5;

  public static final IntRangeSet VALID_VALUES = new IntRangeSet(
    STANDARD, 
    KEYWORD, 
    SIMPLE, 
    STOP, 
    WHITESPACE );

  public static final Map<Integer, String> VALUES_TO_NAMES = new HashMap<Integer, String>() {{
    put(STANDARD, "STANDARD");
    put(KEYWORD, "KEYWORD");
    put(SIMPLE, "SIMPLE");
    put(STOP, "STOP");
    put(WHITESPACE, "WHITESPACE");
  }};
}