// create a java program using absract class Vehicle and subclasses Car and Bike.
abstract class Vehicle {
    String name;
    Vehicle(String name) {
        this.name = name;
    }
    abstract void display();
}
class Car extends Vehicle {
    Car(String name) {
        super(name);
    }
    void display() {
        System.out.println("Car Name: " + name);
    }
}
class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }
    void display() {
        System.out.println("Bike Name: " + name);
    }
}

class AbstractClassDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        car.display();
        
        Vehicle bike = new Bike("Yamaha");
        bike.display();
    }
}
    