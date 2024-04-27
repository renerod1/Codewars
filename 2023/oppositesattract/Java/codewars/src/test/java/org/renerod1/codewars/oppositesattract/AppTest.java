package org.renerod1.codewars.oppositesattract;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
      public void testOddAndEven() {
        assertEquals(true, App.isLove(1, 4));
      }
      
      @Test
      public void testEvenAndEven() {
        assertEquals(false, App.isLove(2, 2));
      }
      
      @Test
      public void testOddAndOdd() {
        assertEquals(false, App.isLove(1, 1));
      }
      
      @Test
      public void testEvenAndOdd() {
        assertEquals(true, App.isLove(0, 1));
      }
}