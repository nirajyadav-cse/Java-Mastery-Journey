class Car {

    String brand;
    String color;
    double price;

}

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "Toyota";
        car1.color = "Black";
        car1.price = 1500000;

        System.out.println("Brand: " + car1.brand);
        System.out.println("Color: " + car1.color);
        System.out.println("Price: " + car1.price);

    }
}