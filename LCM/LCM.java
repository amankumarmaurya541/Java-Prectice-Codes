package LCM;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM operation");
        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        int result = LCM(first,second);
        System.out.println("LCM is: " + result);
    }

    public static int LCM(int first, int second){
        int i = 1;
        while(i <= 10){
            int fector = first * i;
            if(fector % second == 0){
                return fector;
            }
            i++;
        }
        return 0;
    }
}
