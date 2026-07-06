package Assignment22;

public class Assignment22 {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank Of India", "Utter Pradesh");
        Bank.Account account = bank.new Account("Aditi Gupta", 500000);
        account.deposit(1100000);
        account.withdraw(200000);
        System.out.println("----------------------------------------");
        account.printAccountInfo();
        System.out.println("----------------------------------------");
        Bank.Account.Transaction transaction = account.new Transaction("Deposit", 1100000);
        transaction.printTransactionInfo();

    }
}
class Bank{
    private String bankName;
    private String location;

    Bank(String bankName, String location){
        this.bankName = bankName;
        this.location = location;
    }
    String getBankName(){
        return bankName;
    }
    String getLocation(){
        return location;
    }
    class Account{
        private String accountHolder;
        private double balance;

        Account(String accountHolder, double balance){
            this.accountHolder = accountHolder;
            this.balance = balance;
        }
        void deposit(double amount){
           balance += amount;
            System.out.println("Amount $" + amount + " deposited.\nAvailable Balance: $" + balance);
        }
        void withdraw(double amount){
            if (amount > balance){
                System.out.println("Insufficient balance!");
            }else {
                System.out.println("Amount $" + amount + " is successfully withdraw.\nAvailable Balance: $" + balance);
            }
        }
        void printAccountInfo(){
            System.out.println("Bank: " + bankName);
            System.out.println("Location: " + location);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: $" + balance);
        }
        class Transaction{
            private String transactionType;
            private double transactionAmount;

            Transaction(String transactionType, double transactionAmount){
                this.transactionType = transactionType;
                this.transactionAmount = transactionAmount;
            }
            void printTransactionInfo(){
                System.out.println("Bank: " + bankName);
                System.out.println("Account Holder: " + accountHolder);
                System.out.println("Transaction type: " + transactionType);
                System.out.println("Transaction Amount: $" + transactionAmount);
            }
        }
    }
}