package com.bosch.sbs.java.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();
    //Constant , pools
    @Test
    void testAdditionOfCalculatorClass() {
        assertEquals(20, Calculator.addInt(10, 10));
    }

    @Test
    void testSubtractionOfCalculatorClass() {
        assertEquals(50, Calculator.subtractInt(100, 50));
    }

    @Test
    void testDivisionOfCalculatorClass() {
       assertThrows(ArithmeticException.class, () -> Calculator.divideInt(5, 0),
               "Expecting exception.");

        assertEquals(1,calculator.divideInt(5, 0));

    }
}
