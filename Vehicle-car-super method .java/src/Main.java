class Vehicle {

    Vehicle() {

        System.out.println("Vehicle constructor called");
    }
}

class Car extends Vehicle {

    Car() {

        super();

        System.out.println("Car constructor called");
    }
}

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car();
    }
}