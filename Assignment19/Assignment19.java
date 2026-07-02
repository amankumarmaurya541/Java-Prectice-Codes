package Assignment19;

public class Assignment19 {
    public static void main(String[] args) {
        Bank.setBankName("State Bank Of India");
        Bank.Account account = new Bank.Account("Aman Kumar Maurya", 500000);
        account.deposit(200000);
        account.withdraw(600000);
        account.printAccountInfo();
        System.out.println("-----------------------------------");
        Bank.Card card = new Bank.Card("545127895432","Credit", 134);
        card.printCardInfo();
        Bank.Card.getTotalCardIssued();

    }
}
class Bank{
    private static String bankName;
    static void setBankName(String bankName){
        Bank.bankName = bankName;
    }
    static String getBankName(){
        return bankName;
    }
    static class Account {
        private String accountHolder;
        private double balance;

        Account(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
        }
        double deposit(double amount) {
            balance += amount;
            return balance;
        }
        double withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient balance!");
            } else {
                balance -= amount;
            }
            return balance;
        }
        void printAccountInfo() {
            System.out.println("Bank Name: " + getBankName());
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: " + balance);
        }
    }
    static class Card{
        private String cardNumber;
        private String cardType;
        static int totalCardIssued;

        Card(String cardNumber, String cardType, int totalCardIssued){
            this.cardNumber = cardNumber;
            this.cardType = cardType;
            Card.totalCardIssued = totalCardIssued;
        }
        void printCardInfo(){
            System.out.println("Bank Name: " + getBankName());
            System.out.println("Card number: " + cardNumber);
            System.out.println("Card Type: " + cardType);
        }
        static void getTotalCardIssued(){
            System.out.println("Total Card Issued: " + totalCardIssued);
        }
    }
}