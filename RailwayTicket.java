// write a java project to build Railway Ticket Booking Features : book tickets, show tickets, cancel tickets
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RailwayTicket {
    private static class Ticket {
        private int ticketId;
        private String passengerName;
        private String trainName;
        private String seatNumber;
    }
    private static List<Ticket> tickets = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Book Ticket");
            System.out.println("2. Show Tickets");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    bookTicket(scanner);
                    break;
                case 2:
                    showTickets();
                    break;
                case 3:
                    cancelTicket(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }   
    private static void bookTicket(Scanner scanner) {
        Ticket ticket = new Ticket();
        System.out.print("Enter Passenger Name: ");
        ticket.passengerName = scanner.nextLine();
        System.out.print("Enter Train Name: ");
        ticket.trainName = scanner.nextLine();
        System.out.print("Enter Seat Number: ");
        ticket.seatNumber = scanner.nextLine();
        ticket.ticketId = tickets.size() + 1;
        tickets.add(ticket);
        System.out.println("Ticket booked successfully! Ticket ID: " + ticket.ticketId);
    }
    private static void showTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets booked.");
            return;
        }
        System.out.println("Booked Tickets:");
        for (Ticket ticket : tickets) {
            System.out.println("Ticket ID: " + ticket.ticketId + ", Passenger Name: " + ticket.passengerName +
                               ", Train Name: " + ticket.trainName + ", Seat Number: " + ticket.seatNumber);
        }
    }
    private static void cancelTicket(Scanner scanner) {
        System.out.print("Enter Ticket ID to cancel: ");
        int ticketId = scanner.nextInt();
        scanner.nextLine();
        boolean found = false;
        for (Ticket ticket : tickets) {
            if (ticket.ticketId == ticketId) {
                tickets.remove(ticket);
                System.out.println("Ticket ID " + ticketId + " cancelled successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Ticket ID " + ticketId + " not found.");
        }
    }
}