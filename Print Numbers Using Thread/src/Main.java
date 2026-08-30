class NumberThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        NumberThread t1 = new NumberThread();

        t1.start();
    }
}