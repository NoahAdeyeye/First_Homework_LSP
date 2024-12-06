package org.howard.edu.lsp.finalexam.question1;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathUtilsTest {

    private final MathUtils mathUtils = new MathUtils();

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, mathUtils.factorial(0));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, mathUtils.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        mathUtils.factorial(-1);
    }

    @Test
    public void testIsPrimeForPrimeNumber() {
        assertTrue(mathUtils.isPrime(7));
    }

    @Test
    public void testIsPrimeForNonPrimeNumber() {
        assertFalse(mathUtils.isPrime(4));
    }

    @Test
    public void testIsPrimeForEdgeCases() {
        assertFalse(mathUtils.isPrime(1));
        assertFalse(mathUtils.isPrime(0));
        assertFalse(mathUtils.isPrime(-7));
    }

    @Test
    public void testGcdOfPositiveNumbers() {
        assertEquals(6, mathUtils.gcd(54, 24));
    }

    @Test
    public void testGcdWithZero() {
        assertEquals(10, mathUtils.gcd(10, 0));
        assertEquals(15, mathUtils.gcd(0, 15));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGcdOfZeros() {
        mathUtils.gcd(0, 0);
    }
}
