package com.manning.junitinaction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * CalculatorTest
 */
public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(1, 1);
        assertEquals(2, result, 0);
    }
}
