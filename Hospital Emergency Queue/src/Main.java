import java.util.PriorityQueue;

class Patient {

    String name;
    int priority;

    Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " - Priority: " + priority;
    }
}

public class Main{

    public static void main(String[] args) {

        PriorityQueue<Patient> patients =
                new PriorityQueue<>(
                        (p1, p2) ->
                                Integer.compare(
                                        p2.priority,
                                        p1.priority
                                )
                );

        patients.offer(new Patient("Niraj", 3));
        patients.offer(new Patient("Rahul", 1));
        patients.offer(new Patient("Aman", 2));
        patients.offer(new Patient("Rohit", 5));

        System.out.println("Emergency Processing:");

        while (!patients.isEmpty()) {

            System.out.println(patients.poll());
        }
    }
}