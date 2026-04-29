package LeftShift;

import java.util.Scanner;

class LeftShift {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To LeftShift Operation ");

        System.out.print("Enter the value of Number: ");
        int Num = input.nextInt();

        System.out.print("Enter The Shift: ");
        int Shift = input.nextInt();

        int result = Num << Shift;

        System.out.println("The LeftShift Of The Number: " + result);
    }
}