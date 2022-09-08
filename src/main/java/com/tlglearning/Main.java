package com.tlglearning;

import java.util.Set;

public class Main {

  public static void main(String[] args) {
    int i = 1;
    do {
      //String value =FizzBuzz.valueOf(i);
      Set<FizzBuzz> value =FizzBuzz.valueOf(i);
      //%d integer expressed in base 10 format
      System.out.printf("%d: %s%n",i, value);
/*      if (value.equals("fizzbuzz")){
        break;
      }*/

      i++;
    } while (i <= 100);
  }
}
