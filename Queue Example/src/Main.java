
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Niraj");
        queue.offer("Rahul");
        queue.offer("Aman");
        queue.offer("Rohit");
        queue.offer("Vivek");

        System.out.println("Queue: " + queue);

        System.out.println("Front element: " + queue.peek());

        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue after removal: " + queue);
    }
}