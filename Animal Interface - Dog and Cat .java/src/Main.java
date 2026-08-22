interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {

        System.out.println("Dog barks");
    }
}

class Cat implements Animal {

    @Override
    public void sound() {

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