package sumAndAverageOfArray;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = arrayUtility.inputArray();
        System.out.println("Welcome to the calculetor of Sum And Average of Array.");
        long result = Sum(arr);
        double average = average(arr);
        System.out.println("Sum of the Array is: " + result);
        System.out.println("Average of the element is: " + average);
    }


    public static long Sum(int[] num) {
        int sum = 0;
        int index = 0;
        while (index < num.length) {
            sum += num[index];
            index++;

        }
        return sum;

    }

    public static double average(int[] arr) {
        long sum = Sum(arr);
        return sum / arr.length;

    }

    }


