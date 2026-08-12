public class Main {

    public static void main(String[] args) {

        String text = "banana";

        char target = 'a';

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Frequency of " + target + " = " + count);
    }
}