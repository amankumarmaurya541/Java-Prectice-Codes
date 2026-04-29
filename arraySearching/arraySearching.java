package arraySearching;

import java.util.Scanner;

public class arraySearching {
    public static void main(String[] args) {
        int[] arr = {2, 34, 23, 45, 56, 76, 221, 65, 89, 46};
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array searching ");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.println("Your number is found in the array.");
        }else {
            System.out.println("Your number is not found in the array.");
        }


    }

    public static boolean isFound(int[]arr, int num) {

        int index = 0;
        while (index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;

        }

            return false;

    }



    }

