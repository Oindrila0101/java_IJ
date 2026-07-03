package DSA_qs;
import java.util.Arrays;
import java.util.Scanner;

//Time Complexity: O(n)

public class linearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array=");
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter your target=");
        int target=in.nextInt();
        boolean found=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("the target is found at index" + i);
                found = true;
                break;
            }
        }
           if(!found){
               System.out.println("not found");
           }

        }
    }

