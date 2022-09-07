package com.tlglearning;

public class Main {

  public static void main(String[] args) {
    int i = 1;
    do {
      String value =FizzBuzz.valueOf(i);
      System.out.println(value);
      if (value.equals("fizzbuzz")){
        break;
      }
      i++;
    } while (i <= 100);
  }
}
