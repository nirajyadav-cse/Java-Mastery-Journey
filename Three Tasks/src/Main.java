public class Main {

    public static void main(String[] args) {

        Thread download = new Thread(() -> {
            System.out.println("Downloading...");
        });

        Thread process = new Thread(() -> {
            System.out.println("Processing...");
        });

        Thread save = new Thread(() -> {
            System.out.println("Saving...");
        });

        download.start();
        process.start();
        save.start();
    }
}