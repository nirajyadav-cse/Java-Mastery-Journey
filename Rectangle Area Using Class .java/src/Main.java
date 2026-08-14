class Rectangle {

    int length;
    int breadth;

    void calculateArea() {

        int area = length * breadth;

        System.out.println("Area = " + area);
    }
}

public class Main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        r1.length = 10;
        r1.breadth = 5;

        r1.calculateArea();

    }
}