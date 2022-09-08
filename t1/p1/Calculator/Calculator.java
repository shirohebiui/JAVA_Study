package t1.p1.Calculator;

class Calculator {
    int result;

    public void add(int a, int b) {
        result = a + b;
    }

    public void sub(int a, int b) {
        result = a - b;
    }

    public void mul(int a, int b) {
        result = a * b;
    }

    public void div(int a, int b) {
        if (b != 0) {
            result = a / b;
        } else {
            result = 0;
        }
    }
}