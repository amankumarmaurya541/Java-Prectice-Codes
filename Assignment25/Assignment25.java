package Assignment25;

public class Assignment25 {
    public static void main(String[] args) {
        LoanSystem loanSystem = new LoanSystem();
        loanSystem.checkEligibility("Shivansh", 26, 29000);
        System.out.println("-----------------------------------");
        loanSystem.checkEligibility("EndRealms", 27, 22000);
        System.out.println("-----------------------------------");
        loanSystem.checkEligibility("Shivangi", 18, 35000);
        System.out.println("-----------------------------------");
        loanSystem.calculateEMI("Shivansh", 260000, 9, 6);

    }
}

class LoanSystem{
    void checkEligibility(String customerName, int age, double salary){
        class EligibilityChecker{
            Boolean isAgeValid(){
                if (age >= 21 && age <= 60){
                    return true;
                }else {
                    return false;
                }
            }

            Boolean isSalaryValid(){
                if (salary >= 25000){
                    return true;
                }else {
                    return false;
                }
            }
            void checkResult(){
                if (isAgeValid() && isSalaryValid()){
                    System.out.println(customerName + " is eligible for loan!");
                }
                if(!isAgeValid()){
                    System.out.println(customerName + " is not eligible — age criteria not met!");
                }
                if (!isSalaryValid()){
                    System.out.println(customerName + " is not eligible — salary criteria not met!");
                }
                if (!isAgeValid() && !isSalaryValid()){
                    System.out.println(customerName + " is not eligible — age and salary criteria not met!");
                }
            }
        }
        EligibilityChecker ec = new EligibilityChecker();
        ec.checkResult();
    }
    void calculateEMI(String customerName, double loanAmount, double interestRate, int months){
        class EMICalculator{
            double calculateMonthlyEMI(){
                return (loanAmount + (loanAmount * interestRate / 100)) / months;
            }
            void printEMIDetail(){
                System.out.println("Customer Name: " + customerName);
                System.out.println("Lone Amount: " + loanAmount);
                System.out.println("Interest Rate: " + interestRate);
                System.out.println("Months: " + months);
                System.out.println("Monthly EMI: " + calculateMonthlyEMI());
            }
        }
        EMICalculator calculator = new EMICalculator();
        calculator.printEMIDetail();
    }
}
