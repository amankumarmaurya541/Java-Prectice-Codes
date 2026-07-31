package Assignment43;

public class Assignment43 {
    public static void main(String[] args) {
        CryptoPayment cp = new CryptoPayment("Rohit", "RTDF2143");
        UPIPayment upi = new UPIPayment("IXE234213");

        System.out.println("==== CryptoPayment — Abstract Methods ====");
        cp.processPayment(500000);
        cp.verifyOTP(234656);
        cp.convertCurrency("USD");

        System.out.println("\n==== CryptoPayment — Default Methods ====");
        cp.printReceipt();
        cp.sendNotification();
        cp.checkExchangeRate();

        System.out.println("\n==== UPIPayment — Abstract Methods ====");
        upi.processPayment(600000);
        upi.verifyOTP(654378);

        System.out.println("\n==== UPIPayment — Default Methods ====");
        upi.printReceipt();
        upi.sendNotification();

        System.out.println("==== Static Methods ====");
        Payment.paymentInfo();

    }
}
interface Payment{
    void processPayment(double amount);
    default void printReceipt(){
        System.out.println("Payment receipt generated");
    }
    static void paymentInfo(){
        System.out.println("Payment Interface — base interface");
    }
}
interface OnlinePayment extends Payment{
    void verifyOTP(int otp);
    default void sendNotification(){
        System.out.println("Payment notification sent!");
    }
}
interface InternationalPayment extends OnlinePayment{
    void convertCurrency(String currency);
    default void checkExchangeRate(){
        System.out.println("Checking exchange rate...");
    }
}
class CryptoPayment implements InternationalPayment{
    private String customerName;
    private String walletID;

    CryptoPayment(String customerName, String walletID){
        this.customerName = customerName;
        this.walletID = walletID;
    }
    public void processPayment(double amount){
        System.out.println(customerName + "  processed crypto payment of " + amount);
    }
    public void verifyOTP(int otp){
        System.out.println("OTP " + otp + " verified for wallet " + walletID);
    }
    public void convertCurrency(String currency){
        System.out.println("Converting to " + currency + " for " + customerName);
    }
}
class UPIPayment implements OnlinePayment{
    private String upiID;

    UPIPayment(String upiID){
        this.upiID = upiID;
    }
    public void processPayment(double amount){
        System.out.println("Payment of " + amount + " processed via UPI: " + upiID);
    }
    public void verifyOTP(int otp){
        System.out.println("OTP " + otp + " verified for UPI: " + upiID);
    }
    @Override
    public void sendNotification(){
        System.out.println("UPI payment SMS sent to registered number!");
    }
}