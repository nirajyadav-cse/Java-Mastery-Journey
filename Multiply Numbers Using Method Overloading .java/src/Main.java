public class Main {

    static int multiply(int a, int b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {

        System.out.println("Product of 2 numbers = " + multiply(5, 4));

        System.out.println("Product of 3 numbers = " + multiply(2, 3, 4));
    }
}