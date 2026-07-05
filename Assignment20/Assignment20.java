package Assignment20;

public class Assignment20 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo");
        Laptop.Processor processor = laptop.new Processor("Intel Core i9");
        processor.printDetails();

    }
}
class Laptop{
    private String brand;

    Laptop(String brand){
        this.brand = brand;
    }
    String getBrand(){
        return brand;
    }

    class Processor{
        private String processerName;

        Processor(String processerName){
            this.processerName = processerName;
        }
        void printDetails(){
            System.out.println("Laptop Brand: " + getBrand());
            System.out.println("Processor: " + processerName);
        }
    }
}
