import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(65);
        marks.add(82);
        marks.add(91);
        marks.add(74);
        marks.add(88);
        marks.add(55);

        System.out.println("Marks above 75:");

        marks.stream()
                .filter(mark -> mark > 75)
                .forEach(mark -> System.out.println(mark));

        System.out.println("\nSorted Marks:");

        marks.stream()
                .sorted()
                .forEach(mark -> System.out.println(mark));

        int highest = marks.stream()
                .max(Integer::compareTo)
                .get();

        int lowest = marks.stream()
                .min(Integer::compareTo)
                .get();

        int total = marks.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("\nHighest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Total Marks: " + total);
    }
}