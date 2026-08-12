public class Main {

    public static void main(String[] args) {

        String text = "Java is easy";

        int words = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        // Number of words = spaces + 1
        words = words + 1;

        System.out.println("Number of words = " + words);
    }
}
