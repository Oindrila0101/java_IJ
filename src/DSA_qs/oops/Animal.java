package DSA_qs.oops;
//polymorphism
//Method Overriding (run-time)
//A child class provides its own implementation of a method that already exists in the parent class.
public class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

