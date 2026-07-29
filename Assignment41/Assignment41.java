package Assignment41;

public class Assignment41 {
    public static void main(String[] args) {
        Device laptop = new Laptop();
        Device phone  = new phone();
        System.out.println("==== Laptop ====");
        laptop.turnOn();
        laptop.turnOff();
        System.out.println("\n==== Phone ====");
        phone.turnOn();
        phone.turnOff();
        System.out.println("\n==== Restart ====");
        laptop.restart();
        phone.restart();
        System.out.println("\n==== Static Method ====");
        Device.deviceInfo();
    }
}
interface Device{
    void turnOn();
    void turnOff();
    default void restart(){
        System.out.println("Device is restarting...");
    }
    static void deviceInfo(){
        System.out.println("This is a Device Interface");
    }
}
class Laptop implements Device{
    public void turnOn(){
        System.out.println("Laptop is turning on");
    }
    public void turnOff(){
        System.out.println("Laptop is turning off");
    }
}
class phone implements Device{
    public void turnOn(){
        System.out.println("Phone is turning on");
    }
    public void turnOff(){
        System.out.println("Phone is turning off");
    }
    @Override
    public void restart(){
        System.out.println("Phone is restarting with fingerprint check...");
    }

}