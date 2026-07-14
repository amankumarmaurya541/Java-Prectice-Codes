package Assignment28;

public class Assignment28 {
    public static void main(String[] args) {
        Payment aman = new Payment("Aman", 1000) {
            @Override
            void processPayment() {
                System.out.println("Cash payment of " + getAmount() + " processed!");
            }
        };
        Payment rohit = new Payment("Rohit", 2000) {
            @Override
            void processPayment() {
                System.out.println("Online payment of " + getAmount() + "  processed! Transaction ID: TXN123");
            }
        };
        Payment priya = new Payment("Priya", 1500){
            @Override
            void processPayment(){
                System.out.println("Card payment of " + getAmount() + " processed! Last 4 digits: 4242");
            }
        };
        aman.printReceipt();
        System.out.println("--------------------------------");
        rohit.printReceipt();
        System.out.println("--------------------------------");
        priya.printReceipt();
    }
}
abstract class Payment{
    private String customerName;
    private double amount;

    Payment(String customerName,double amount){
        this.customerName = customerName;
        this.amount = amount;
    }
    String getCustomerName(){
        return customerName;
    }
    double getAmount(){
        return amount;
    }
    abstract void processPayment();
    void printReceipt(){
        System.out.println("Customer: " + customerName);
        System.out.println("Amount: " + amount);
        processPayment();
    }
}