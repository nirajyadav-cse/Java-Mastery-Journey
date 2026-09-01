import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<String> tasks = new LinkedList<>();

        tasks.offer("Task 1");
        tasks.offer("Task 2");
        tasks.offer("Task 3");
        tasks.offer("Task 4");
        tasks.offer("Task 5");

        System.out.println("Processing tasks:");

        while (!tasks.isEmpty()) {

            String task = tasks.poll();

            System.out.println("Processing " + task);
        }

        System.out.println("All tasks completed.");
    }
}