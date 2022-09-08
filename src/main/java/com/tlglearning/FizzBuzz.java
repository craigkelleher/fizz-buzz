package com.tlglearning;
import java.util.EnumSet;
import java.util.Set;

// Changing class to enum.
public enum FizzBuzz {
/*  public static final String FIZZ_RESULT = "fizz";
    public static final String BUZZ_RESULT = "buzz";
    enumerated values: commas between them, can be on separate lines

    Fizz()  if we have arguments, we but them on separate lines
    Buzz;*/
    FIZZ, BUZZ;
/*  adjusting to have it return a set of 1, both, or neither of fizz and buzz
    neither: return empty set, UI will tell the user the number.
    public static String valueOf(int num){*/
  public static Set<FizzBuzz> valueOf(int num){
/*    Enum is a particular side of set (box)
      .class is an object reference here. its how we refer to objects*/
    Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class);
    //String result = "";
    if (num % 3 == 0) {
      //result += FIZZ_RESULT;
      result.add(FIZZ);
    }
    if (num % 5 == 0) {
      //result += BUZZ_RESULT;
      result.add(BUZZ);
    }
/*
    if (result.isEmpty()) {
      result = String.valueOf(num);
      // same as result += num
      // same as result = result + num
      // need to convert num to string, above do that.
    }
*/
    return result;
  }
}
