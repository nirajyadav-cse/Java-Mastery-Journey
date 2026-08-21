abstract class Payment {

    abstract void pay();
}

class UPI extends Payment {

    @Override
    void pay() {

        System.out.println("Payment made through UPI");
    }
}

class Card extends Payment {

    @Override
    void pay() {

        System.out.println("Payment made through Card");
    }
}

class Cash extends Payment {

    @Override
    void pay() {

        System.out.println("Payment made through Cash");
    }
}

public class Main {

    public static void main(String[] args) {

        UPI u = new UPI();

        Card c = new Card();

        Cash cash = new Cash();

        u.pay();

        c.pay();

        cash.pay();
    }
}