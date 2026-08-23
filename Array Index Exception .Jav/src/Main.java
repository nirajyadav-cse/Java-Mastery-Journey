import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        try {

            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.println("Value: " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index");

        }

        sc.close();
    }
}