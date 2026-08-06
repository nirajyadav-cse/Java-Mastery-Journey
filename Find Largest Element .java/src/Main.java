
public class Main {
    public static void main(String[] args) {

        int[] arr = {25, 10, 45, 70, 30};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

        }

        System.out.println("Largest Element = " + largest);
    }
}