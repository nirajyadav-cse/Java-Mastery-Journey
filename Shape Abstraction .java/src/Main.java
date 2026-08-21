abstract class Shape {

    abstract void area();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {

        this.radius = radius;
    }

    @Override
    void area() {

        double result = 3.14 * radius * radius;

        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle(double length, double breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {

        double result = length * breadth;

        System.out.println("Area of Rectangle = " + result);
    }
}

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(7);

        Rectangle r1 = new Rectangle(10, 5);

        c1.area();

        r1.area();
    }
}