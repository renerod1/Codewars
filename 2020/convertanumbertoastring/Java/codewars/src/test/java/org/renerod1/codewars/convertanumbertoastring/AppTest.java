package org.renerod1.codewars.convertanumbertoastring;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.Random;

public class AppTest {
  @Test
  public void basicTests() {
    assertEquals("67", App.numberToString(67));
    assertEquals("79585", App.numberToString(79585));
    assertNotEquals(79585, App.numberToString(79585));
    assertEquals("3", App.numberToString(1 + 2));
    assertEquals("-1", App.numberToString(1 - 2));
  }

  @Test
  public void randomTests() {
    Random randGen = new Random();
    System.out.println("Testing 20 random integers...");
    for (int i = 0; i < 20; i++) {
      int num = randGen.nextInt(100000);
      assertEquals("Should convert " + num + " to its correct string representation", Integer.toString(num),
          App.numberToString(num));
    }
  }
}