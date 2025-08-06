// create a program with a class employee having private fields and public getters and setters (Encapsulation).

public class displayEmployeeDetails {
    private String name;
    private int age;
    private String position;
    private double salary;

    public displayEmployeeDetails(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);
    }
    public static void main(String[] args) {
        displayEmployeeDetails emp = new displayEmployeeDetails("John Doe", 30, "Software Engineer", 75000);
        emp.displayEmployeeDetails();
        emp.setName("Jane Smith");
        emp.setAge(28);
        emp.setPosition("Senior Software Engineer");
        emp.setSalary(85000); 
        emp.displayEmployeeDetails();
    }
}