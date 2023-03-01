/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {
    private Calculator calc;

    @BeforeClass
    public static void initializeEntireTestRun() {
        System.out.println("initializeEntireTestRun");

    }

    @Before
    public void setUp() {
        System.out.println("setUp");
        calc = new Calculator();

    }

    @After
    public void tearDown() {
        System.out.println("tearDown");

    }

    @AfterClass
    public static void finalizeTestRun() {
        System.out.println("finalizeTestRun");
    }

    @Test
    public void testDivide() {
        System.out.println("TestDivide");
        assertEquals(2.5, calc.divide(5,2), 0.001);
    }

    @Test
    public void testIsEven() {
        System.out.println("TestIsEven");
        assertTrue(calc.isEven(10));
        assertFalse(calc.isEven(11));

    }

    @Test
    public void testAdd() {
        System.out.println("TestAdd");
        int result = calc.add(1, 4);
        assertEquals(5, calc.add(1, 4));  // expected, actual
    }
}