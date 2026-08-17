class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal {

    void breathe() {
        System.out.println("Mammal is breathing");
    }
}

class Dog extends Mammal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();
        d1.breathe();
        d1.bark();
    }
}