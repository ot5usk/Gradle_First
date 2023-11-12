package org.ot5usk;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void shouldBeBelowZero() {
        assertEquals(Calculator.subtract(1,2),-1);
    }
}
