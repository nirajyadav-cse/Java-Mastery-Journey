public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            System.out.println(
                    "Running: "
                            + Thread.currentThread().getName()
            );

        }, "StudentThread");


        Thread t2 = new Thread(() -> {

            System.out.println(
                    "Running: "
                            + Thread.currentThread().getName()
            );

        }, "TeacherThread");


        Thread t3 = new Thread(() -> {

            System.out.println(
                    "Running: "
                            + Thread.currentThread().getName()
            );

        }, "AdminThread");


        t1.start();
        t2.start();
        t3.start();
    }
}