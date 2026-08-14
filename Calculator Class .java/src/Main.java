class Calculator {

    void add(int a, int b) {

        System.out.println("Addition = " + (a + b));
    }

    void subtract(int a, int b) {

        System.out.println("Subtraction = " + (a - b));
    }

    void multiply(int a, int b) {

        System.out.println("Multiplication = " + (a * b));
    }

    void divide(int a, int b) {

        System.out.println("Division = " + ((double) a / b));
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        c1.add(20, 10);
        c1.subtract(20, 10);
        c1.multiply(20, 10);
        c1.divide(20, 10);

    }
}