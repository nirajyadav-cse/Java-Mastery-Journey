
public class Main {

    static int largest(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 45, 23, 89, 34};

        int result = largest(numbers);

        System.out.println("Largest = " + result);

    }
}