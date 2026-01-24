package com.JUnit.BasicJUnitPrograms.TestingCalculatorClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    //Runs before each test method
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    // Test addition
    @Test
    public void testAdd() {
        assertEquals(10, calculator.add(5, 5));
    }

    // Test subtraction
    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    // Test multiplication
    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    // Test division
    @Test
    public void testDivide() {
        assertEquals(5, calculator.divide(10, 2));
    }

    // ✅ Bonus: Test division by zero
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }

}
