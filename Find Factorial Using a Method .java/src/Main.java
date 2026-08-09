public class Main {

    static int factorial(int number) {

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        int result = factorial(5);

        System.out.println("Factorial = " + result);

    }
}