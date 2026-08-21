abstract class Animal {

    abstract void sound();
}

class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {

        System.out.println("Cat meows");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        Cat c1 = new Cat();

        d1.sound();

        c1.sound();
    }
}