class Vehicle {

    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    String model = "Fortuner";

    void drive() {
        System.out.println("Car is driving");
    }
}

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car();

        System.out.println("Brand: " + c1.brand);
        System.out.println("Model: " + c1.model);

        c1.start();
        c1.drive();
    }
}