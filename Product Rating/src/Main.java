import java.util.ArrayList;

class Product {

    String name;
    double rating;

    Product(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " - Rating: " + rating;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 4.2));
        products.add(new Product("Phone", 4.8));
        products.add(new Product("Mouse", 4.0));
        products.add(new Product("Keyboard", 4.5));

        products.sort(
                (p1, p2) ->
                        Double.compare(p2.rating, p1.rating)
        );

        System.out.println("Products by rating:");

        for (Product product : products) {
            System.out.println(product);
        }
    }
}