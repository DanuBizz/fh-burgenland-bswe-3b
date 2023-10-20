package io.muehlbachler.bswe3b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private CalculatorService calc = new CalculatorService();

    @Test
    public void testDividePositiveNumberNoRest() {
        assertEquals(1, calc.divide(1, 1), "1/1 should be 1");
    }

    @Test
    public void testDividePositiveNumberWithRest(){
        assertEquals(0, calc.divide(1,2), "1/2 should be 0");
    }

    @Test
    public void testDivideNegativeDivisor() {
        assertEquals(0, calc.divide(5, -2), "5/-2 should be 0");
    }

    @Test
    public void testDivideNegativeDividendAndDivisor() {
        assertEquals(0, calc.divide(-5, -2), "-5/-2 should be 0");
    }

    @Test
    public void testDivideLargeNumbers() {
        assertEquals(1, calc.divide(1_000_000, 1_000_000), "1,000,000/1,000,000 should be 1");
    }

    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals(6, calc.multiply(2, 3), "2 * 3 should be 6");
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        assertEquals(6, calc.multiply(-2, -3), "-2 * -3 should be 6");
    }

    @Test
    public void testMultiplyPositiveAndNegativeNumbers() {
        assertEquals(-6, calc.multiply(2, -3), "2 * -3 should be -6");
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0, calc.multiply(5, 0), "5 * 0 should be 0");
    }
}
