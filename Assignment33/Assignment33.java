package Assignment33;

public class Assignment33 {
    public static void main(String[] args) {
        Transaction t1 = new Transaction("TXN001", "Priyanshu", "Aman", 9000, "Debit");
        t1.printTransactionDetails();
        System.out.println("---------------------------------");
        Transaction t2 = new Transaction("NXRD032", "Shivansh", "Shivam", 32000, "Credit");
        t2.printTransactionDetails();
        
    }
}

final class Transaction{
    private final String transactionId;
    private final String senderName;
    private final String receiverName;
    private final double amount;
    private final String transactionType;

    Transaction(String transactionId, String senderName, String receiverName, double amount, String transactionType){
        this.transactionId = transactionId;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    String getTransactionId(){
        return transactionId;
    }
    String getSenderName(){
        return senderName;
    }
    String getReceiverName(){
        return receiverName;
    }
    double getAmount(){
        return amount;
    }
    String getTransactionType(){
        return transactionType;
    }

    void printTransactionDetails(){
        System.out.println("===== Transaction Details =====");
        System.out.println("Sender: " + getSenderName());
        System.out.println("Receiver: " + getReceiverName());
        System.out.println("Amount: " + getAmount());
        System.out.println("Transaction Type: " + getTransactionType());
        System.out.println("================================");
    }
    boolean isLargeTransaction(){
        if (amount > 10000){
            return true;
        }else {
            return false;
        }
    }
}