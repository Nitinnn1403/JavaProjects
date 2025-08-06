// Create a java program to show methods overriding using a superclass animal and subclass DOG.
class Animal {
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
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}
