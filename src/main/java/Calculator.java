public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is undefined");
        }
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        int x = 10;
        int y = 4;
        int z = 3;

        int result = add(times(x, y), dif(x, z));

        return result;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(10, 4));
        System.out.println("Subtraction: " + calculator.dif(10, 4));
        System.out.println("Division: " + calculator.div(12, 3));
        System.out.println("Multiplication: " + calculator.times(10, 4));
        System.out.println("Solver result: " + calculator.solver());
    }
}