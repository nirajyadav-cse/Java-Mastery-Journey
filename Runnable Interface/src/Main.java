class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Java is easy to learn");
    }
}

public class Main {

    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread t1 = new Thread(task);

        t1.start();
    }
}