import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 20, 40, 20, 50};

        System.out.print("Enter element to find frequency: ");
        int key = sc.nextInt();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                count++;
            }

        }

        System.out.println("Frequency of " + key + " = " + count);

        sc.close();
    }
}