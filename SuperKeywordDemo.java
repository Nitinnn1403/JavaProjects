// write a java program to demonstrate the use of "super" keyword to call the parent class constructor and methods.

class Animal {
    String name;
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called: " + name);
    }
    void display() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
        System.out.println("Dog constructor called: " + name);
    }
    void display() {
        super.display();
        System.out.println("Dog is a type of Animal.");
    }
    void bark() {
        System.out.println(name + " says: Woof Woof!");
    }
}
public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.display();
        dog.bark();
    }
}