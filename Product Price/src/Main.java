import java.util.ArrayList;

class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - ₹" + price;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 55000));
        products.add(new Product("Mouse", 800));
        products.add(new Product("Keyboard", 1500));
        products.add(new Product("Monitor", 12000));

        products.sort(
                (p1, p2) ->
                        Double.compare(p1.price, p2.price)
        );

        System.out.println("Products by price:");

        for (Product product : products) {
            System.out.println(product);
        }
    }
}