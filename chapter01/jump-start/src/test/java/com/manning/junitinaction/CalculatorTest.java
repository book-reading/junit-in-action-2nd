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
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
    }
}
