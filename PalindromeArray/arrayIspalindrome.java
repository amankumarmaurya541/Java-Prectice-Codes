package PalindromeArray;

public class arrayIspalindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to Pelindrome Checker");
        int[] numArr = arrayUtility.inputArray();
        boolean isPalin = isPalindrome(numArr);
        if(isPalin){
            System.out.println("Your Array is Pelindrom");
        }else {
            System.out.println("Your Array is not Pelindrom");
        }
    }

    public static boolean isPalindrome(int[] numArr){
        int i = 0;
        while (i < numArr.length){
            if(numArr[i] != numArr[(numArr.length - 1) - i ] ){
                return false;
            }
            i++;
        }
        return true;

    }
}
