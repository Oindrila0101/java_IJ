package DSA_qs;
import java.util.Scanner;
import java.util.Arrays;

//Time Complexity: O(log n)

public class binarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter an array=");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }
        int start = 0;
        int end = arr.length - 1;
        //System.out.println(mid);
        System.out.println("enter your target=");
        int target = in.nextInt();
        boolean found = false;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("the target is found at index" + mid);
                found = true;
                break;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (!found) {
            System.out.println("not found");
        }
    }
}
