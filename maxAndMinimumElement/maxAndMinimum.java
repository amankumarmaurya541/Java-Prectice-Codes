package maxAndMinimumElement;

import java.util.Scanner;
public class maxAndMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = arrayUtility.inputArray();
        int min = min(arr);
        int max = max(arr);
        System.out.println("Your maximum value in array is " + max);
        System.out.println("Your minimum value in array is " + min);
    }
    public static int min(int[] arr){
        int min = arr[0];
        int i = 0;
        while (i < arr.length){
            if(min > arr[i]){
                min = arr[i];
            }
            i++;

        }
        return min;
    }
    public static int max(int[] arr){
        int max = arr[0];
        int i = 0;
        while (i < arr.length){
            if(max < arr[i]){
                max = arr[i];

            }
            i++;

        }

        return max;
    }






}
