public class Main {

    // Maximum of two numbers
    static int maximum(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Maximum of three numbers
    static int maximum(int a, int b, int c) {

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Maximum of 2 numbers = " + maximum(10, 25));

        System.out.println("Maximum of 3 numbers = " + maximum(10, 25, 15));
    }
}