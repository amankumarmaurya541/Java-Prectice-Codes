package Assignment21;

public class Assignment21 {
    public static void main(String[] args) {
        House house = new House("Aman Kumar Maurya", "Ghazipur");
        House.Room room1 = house.new Room("Bedroom",240);
        House.Room room2 = house.new Room("Kitchen", 160);
        room1.printRoomInfo();
        System.out.println("-------------------------------------");
        room2.printRoomInfo();

    }
}

class House{
    private String ownerName;
    private String address;

    House(String ownerName, String address){
        this.ownerName = ownerName;
        this.address = address;
    }
    String getOwnerName(){
        return ownerName;
    }
    String getAddress(){
        return address;
    }
    void printHouseInfo(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Address: " + address);
    }

    class Room{
        private String roomType;
        private double roomSize;

        Room(String roomType, double roomSize){
            this.roomType = roomType;
            this.roomSize = roomSize;
        }
        void printRoomInfo(){
            printHouseInfo();
            System.out.println("Room Type: " + roomType);
            System.out.println("Room Size: " + roomSize + " sq ft");
        }
    }
}