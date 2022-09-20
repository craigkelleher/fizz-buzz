package com.tlglearning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.Set;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void valueOf_fizz() {
    //assert stmt that if boolean condition is false, this stmt will throw assertion error
    //assert Set.of(FizzBuzz.FIZZ).equals(FizzBuzz.valueOf(6));3
    //compare first value, fizz, against a method invocation or we aren't testing a method
    assertEquals(Set.of(FizzBuzz.FIZZ), FizzBuzz.valueOf(6));
    assertEquals(Set.of(FizzBuzz.FIZZ), FizzBuzz.valueOf(9));
  }

  @Test
  void valueOf_buzz() {
    //equal method is for comparing quality of state.
    assertEquals(Set.of(FizzBuzz.BUZZ), FizzBuzz.valueOf(10));
  }

  @Test
  void valueOf_fizzBuzz(){
    assertEquals(Set.of(FizzBuzz.FIZZ, FizzBuzz.BUZZ), FizzBuzz.valueOf(15));
  }

  @Test
  void valueOf_none(){
    //assertEquals(Set.of());
    assertEquals(Set.of(), FizzBuzz.valueOf(11));
  }
}