public class Main {

    public static void main(String[] args) {

        Thread counter = new Thread(() -> {

            for (int i = 1; i <= 10; i++) {

                System.out.println(i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        });

        counter.start();
    }
}