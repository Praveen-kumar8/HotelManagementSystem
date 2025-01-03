package HotelManagementSystem;

import java.util.ArrayList;

class Hotel {
    private ArrayList<Room> rooms;
    private ArrayList<Customer> customers;

    public Hotel() {
        rooms = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addRoom(int roomNumber, String roomType) {
        rooms.add(new Room(roomNumber, roomType));
    }

    public void bookRoom(int roomNumber, String customerName, String customerContact) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isBooked()) {
                room.bookRoom();
                customers.add(new Customer(customerName, customerContact));
                System.out.println("Room booked successfully.");
                return;
            }
        }
        System.out.println("Room is either not available or already booked.");
    }

    public void releaseRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isBooked()) {
                room.releaseRoom();
                System.out.println("Room released successfully.");
                return;
            }
        }
        System.out.println("Room is either not booked or does not exist.");
    }

    public void showRooms() {
        for (Room room : rooms) {
            System.out.println("Room Number: " + room.getRoomNumber() + ", Type: " + room.getRoomType() + ", Booked: " + room.isBooked());
        }
    }
}