package com.JUnit.BasicJUnitPrograms.TestingExceptionHandling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testDivideByZeroException() {
        assertThrows(ArithmeticException.class, () -> {
            new Calculator().divide(10, 0);
        });
    }

    @Test
    void testDivideSuccess() {
        assertEquals(5, new Calculator().divide(10, 2));
    }
}
