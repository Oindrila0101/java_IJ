package DSA_qs;
import java.util.Arrays;
import java.util.Scanner;

public class searchin2Darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter array=");
        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        System.out.println("enter your target=");
        int target = in.nextInt();
        boolean found = false;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++)
                if (arr[row][col] == target) {
                    System.out.println("the target is found at row" + row + "column" + col);
                    found = true;
                    break;
                }
        }
        if (!found) {
            System.out.println("not found");
        }
    }
}
