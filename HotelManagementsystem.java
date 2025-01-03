package HotelManagementSystem;

import java.util.Scanner;

public class HotelManagementsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        hotel.addRoom(101, "Single");
        hotel.addRoom(102, "Double");
        hotel.addRoom(103, "Suite");

        while (true) {
            System.out.println("1. Show Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Release Room");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    hotel.showRooms();
                    break;
                case 2:
                    System.out.print("Enter room number to book: ");
                    int roomNumberToBook = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter customer contact: ");
                    String customerContact = scanner.nextLine();
                    hotel.bookRoom(roomNumberToBook, customerName, customerContact);
                    break;
                case 3:
                    System.out.print("Enter room number to release: ");
                    int roomNumberToRelease = scanner.nextInt();
                    hotel.releaseRoom(roomNumberToRelease);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
