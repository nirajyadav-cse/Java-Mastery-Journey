public class Main {

    public static void main(String[] args) {

        Runnable task = () -> {

            for (int i = 1; i <= 10; i++) {

                System.out.println(
                        i + " squared = " + (i * i)
                );
            }
        };

        Thread t1 = new Thread(task);

        t1.start();
    }
}