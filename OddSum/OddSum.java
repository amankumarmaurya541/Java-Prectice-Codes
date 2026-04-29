package OddSum;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd sum");

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int result = oddSum(num);
        System.out.println("Sum of odd number: " + result);

    }

    public static int oddSum(int num){

        int sum = 0;
        int i = 1;
        while (i<=num){
            sum = sum + i;
            i= i + 2;
        }
            return sum;
    }
}
