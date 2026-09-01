import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<String> names = new LinkedList<>();

        System.out.println("Enter 5 names:");

        for (int i = 1; i <= 5; i++) {

            System.out.print("Name " + i + ": ");
            String name = sc.nextLine();

            names.offer(name);
        }

        System.out.println("\nNames in Queue:");

        while (!names.isEmpty()) {

            System.out.println(names.poll());
        }

        sc.close();
    }
}