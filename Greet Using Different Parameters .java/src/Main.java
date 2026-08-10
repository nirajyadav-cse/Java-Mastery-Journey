public class Main {

    // No parameter
    static void greet() {
        System.out.println("Hello!");
    }

    // One parameter
    static void greet(String name) {
        System.out.println("Hello " + name + "!");
    }

    // Two parameters
    static void greet(String name, int age) {
        System.out.println("Hello " + name + "! You are " + age + " years old.");
    }

    public static void main(String[] args) {

        greet();

        greet("Niraj");

        greet("Niraj", 21);
    }
}