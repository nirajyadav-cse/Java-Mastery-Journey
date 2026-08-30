public class Main {

    public static void main(String[] args) {

        Thread download = new Thread(() -> {

            System.out.println("Downloading...");

            for (int i = 10; i <= 100; i += 10) {

                System.out.println(i + "%");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Download interrupted");
                }
            }

            System.out.println("Download completed!");
        });

        download.start();
    }
}