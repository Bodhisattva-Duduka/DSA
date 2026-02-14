public class InheritancePractice {
    public static void main(String[] args) {
        // Task 1:

        // Dog d = new Dog("Tommy", 5, "Labrador");
        // System.out.println(d.name);
        // System.out.println(d.age);
        // System.out.println(d.breed);

        // Task 2:

        Car sclass = new Car(200, 4, "benz");
        System.out.println(sclass.brand);
        System.out.println(sclass.speed);
        System.out.println(sclass.wheels);

        // copy constructor

        Vehicle truck = new Vehicle(100, 4);
        System.out.println(truck.speed);
        System.out.println(truck.wheels);
    }
}


    // Task 1 — Basic Inheritance (Foundation)

    // Create:

    // class Animal
    //     String name
    //     int age
    //     method: makeSound()

    // class Dog extends Animal
    //     String breed

    // Requirements

    // Create default constructor in both classes

    // Create parameterized constructor in both

    // Use super(...) to initialize parent fields

    // Create object:

    // Dog d = new Dog("Tommy", 5, "Labrador");


    // Print:

    // name, age, breed


    // Goal → understand parent part + child part

class Animal {
    String name;
    int age;

    void makeSound(){
        System.out.println(name + " is making Sound");
    }

    public Animal() {
        this.name  = "";
        this.age = -1;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal {
    String breed;

    public Dog() {
        this.breed = "";
    }

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }    
    
}

// -------------------------------------------------------------------------------------


    // Task 2 — Constructor Chain Practice

    // Create:

    // class Vehicle
    //     int speed
    //     int wheels

    // class Car extends Vehicle
    //     String brand

    // Requirements

    // Create 3 constructors in Vehicle

    // default

    // parameterized

    // copy constructor

    // Create constructor in Car that:

    // uses super(...)

    // sets brand

    // Create objects:

    // default

    // parameterized

    // copy

    // Goal → master constructor chaining + super


class Vehicle {
    int speed;
    int wheels;

    Vehicle () {
        this.speed = -1;
        this.wheels = -1;
    }

    Vehicle (int speed, int wheels){
        this.speed = speed;
        this.wheels = wheels;
    }

    Vehicle (Vehicle other){
        this.speed = other.speed;
        this.wheels = other.wheels;
    }
}

class Car extends Vehicle {
    String brand;
    
    Car (int speed, int wheels, String brand){
        super(speed, wheels);
        this.brand = brand;
    }
}