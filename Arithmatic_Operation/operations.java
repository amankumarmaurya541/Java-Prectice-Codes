package Arithmatic_Operation;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = (double) a / b;
        int mod = a % b;

        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
        System.out.println("Modulus = " + mod);
    }
}