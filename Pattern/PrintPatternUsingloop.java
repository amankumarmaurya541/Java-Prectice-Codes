package PrintPatternUsingloop;

import java.util.Scanner;

public class PrintPatternUsingloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Pattern Operation");
        System.out.println("Enter The Number Of Colume: ");
        int col = input.nextInt();

        int row = 1;
        while(row <= col){
            System.out.println();
            int i = 1;
            while(i <= row){
                System.out.print("* ");
                i++;
            }row++;
        }
    }
}