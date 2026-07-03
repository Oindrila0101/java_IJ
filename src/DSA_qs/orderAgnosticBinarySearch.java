package DSA_qs;
import java.util.Scanner;
public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 sorted elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter target: ");
        int target = in.nextInt();

        int start = 0;
        int end = arr.length - 1;

        // Check if array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Target found at index " + mid);
                return;
            }

            if (isAsc) {

                // Ascending Order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                // Descending Order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        System.out.println("Target not found");
    }
}
