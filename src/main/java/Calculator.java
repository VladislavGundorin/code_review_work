public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) throws Exception {
        if (b != 0) {
            return a / b;
        } else {
            throw new Exception();
        }
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() throws Exception {
        return add(dif(30,10),3);
    }
}
