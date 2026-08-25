import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.print("Enter number to search: ");
        int number = sc.nextInt();

        if (numbers.contains(number)) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }

        sc.close();
    }
}
