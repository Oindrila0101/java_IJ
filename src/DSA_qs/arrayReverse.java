
package DSA_qs;
import java.util.Arrays;
import java.util.Scanner;

public class arrayReverse{

    static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        reverse(arr);

        System.out.println("Reversed Array:");
        System.out.println(Arrays.toString(arr));
    }
}