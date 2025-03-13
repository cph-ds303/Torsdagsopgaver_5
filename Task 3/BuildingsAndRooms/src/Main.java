import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 3.g Vi har lavet vores main klasse, og instantierer nye rooms til vores ArrayList<Room>
        Room room1 = new Room(2, 3);
        Room room2 = new Room(4, 2);
        Room room3 = new Room(1, 1);

        // 3.h Her adder vi dem i vores ArrayList
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        // 3.i
        Building building = new Building(rooms, 2);

        System.out.println("Total number of lamps in building: " + countLampsInBuilding(building));
        System.out.println("Total number of windows in building: " + countWindowsInBuilding(building));
        System.out.println("Total number of rooms in building: " + countRoomsInBuilding(building));
        System.out.println("Is building normal? " + isNormal(building));

        Building abnormalBuilding = new Building(rooms, 5);
        System.out.println("Is abnormal building normal? " + isNormal(abnormalBuilding));
    }

    // 3.j
    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }

    // 3.k
    public static boolean isNormal(Building building) {
        return building.getNumberOfFloors() <= building.getRooms().size();
    }
}