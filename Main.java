// Parent Class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child Class (Inheritance)
class Dog extends Animal {
    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child Class (Inheritance)
class Cat extends Animal {
    // Method Overriding
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Animal a;

        a = new Animal();
        a.sound();

        a = new Dog();    // Upcasting
        a.sound();

        a = new Cat();    // Upcasting
        a.sound();
    }
}
