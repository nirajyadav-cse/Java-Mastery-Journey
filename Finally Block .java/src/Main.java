public class Main{

    public static void main(String[] args) {

        try {

            int result = 10 / 2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic error");

        } finally {

            System.out.println("Program execution completed");
        }
    }
}