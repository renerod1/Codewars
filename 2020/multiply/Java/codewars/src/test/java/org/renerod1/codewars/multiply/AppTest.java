package org.renerod1.codewars.multiply;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void basicTests() {
        assertEquals(1.0, App.multiply(1.0, 1.0), "1.0 * 1.0 == 1.0");
        assertEquals(2.0, App.multiply(2.0, 1.0), "2.0 * 1.0 == 2.0");
        assertEquals(4.0, App.multiply(2.0, 2.0), "2.0 * 2.0 == 4.0");
        assertEquals(15.0, App.multiply(3.0, 5.0), "3.0 * 5.0 == 15.0");
        assertEquals(0.25, App.multiply(0.5, 0.5), "0.5 * 0.5 == 0.25");
        assertEquals(0.0, App.multiply(5.0, 0.0), "5.0 * 0.0 == 0.0");
        assertEquals(0.0, App.multiply(0.0, 5.0), "0.0 * 5.0 == 0.0");
        assertEquals(0.0, App.multiply(0.0, 0.0), "0.0 * 0.0 == 0.0");
    }

    @Test
    public void testAssociativityOfMultiplication() {
        for (int i = 0; i < 100; i++) {
            Double a = Math.random();
            Double b = Math.random();
            Double c = Math.random();
            String message = String.format("(%g * %g) * %g == %g * (%g * %g)", a, b, c, a, b, c);
            assertEquals(
                    App.multiply(App.multiply(a, b), c),
                    App.multiply(a, App.multiply(b, c)),
                    1E-14,
                    message);
        }
    }
}