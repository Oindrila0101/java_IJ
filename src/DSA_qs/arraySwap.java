package DSA_qs;
import java.util.Arrays;
import java.util.Scanner;

public class arraySwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array=");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+  " ");

        }

         */
        System.out.println("enter first index");
        int index1=in.nextInt();
        System.out.println("enter second index");
        int index2=in.nextInt();
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

        System.out.println("after swapping=");
        System.out.println(Arrays.toString(arr));

            //System.out.println(Arrays.toString(arr[i]));
    }
}
