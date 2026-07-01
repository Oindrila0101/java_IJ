import java.util.Arrays;
import java.util.Scanner;

public class arraySwap2 {

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        swap(arr, 2, 5);   // Swaps elements at index 2 and 5

        System.out.println(Arrays.toString(arr));
    }
}