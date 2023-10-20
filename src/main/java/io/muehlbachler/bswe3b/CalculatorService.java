package io.muehlbachler.bswe3b;

import org.springframework.stereotype.Service;

/**
 * Service class for performing mathematical divisions.
 */
@Service
public class CalculatorService {
    /**
     * Performs integer division.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The result of dividing the dividend by the divisor as a double.
     *         If either the dividend or divisor is negative, the result will be 0.
     */
    public int divide(final int a, final int b) {
        int result = 0;
        if(b <= 0) {
            result = 0;
        } else {
            result = a/b;
        }
        return result;
    }

    public int multiply(final int a, final int b) {
        return a * b;
    }
}
