public class Main {

    // Area of square
    static int area(int side) {
        return side * side;
    }

    // Area of rectangle
    static int area(int length, int breadth) {
        return length * breadth;
    }

    // Area of circle
    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        System.out.println("Area of Square = " + area(5));

        System.out.println("Area of Rectangle = " + area(10, 5));

        System.out.println("Area of Circle = " + area(7.0));
    }
}