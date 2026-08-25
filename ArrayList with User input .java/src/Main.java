import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter number: ");
            int number = sc.nextInt();

            numbers.add(number);
        }

        System.out.println("Numbers: " + numbers);

        sc.close();
    }
}