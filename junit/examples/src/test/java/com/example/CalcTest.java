package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    void testDivide() {
        Calc c = new Calc();
        int actual = 2;
        int expected = c.divide(10, 5);
        assertEquals(expected, actual);
    }
}
