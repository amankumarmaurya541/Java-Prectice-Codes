package Assignment6;

public class Assignment6 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Aman Kumar Maurya", 5000);
        System.out.println("-------------------------Before Update---------------------------");
        ba.printDetail();
        System.out.println("-------------------------After Update---------------------------");
        ba.getName();
        ba.setBalance(10000);
        ba.printDetail();

    }
}
class BankAccount {
    private String accountHolderName;
    private double balance;

    BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getName(){
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if (balance >= 0){
            this.balance = balance;
        }else {
            System.out.println("Insufficient Balance");
        }


    }
    public void printDetail(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
    }
}
