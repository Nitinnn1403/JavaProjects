// write a java program to demonstrate method overloading with a class calculator.
class Calculator {
    public int add(int a, int b) {
        return a + b;
    } 
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    public String add(String a, String b) {
        return a + b;
    }
    public String add(String a, String b, String c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + calc.add(5, 10, 15));
        System.out.println("Sum of 5.5 and 10.5: " + calc.add(5.5, 10.5));
        System.out.println("Sum of 5.5, 10.5, and 15.5: " + calc.add(5.5, 10.5, 15.5));
        System.out.println("Concatenation of 'Hello' and ' World': " + calc.add("Hello", " World"));
        System.out.println("Concatenation of 'Hello', ' World', and '!': " + calc.add("Hello", " World", "!"));
    }
}
