import java.util.Scanner;

class TableTask extends Thread {

    private int number;

    TableTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {

            System.out.println(
                    number + " x " + i
                            + " = " + (number * i)
            );
        }
    }
}

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        TableTask t1 = new TableTask(number);

        t1.start();

        sc.close();
    }
}