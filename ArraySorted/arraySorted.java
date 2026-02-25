package ArraySorted;

import java.util.Scanner;

public class arraySorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array sorting code\n");
        int[] numArr = arrayUtility.inputArray();
        boolean Incerasing = isIncerasing(numArr);
        boolean Decerasing = isDecerasing(numArr);
        if(Incerasing || Decerasing){
            System.out.println(" Your array is sorted");
        }else {
            System.out.println(" Your array is not sorted");

        }



    }

    public static boolean isIncerasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length){
            if(numArr[i] < numArr[i - 1])
                return false;

            i++;

        }

            return true;

    }

    public static boolean isDecerasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length){
            if(numArr[i] > numArr[i - 1])
                return false;

            i++;

        }

        return true;

    }
}
