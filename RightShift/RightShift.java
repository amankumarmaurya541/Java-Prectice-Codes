package RightShift;

import java.util.Scanner;

public class RightShift {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To RightShift Operation ");

        System.out.print("Enter the value of Number: ");
        int Num = input.nextInt();

        System.out.print("Enter The Shift: ");
        int Shift = input.nextInt();

        int result = Num >> Shift;

        System.out.println("The RightShift Of The Number: " + result);
    }
}