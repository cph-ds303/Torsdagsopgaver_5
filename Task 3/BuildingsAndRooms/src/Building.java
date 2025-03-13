import java.util.ArrayList;

// 3.d vi laver en klasse ved navn building og tildeler værdier
class Building {

    // 3.d Vi laver en ArrayList, som kun kan indeholde Room objects
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    // 3.e vi laver en konstruktør til vores klasse
    public Building(ArrayList<Room> rooms, int numberOfFloors) {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    // 3.f vi laver setters og getters
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}