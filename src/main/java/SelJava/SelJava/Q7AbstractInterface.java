package SelJava.SelJava;

abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
interface Vehicle {
    void start(); // abstract method
    void stop();  // abstract method
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }
}

public class Q7AbstractInterface {

	public static void main(String[] args) {
		 Animal dog = new Dog();
	        dog.sound();
	        dog.sleep();

	        // Interface usage
	        Vehicle car = new Car();
	        car.start();
	        car.stop();

	}

}
