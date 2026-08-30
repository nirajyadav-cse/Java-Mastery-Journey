class DownloadThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Downloading " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Main{

    public static void main(String[] args)
            throws InterruptedException {

        DownloadThread t1 = new DownloadThread();

        t1.start();

        t1.join();

        System.out.println("Main thread finished");
    }
}