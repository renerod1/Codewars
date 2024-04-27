package org.renerod1.codewars.convertbooleanvaluestostringsyesorno;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testBoolToWord() {
        assertEquals(App.boolToWord(true),"Yes");
        assertEquals(App.boolToWord(false),"No");
    }
}