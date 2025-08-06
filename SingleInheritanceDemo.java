class Person {
    String name;
    int age;

    void inputPersonDetails(String n, int a) {
        name = n;
        age = a;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;

    void inputStudentDetails(String n, int a, int roll) {
        inputPersonDetails(n, a);
        rollNumber = roll;
    }

    void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.inputStudentDetails("Nitin", 20, 127071);
        s.displayStudentDetails();
    }
}
