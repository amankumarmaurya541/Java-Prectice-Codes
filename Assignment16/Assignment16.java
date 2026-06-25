package Assignment16;

public class Assignment16 {
    public static void main(String[] args) {
        System.out.println("Cash Payment: ");
        Payment p = new CashPayment("Priyanshu Vishwakarma", 78000);
        p.printReceipt();
        ((CashPayment)p).applyDiscount(7);
        System.out.println("---------------------------------------------");
        System.out.println("Online Payment: ");
        p = new OnlinePayment("Aman Kumar Maurya", 100000, "IRXZ736458");
        p.printReceipt();
        ((OnlinePayment)p).sendNotification();
        ((OnlinePayment)p).sendNotification("assignmenta531@gmail.com");

    }
}
abstract class Payment{
    private String payerName;
    private double amount;

    Payment(String payerName, double amount){
        this.payerName = payerName;
        this. amount = amount;
    }
    String getPayerName(){
        return payerName;
    }
    double getAmount(){
        return amount;
    }
    abstract String processPayment();
    void printReceipt(){
        System.out.println("Payer Name: " + payerName);
        System.out.println("Amount: " + amount);
        System.out.println("Process Payment: " + processPayment());
    }
}
class CashPayment extends Payment{
    CashPayment(String payerName, double amount){
        super(payerName, amount);
    }
    public String processPayment(){
        return "Cash payment of " + getAmount() + " processed successfully";
    }
    public void applyDiscount(double percent){
        System.out.println("Discount of " + percent + "% applied");
    }
    public void applyDiscount(double percent, String reason){
        System.out.println("Discount of" + percent + "% applied due to " + reason);
    }
}
class OnlinePayment extends Payment{
    private String transactionId;
    OnlinePayment(String payerName, double amount, String transactionId){
        super(payerName, amount);
        this.transactionId = transactionId;
    }
    public String processPayment(){
        return "Online payment processed. Transection Id: " + transactionId;
    }
    void sendNotification(){
        System.out.println("Payment notification sent to registered email");
    }
    void sendNotification(String email){
        System.out.println("Payment notification sent to " + email);
    }
    void sendNotification(String email, String phone){
        System.out.println("Payment notification sent to " + email + "and" + "phone");
    }
}