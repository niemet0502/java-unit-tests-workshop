// CalculatorTest.java

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, Calculator.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, Calculator.multiply(5, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, Calculator.divide(6, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        Calculator.divide(5, 0);
    }
}
