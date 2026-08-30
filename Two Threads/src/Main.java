class FirstThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread 1: " + i);
        }
    }
}

class SecondThread extends Thread {

    @Override
    public void run() {

        for (int i = 6; i <= 10; i++) {

            System.out.println("Thread 2: " + i);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();

        t1.start();
        t2.start();
    }
}