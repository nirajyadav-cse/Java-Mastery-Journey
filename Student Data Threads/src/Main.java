class StudentThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Student " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Student thread interrupted");
            }
        }
    }
}

class MarksThread extends Thread {

    @Override
    public void run() {

        int[] marks = {80, 85, 90, 75, 95};

        for (int mark : marks) {

            System.out.println("Marks: " + mark);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Marks thread interrupted");
            }
        }
    }
}

public class Main {

    public static void main(String[] args)
            throws InterruptedException {

        StudentThread students = new StudentThread();
        MarksThread marks = new MarksThread();

        students.start();
        marks.start();

        students.join();
        marks.join();

        System.out.println(
                "All student data processed successfully."
        );
    }
}