import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        PriorityQueue<Integer> queue =
                new PriorityQueue<>();

        queue.offer(50);
        queue.offer(10);
        queue.offer(30);
        queue.offer(20);
        queue.offer(40);

        System.out.println("Elements in priority order:");

        while (!queue.isEmpty()) {

            System.out.println(queue.poll());
        }
    }
}