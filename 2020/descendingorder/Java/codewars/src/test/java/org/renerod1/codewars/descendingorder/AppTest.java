package org.renerod1.codewars.descendingorder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

  @Test
  public void test_01() {
      assertEquals(0, App.sortDesc(0));
  }

  @Test
  public void test_02() {
      assertEquals(1, App.sortDesc(1));
  }

  @Test
  public void test_03() {
      assertEquals(51, App.sortDesc(15));
  }

  @Test
  public void test_04() {
      assertEquals(2110, App.sortDesc(1021));
  }

  @Test
  public void test_05() {
      assertEquals(987654321, App.sortDesc(123495678));
  }
}