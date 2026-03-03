package arrayReversing;

public class arrayReversing {
    public static void main(String[] args) {
        System.out.println("Welcome to Array reversal");
        int [] numArr = arrayUtility.inputArray();
        arrayReverse(numArr);
        System.out.println("Reversed Array is: ");
        int [] displayArray = arrayUtility.DisplayArray(numArr);
    }

    public static void arrayReverse(int[] numArr){
        int i = 0;
        while (i < numArr.length / 2){
            int swap = numArr[i];
            numArr[i] = numArr[(numArr.length - 1) - i];
            numArr[(numArr.length - 1) - i] = swap;

            i++;

        }
    }
}
