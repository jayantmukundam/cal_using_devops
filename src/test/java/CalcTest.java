import org.junit.Test;

import static org.junit.Assert.*;


public class CalcTest {

    Calculator calc = new Calculator();
    private static final double delta = 1e-6;


    @Test
    public void sqrtTruePositive() {
        assertEquals("Finding square root for True Positive", 6.0, calc.findSqrt(36),delta);
    }

    @Test
    public void sqrtTrueNegative() {
        assertNotEquals("Finding square root for True Negative", 6.0, calc.findSqrt(49),delta);
    }

}
