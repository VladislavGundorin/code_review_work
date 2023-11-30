import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result, "Addition result should be 8");
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        int result = calculator.dif(5, 3);
        assertEquals(2, result, "Subtraction result should be 2");
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        int result = calculator.div(6, 2);
        assertEquals(3, result, "Division result should be 3");
    }

    @Test
    void divByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.div(6, 0),
                "Division by zero should throw ArithmeticException");
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        int result = calculator.times(5, 3);
        assertEquals(15, result, "Multiplication result should be 15");
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        int result = calculator.solver();
        assertEquals(18, result, "Solver result should be 18");
    }
}
