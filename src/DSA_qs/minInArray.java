package DSA_qs;

import java.util.Scanner;

public class minInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array=");
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int minval=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minval) {
                minval = arr[i];
            }
        }
        System.out.println(minval);

            }

        }

