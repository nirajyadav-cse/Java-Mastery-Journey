import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> names = new HashSet<>();

        System.out.print("How many names? ");
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            names.add(name);
        }

        System.out.println("Unique Names:");

        for (String name : names) {

            System.out.println(name);
        }

        sc.close();
    }
}