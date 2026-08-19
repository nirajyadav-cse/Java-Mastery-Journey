class Animal {

    Animal() {

        System.out.println("Animal constructor");
    }

    void sound() {

        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    Dog() {

        super();

        System.out.println("Dog constructor");
    }

    @Override
    void sound() {

        super.sound();

        System.out.println("Dog barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        System.out.println();

        d1.sound();
    }
}