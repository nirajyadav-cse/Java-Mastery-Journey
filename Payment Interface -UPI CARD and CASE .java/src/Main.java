interface Payment {

    void pay();
}

class UPI implements Payment {

    @Override
    public void pay() {

        System.out.println("Payment made through UPI");
    }
}

class Card implements Payment {

    @Override
    public void pay() {

        System.out.println("Payment made through Card");
    }
}

class Cash implements Payment {

    @Override
    public void pay() {

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