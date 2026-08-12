public class Main {

    public static void main(String[] args) {

        String text = "Java 123";

        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digits++;
            }

            if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("Digits = " + digits);
        System.out.println("Spaces = " + spaces);
    }
}