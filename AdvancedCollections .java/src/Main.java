import java.util.*;

public class Main{

    public static void main(String[] args) {

        // Queue
        Queue<String> queue = new LinkedList<>();

        queue.offer("Niraj");
        queue.offer("Rahul");
        queue.offer("Aman");

        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.poll());


        // Deque
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);

        System.out.println("Deque: " + deque);


        // PriorityQueue
        PriorityQueue<Integer> priorityQueue =
                new PriorityQueue<>();

        priorityQueue.offer(40);
        priorityQueue.offer(10);
        priorityQueue.offer(30);

        System.out.println(
                "Priority Queue: "
                        + priorityQueue
        );

        System.out.println(
                "Highest priority element: "
                        + priorityQueue.poll()
        );


        // TreeMap
        TreeMap<Integer, String> map =
                new TreeMap<>();

        map.put(103, "Aman");
        map.put(101, "Niraj");
        map.put(102, "Rahul");

        System.out.println("TreeMap: " + map);
    }
}