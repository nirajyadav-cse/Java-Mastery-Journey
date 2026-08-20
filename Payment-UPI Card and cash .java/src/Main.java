class Payment {

    void pay() {
        System.out.println("Making payment");
    }
}

class UPI extends Payment {

    @Override
    void pay() {
        System.out.println("Payment through UPI");
    }
}

class Card extends Payment {

    @Override
    void pay() {
        System.out.println("Payment through Card");
    }
}

class Cash extends Payment {

    @Override
    void pay() {
        System.out.println("Payment through Cash");
    }
}

public class Main {

    public static void main(String[] args) {

        Payment p1 = new UPI();

        Payment p2 = new Card();

        Payment p3 = new Cash();

        p1.pay();

        p2.pay();

        p3.pay();
    }
}