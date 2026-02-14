package Rectangle;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to your own calculator...");
        System.out.print("Enter the value of Length: ");
        float l = input.nextFloat();

        System.out.print("Enter the value of Breath: ");
        float b = input.nextFloat();

        float Perimeter = 2 * (l + b);

        System.out.print("Perimeter Of Rectangle: " + Perimeter);
    }
}