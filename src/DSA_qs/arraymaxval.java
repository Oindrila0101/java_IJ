package DSA_qs;
import java.util.Arrays;
import java.util.Scanner;
public class arraymaxval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array=");
        int[] arr = new int[5];
        int maxVal=arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

            System.out.println(maxVal);
        }
    }
