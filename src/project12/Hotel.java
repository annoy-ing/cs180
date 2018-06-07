package project12;

public class Hotel {

    private String hotelName;
    private Room[] rooms;
    private int totalRooms;

    public Hotel(String hotelName, int totalRooms, int floors) {
        this.hotelName = hotelName;
        this.totalRooms = totalRooms;
        this.rooms = new Room[totalRooms];

        int roomsPerFloor = totalRooms / floors;
        int currentRoom = 0;

        for (int i = 0; i < floors; i++) {
            int roomNumber = 100 + 100 * i;
            for (int j = 0; j < roomsPerFloor; j++) {

                if (j == roomsPerFloor - 1)
                    rooms[currentRoom] = new Room(roomNumber + j,"suite");
                else if (j > roomsPerFloor - 6)
                    rooms[currentRoom] = new Room(roomNumber + j,"single king");
                else
                    rooms[currentRoom] = new Room(roomNumber + j,"penis");

                currentRoom++;
            }
        }

    }

    public Room[] getRooms() {
        return rooms;
    }

    public int getNumberOccupied() {
        int count = 0;
        for (Room r: this.rooms) {
            if (r.getDaysRented() > 0) count++;
        }
        return count;
    }

    public double getOccupancyRate() {
        double occRate = (this.getNumberOccupied() * 100.00) / (this.totalRooms * 100.00);
        //System.out.println(occRate);
        occRate = (Math.floor(occRate * 100)) / 100;
        return occRate;
    }

    public boolean rentRoom(String roomType, String renterName, int daysRenting) {
        for (Room r: this.rooms) {
            if (r.getRoomType().equalsIgnoreCase(roomType)) {
                if (r.setOccupant(renterName, daysRenting))
                    return true;
            }
        }
        return false;
    }

    public void advanceDay() {
        for (Room r: this.rooms) {
            r.advanceDay();
        }
    }

    public String toString() {
        return this.hotelName + ": " + (int)(this.getOccupancyRate()*100) + "% occupied";
    }

    public static void main(String[] args) {
        Hotel h1 = new Hotel("h1",14*3,3);
        for (Room r:h1.getRooms()) {
            System.out.println(r);
        }

        System.out.println(h1.getNumberOccupied());
        System.out.println(h1.getOccupancyRate());
        System.out.println(h1);
        h1.rentRoom("suite", "Oleg", 3);
        h1.rentRoom("suite", "Stas", 4);
        h1.rentRoom("suite", "Vasya", 4);
        h1.rentRoom("suite", "Petya", 4);
        System.out.println(h1.getNumberOccupied());
        System.out.println(h1.getOccupancyRate());
        System.out.println(h1);
        h1.advanceDay();
        System.out.println(h1);
        h1.advanceDay();
        System.out.println(h1);
        h1.advanceDay();
        System.out.println(h1);
        h1.advanceDay();
        System.out.println(h1);
        h1.advanceDay();
        System.out.println(h1);
    }
}
