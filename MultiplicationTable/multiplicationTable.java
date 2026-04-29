package MultiplicationTable;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication table ");
        System.out.print(" Enter the number: ");
        int num = input.nextInt();
        table(num);

    }
    public static void table(int num) {
        int i = 1;
        while (i <= 10) {
            int result = num * i;
            System.out.println( num + "X" + i + "=" + result);
            i++;
        }

    }
}
