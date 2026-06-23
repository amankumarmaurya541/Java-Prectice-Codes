package Assignment13;

public class Assignment13 {
    public static void main(String[] args) {
        Vehicle c = new Car("BMW", 300, 4);
        Vehicle t = new Truck("TATA", 150, 15);
        Vehicle b = new Bike("KAWASAKI", 350);

        c.printDetail();
        System.out.println("---------------------------------");
        t.printDetail();
        System.out.println("---------------------------------");
        b.printDetail();

    }
}

abstract class Vehicle{
    private String brand;
    private int speed;

    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand(){
        return brand;
    }
    public int getSpeed(){
        return speed;
    }
    abstract double calculateToll();

    public void printDetail(){
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Toll Amount: " + calculateToll());
    }
}
class Car extends Vehicle{
    private int numberOfWheels;

    Car(String brand, int speed, int numberOfWheels){
        super(brand, speed);
        this.numberOfWheels = numberOfWheels;
    }
    public double calculateToll(){
        return 50.0;
    }
}
class Truck extends Vehicle{
    private double loadCapacity;

    Truck(String brand, int speed, double loadCapacity){
        super(brand, speed);
        this.loadCapacity = loadCapacity;
    }
    public double calculateToll(){
        if (loadCapacity > 10){
            return 200.0;
        }else {
            return 100.0;
        }

    }
}
class Bike extends Vehicle{
    Bike(String brand, int speed){
        super(brand, speed);
    }
    public double calculateToll(){
        return 20.0;
    }

}
