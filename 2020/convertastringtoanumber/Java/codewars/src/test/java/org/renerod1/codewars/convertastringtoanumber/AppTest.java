package org.renerod1.codewars.convertastringtoanumber;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
  @Test
  public void test1() {
    assertEquals("stringToNumber(1234)", 1234, App.stringToNumber("1234"));
  }

  @Test
  public void test2() {
    assertEquals("stringToNumber(605)", 605, App.stringToNumber("605"));
  }

  @Test
  public void test3() {
    assertEquals("stringToNumber(1405)", 1405, App.stringToNumber("1405"));
  }

  @Test
  public void test4() {
    assertEquals("stringToNumber(-7)", -7, App.stringToNumber("-7"));
  }

  @Test
  public void test5() {
    for (int i = 0; i < 100; ++i) {
      int t = (int) Math.round(Math.random() * 500000);
      assertEquals("stringToNumber(" + t + ")", t, App.stringToNumber(Integer.toString(t)));
    }
  }
}