public class Main {

    public static void main(String[] args) {

        String value = "abc";

        try {

            int number = Integer.parseInt(value);

            System.out.println("Number: " + number);

        } catch (NumberFormatException e) {

            System.out.println("Invalid number format");

        }
    }
}