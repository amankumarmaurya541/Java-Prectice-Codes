package numberOccurrences;

import java.util.Scanner;

public class numberOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = arrayUtility.inputArray();
        System.out.println("Welcome to Occurrences.");
        System.out.print("Emter which number you want to find: ");
        int num = input.nextInt();
        int occurrences = ouccurrences(arr , num);
        System.out.println("Your number is " + occurrences + " times in array");



    }
    public static int ouccurrences(int[] arr, int num){
        int occur = 0;
        int i = 0;
        while (i < arr.length){
            if(arr[i] == num){
                occur ++ ;

            }
            i++;

        }
        return occur;

    }

}
