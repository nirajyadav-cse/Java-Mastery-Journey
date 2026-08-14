class BankAccount {

    String accountHolder;
    double balance;

    void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println("Withdrawn: " + amount);

        } else {

            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {

        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.accountHolder = "Niraj";
        account.balance = 10000;

        account.displayBalance();

        account.deposit(5000);

        account.withdraw(3000);

        account.displayBalance();

    }
}