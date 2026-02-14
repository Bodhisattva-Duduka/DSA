public class InheritancePractice {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy", 5, "Labrador");
        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(d.breed);
    }
}

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