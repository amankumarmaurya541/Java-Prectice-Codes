package Assignment24;

public class Assignment24 {
    public static void main(String[] args) {
        CalculatorApp calculatorApp = new CalculatorApp();
        calculatorApp.calculate(20, 5);
        System.out.println("-------------------------------------------------------------");
        System.out.println("------------ For Number 17 -------------");
        calculatorApp.checkNumber(17);

    }
}
class CalculatorApp{
    void calculate(int a, int b){
        class MathOperations{
            void add(){
                System.out.println("Addition: " + (a + b));
            }
            void sub(){
                System.out.println("Substraction: " + (a - b));
            }
            void mul(){
                System.out.println("Multiplication: " + (a * b));
            }
            void div(){
                if (b == 0){
                    System.out.println("Cannot divide by zero!");
                }else{
                    System.out.println("Division: " + (a / b));
                }
            }
        }
        MathOperations mathOperations = new MathOperations();
        mathOperations.add();
        mathOperations.sub();
        mathOperations.mul();
        mathOperations.div();
    }
    void checkNumber(int number){
        class NumberChecker{
            boolean isEven(){
                return number % 2 == 0;
            }
            boolean isPositive(){
                return number > 0;
            }
            void printResult(){
                if (isEven()){
                    System.out.println(number + " Is Even");
                }else {
                    System.out.println(number + " Is Odd");
                }

                if (isPositive()){
                    System.out.println(number + " Is Positive");
                }else {
                    System.out.println(number + " Is Negative");
                }
            }
        }
        NumberChecker numberChecker = new NumberChecker();
        numberChecker.printResult();
    }
}