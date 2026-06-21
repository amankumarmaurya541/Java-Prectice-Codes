package Assignment11;
public class Assignment11 {
    public static void main(String[] args) {
        Car c = new Car("BMW", 350, "Petrol", 2);
        Bike b = new Bike("BMW", 400, "Petrol", false);
        Truck t = new Truck("TATA", 180, "Diesel", 5);
        c.start();
        c.printInfo();
        c.playMusic();
        System.out.println("------------------------------------------------------------");
        b.start();
        b.printInfo();
        b.doWheelie();
        System.out.println("------------------------------------------------------------");
        t.start();
        t.printInfo();
        t.loadGood(4);

    }
}
class Vehicle{
    private String brand;
    private int speed;
    private String fuelType;

    Vehicle(String brand, int speed, String fuelType){
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getBrand(){
        return brand;
    }
    public int getSpeed(){
        return speed;
    }
    public String getFuelType(){
        return fuelType;
    }
    public void printInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }
    public void start(){
        System.out.println(brand + "  vehicle is starting....");
    }
    public void stop(){
        System.out.println(brand + " vehicle is stopping....");
    }

}
class Car extends Vehicle{
    private int numberOfDoors;

    Car(String brand, int speed, String fuelType, int numberOfDoors){
        super(brand, speed, fuelType);
        this.numberOfDoors = numberOfDoors;

    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Number Of Doors: " + numberOfDoors);

    }
    public void playMusic(){
        System.out.println(getBrand() + " car music is playing");
    }

}
class Bike extends Vehicle{
    private Boolean hasSideCar;

    Bike(String brand, int speed, String fuelType, boolean hasSideCar){
        super(brand, speed, fuelType);
        this.hasSideCar = hasSideCar;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Has SideCar: " + hasSideCar);
    }
    public void doWheelie(){
        System.out.println(getBrand() + " bike is doing a wheelie!");
    }

}
class Truck extends Vehicle{
    private double loadCapacity;
    Truck(String brand, int speed, String fuelType, double loadCapacity){
        super(brand, speed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Load Capacity: " + loadCapacity);

    }
    public void start(){
        System.out.println(getBrand() + " truck is starting with heavy load...");
    }
    public void loadGood(double tons){
        if (tons > loadCapacity){
            System.out.println("Overloaded!");
        }else {
            System.out.println(tons + " tons loaded successfully");
        }
    }
}