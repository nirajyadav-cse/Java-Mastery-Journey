public class Main {
    public static void main(String[] args) {

        String text = "NIRAJ";

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {

            reverse = reverse + text.charAt(i);

        }

        System.out.println("Original = " + text);
        System.out.println("Reverse = " + reverse);

    }
}