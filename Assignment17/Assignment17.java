package Assignment17;

public class Assignment17 {
    public static void main(String[] args) {
        Phone phone = new Phone("SAMSUNG");
        phone.printBrand();
        //access static nested class....
        Phone.Battery battery = new Phone.Battery(5000);
        battery.printCapacity();
    }
}
class Phone{
    private String brand;

    Phone(String brand){
        this.brand = brand;
    }

    void printBrand(){
        System.out.println("Brand: " + brand);
    }
    static class Battery{
        private int capacity;

        Battery(int capacity){
            this.capacity = capacity;
        }
        void printCapacity(){
            System.out.println("Battery Capacity: " + capacity + "mAH");
        }
    }
}
