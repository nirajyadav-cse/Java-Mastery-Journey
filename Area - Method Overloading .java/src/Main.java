class Area {

    int calculateArea(int side) {
        return side * side;
    }

    int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}

public class Main{

    public static void main(String[] args) {

        Area a = new Area();

        System.out.println("Area of Square: " + a.calculateArea(5));

        System.out.println("Area of Rectangle: " + a.calculateArea(10, 5));

        System.out.println("Area of Circle: " + a.calculateArea(7.0));
    }
}