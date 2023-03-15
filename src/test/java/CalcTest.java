import org.junit.Test;

import static org.junit.Assert.*;


public class CalcTest {

    Calculator calc = new Calculator();
    private static final double delta = 1e-15;


    // SQUARE ROOT
    @Test
    public void sqrtTruePositive() {
        assertEquals("Finding square root for True Positive", 6.0, calc.findSqrt(36),delta);
    }

    @Test
    public void sqrtTrueNegative() {
        assertNotEquals("Finding square root for True Negative", 6.0, calc.findSqrt(49),delta);
    }

    // FACTORIAL
    @Test
    public void factorialTruePositive() {
        assertEquals("Finding factorial for True Positive", 720, calc.findFactorial(6),delta);
    }

    @Test
    public void factorialTrueNegative() {
        assertNotEquals("Finding factorial for True Negative", 2, calc.findFactorial(5),delta);
    }


    // LOG
    @Test
    public void logTruePositive() {
        assertEquals("Finding log for True Positive", 0, calc.findLog(1),delta);
    }

    @Test
    public void logTrueNegative() {
        assertNotEquals("Finding log for True Negative", 1.0, calc.findLog(2),delta);
    }


    // POWER
    @Test
    public void powerTruePositive() {
        assertEquals("Finding power for True Positive", 9.0, calc.findPower(3,2),delta);
    }

    @Test
    public void powerTrueNegative() {
        assertNotEquals("Finding power for True Negative", 64.0, calc.findPower(4,2),delta);
    }

}
