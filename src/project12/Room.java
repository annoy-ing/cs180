package project12;

public class Room {

    private int roomNumber;
    private int daysRented;
    private String roomType;
    private String occupantName;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.daysRented = 0;
        this.occupantName = null;
        if (roomType.equalsIgnoreCase("single king"))
            this.roomType = "single king";
        else if (roomType.equalsIgnoreCase("suite"))
            this.roomType = "suite";
        else this.roomType = "double queen";
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getOccupantName() {
        return occupantName;
    }

    public boolean setOccupant(String occupantName, int daysRented) {
        if (this.getDaysRented() == 0) {
            this.occupantName = occupantName;
            this.daysRented = daysRented;
            return true;
        } else
            return false;

    }

    public void advanceDay() {
        this.daysRented--;
        if (this.daysRented <= 0) {
            this.occupantName = null;
            this.daysRented = 0;
        }
    }


    public String toString() {
        if (this.getDaysRented() > 0)
            return "Room " + this.roomNumber + ": " + this.getRoomType() + " - rented";
        else
            return "Room " + this.roomNumber + ": " + this.getRoomType() + " - free";
    }


}
