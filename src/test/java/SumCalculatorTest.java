

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {

    private SumCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSumWithPositiveOne() {
        assertEquals(1, calculator.sum(1));
    }
    @Test
    public void testSumWithPositiveSix() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    public void testSumWithZeroN() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }

    @Test
    public void testSumWithNegativeN() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(-5));
    }
}