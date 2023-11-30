import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 4);
        assertEquals(14, result, "Addition result should be 14");
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        int result = calculator.dif(10, 4);
        assertEquals(6, result, "Subtraction result should be 6");
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        int result = calculator.div(12, 3);
        assertEquals(4, result, "Division result should be 4");
    }

    @Test
    void divByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.div(10, 0),
                "Division by zero should throw ArithmeticException");
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        int result = calculator.times(10, 4);
        assertEquals(40, result, "Multiplication result should be 40");
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        int result = calculator.solver();
        assertEquals(47, result, "Solver result should be 46");
    }
}