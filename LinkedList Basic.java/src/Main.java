import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.addFirst(10);
        numbers.addLast(50);

        System.out.println("LinkedList: " + numbers);

        numbers.removeFirst();
        numbers.removeLast();

        System.out.println("After removing: " + numbers);
    }
}