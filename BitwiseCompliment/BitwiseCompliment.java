package BitwiseCompliment;

import java.util.Scanner;

class BitwiseCompliment {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Bitwise Comliment Operation");

        System.out.print("Enter Your Number: ");
        int Num = input.nextInt();

        int result = ~Num;

        System.out.println("Bitwise Compliment of a number: " + result);
    }
}