package Assignment14;

public class Assignment14 {
    public static void main(String[] args) {
        BankAccount cA = new CurrentAccount("Priyanshu Vishwakarma", 500000, 100000);
        BankAccount sA = new SavingsAccount("Aman Kumar Maurya", 100000, 15);
        System.out.println("Current account transection: ");
        cA.deposit(200000);
        cA.withdraw(500000);
        cA.printAccountInformation();
        System.out.println("------------------------------------------------");
        System.out.println("Saving account transection: ");
        sA.deposit(100000);
        sA.withdraw(50000);
        sA.printAccountInformation();
    }
}

 abstract class BankAccount{
    private String accountHolderName;
    private double balance;

    BankAccount(String accountHolderName, double balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }
    abstract double calculateInterest();
    abstract String accountType();
    void deposit(double amount){
        balance += amount;
        System.out.println(amount + " Deposited. New Balance: " + balance);
    }

    void withdraw(double amount){
        if (balance < amount){
            System.out.println("Insufficient balance!");
        }else {
            balance -= amount;
            System.out.println(amount + " Deduct. New Balance: " + balance);
        }
    }
    public void printAccountInformation(){
        System.out.println("Account Holder Name: " + getAccountHolderName());
        System.out.println("Account Type: " + accountType());
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest: " + calculateInterest());
    }

}
class SavingsAccount extends BankAccount{
    private double interestRate;

    SavingsAccount(String accountHolderName, double balance, double interestRate){
        super(accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public String accountType(){
        return "SavingsAccount";
    }
    public double calculateInterest(){
        return getBalance() * interestRate / 100;
    }
}
class CurrentAccount extends BankAccount{
    private double transactionLimit;

    CurrentAccount(String accountHolderName, double balance, double transactionLimit){
        super(accountHolderName, balance);
        this.transactionLimit = transactionLimit;
    }
    public String accountType(){
        return "Current Account";
    }
    public double calculateInterest(){
        return 0.0;
    }
    void withDraw(double amount){
        if (amount > transactionLimit){
            System.out.println("Transaction limit exceeded!");
        }else {
            super.withdraw(amount);
        }
    }
}