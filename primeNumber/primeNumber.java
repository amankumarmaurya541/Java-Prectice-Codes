package primeNumber;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number checker");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        boolean isPrime =  primeNumber(num);
        if(isPrime){
            System.out.println("your number is prime number ");
        }else {
            System.out.println("Your number is not prime");
        }

    }
    public static boolean primeNumber(int num){
        int i = 2;
        while(i < num){
            if(num % i == 0) {
                return false;
            }
            i++;
        }

        return true;

    }
}
