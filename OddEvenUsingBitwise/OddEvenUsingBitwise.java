package OddEvenUsingBitwise;

import java.util.Scanner;

public class OddEvenUsingBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome. I'm find Odd Or Even numbers using Bitwise operator");
        System.out.print("Enter A Number: ");
        int num = input.nextInt();

        if((num & 1) == 1){
            System.out.println("Given Number Is Odd");
        }else {
            System.out.println("Given Number Is Even");
        }

    }
}
