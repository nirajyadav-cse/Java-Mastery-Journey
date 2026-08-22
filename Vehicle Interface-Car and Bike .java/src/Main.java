interface Vehicle {

    void start();
}

class Car implements Vehicle {

    @Override
    public void start() {

        System.out.println("Car starts with a key");
    }
}

class Bike implements Vehicle {

    @Override
    public void start() {

        System.out.println("Bike starts with a button");
    }
}

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car();
        Bike b1 = new Bike();

        c1.start();
        b1.start();
    }
}