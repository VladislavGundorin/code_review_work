import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(12, calculator.add(11, 1));
    }

    @Test
    void dif() {
        assertEquals(15, calculator.dif(20, 5));
    }

    @Test
    void div() {
        assertThrows(Exception.class, () -> calculator.div(10, 0));
        assertEquals(10, calculator.div(100, 10));
    }

    @Test
    void times() {
        assertEquals(100, calculator.times(10, 10));
    }

    @Test
    void solver() {
        assertEquals(23, calculator.solver());
    }
}