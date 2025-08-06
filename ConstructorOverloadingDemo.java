// Write a java program to implement constructor overloading in a class Book.

class Book {
    String title;
    String author;
    int year;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 0;
    }
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (year != 0) {
            System.out.println("Year: " + year);
        }
    }
}
public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        book1.displayDetails();
        
        System.out.println();
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        book2.displayDetails();
    }
}