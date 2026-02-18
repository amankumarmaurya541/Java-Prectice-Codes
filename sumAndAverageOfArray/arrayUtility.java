package sumAndAverageOfArray;

import java.util.Scanner;

public class arrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int size = input.nextInt();
        int[] num = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("Enter your number " + (i+1) + ": ");
            num[i] = input.nextInt();
            i++;

        }
        return num;
    }


}


