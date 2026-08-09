public class Main {

    static boolean isEven(int number) {

        return number % 2 == 0;
    }

    public static void main(String[] args) {

        int number = 15;

        if (isEven(number)) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

    }
}