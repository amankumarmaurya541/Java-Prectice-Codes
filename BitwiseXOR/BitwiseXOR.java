package BitwiseXOR;

import java.util.Scanner;

class BitwiseXOR {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to BitwiseXOR");

        System.out.print("Enter the value of first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter Your Second Number: ");
        int secondNum = input.nextInt();

        int result = firstNum ^ secondNum;

        System.out.println("BitwiseXOR of two number is: " + result);
    }
}