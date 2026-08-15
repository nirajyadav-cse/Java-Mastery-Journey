class Car {

    String brand;
    String model;
    double price;

    Car(String brand, String model, double price) {

        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Fortuner", 3500000);

        car1.displayDetails();
    }
}