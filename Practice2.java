import java.util.*;
public class Practice2 {
    public static void main(String[] args) {
        HashSet <Integer> students = new HashSet<>();
        students.add(1);
        students.add(2);
        students.add(3);
        students.add(4);
        students.add(5);
        for (Integer i : students) {
            System.out.println("Student ID: " + i);
        }
    }
}