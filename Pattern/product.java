package Pattern;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        pattern();
    }
    public static void pattern(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Pattern Operation");
        System.out.print("Enter The Number Of Colume: ");
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
