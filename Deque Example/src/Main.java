import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(20);
        deque.addLast(30);
        deque.addFirst(10);
        deque.addLast(40);

        System.out.println("Deque: " + deque);

        deque.removeFirst();

        System.out.println("After removing first: " + deque);

        deque.removeLast();

        System.out.println("After removing last: " + deque);
    }
}