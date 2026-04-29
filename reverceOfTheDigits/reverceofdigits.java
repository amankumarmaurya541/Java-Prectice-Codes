package reverceOfTheDigits;

import java.util.Scanner;

class reverceOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverce of digits");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int result = reverceOfNumber(num);
        System.out.println("Reverce of the number is: " + result);
    }

    public static int reverceOfNumber(int num){
        int newNumber = 0;
        while (num > 0){
            int digit = num % 10;
            newNumber = newNumber * 10 + digit;
            num /= 10;
        }
        return newNumber;

    }
}
