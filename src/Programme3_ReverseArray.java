import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class Programme3_ReverseArray {

    //main method
    public static void main(String[] args) {
        //assigning numbers in array
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        //code to calculate original order and reverse order
        for (int i = 0; i <arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr [arr.length - i - 1] = temp;
        }
        System.out.println("Reverse array: " + Arrays.toString(arr));
    }
}
