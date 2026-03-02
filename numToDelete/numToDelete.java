package numToDelete;

import java.util.Scanner;

public class numToDelete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to array deletion\n");
        int[] numArr = arrayUtility.inputArray();
        System.out.print("Enter the number you want to delete: ");
        int numDelete = input.nextInt();
        int[] newArr = arrayDelete(numArr , numDelete);
        System.out.println("New array is here");
        int i = 0;
        while (i < newArr.length){
            System.out.print(newArr[i] + " ");
            i++;
        }
        System.out.println();



    }

    public static int [] arrayDelete( int[] numArr , int numDelete){
        int occ = numberOccurrences.ouccurrences(numArr , numDelete);
        if(occ == 0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int [] newArr =  new int[newSize];

        int i = 0, j = 0;
        while (i < numArr.length){
            if (numArr[i] != numDelete){
                newArr[j] = numArr[i];
                j++;
            }

            i++;

        }


        return newArr;


        }


    }

