public class Main {

    public static void main(String[] args) {

        String text = "programming";

        System.out.println("Duplicate characters:");

        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);

            boolean alreadyChecked = false;

            // Check whether we already printed this character
            for (int k = 0; k < i; k++) {

                if (text.charAt(k) == current) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            int count = 0;

            // Count frequency
            for (int j = 0; j < text.length(); j++) {

                if (text.charAt(j) == current) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(current + " = " + count);
            }
        }
    }
}