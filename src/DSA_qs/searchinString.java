package DSA_qs;

import java.util.Scanner;
import java.util.Arrays;

public class searchinString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the String array=");
        String[] strarr = new String[5];
        for (int i = 0; i < strarr.length; i++) {
            strarr[i] = in.next();
        }
        System.out.println("enter your target string=");
        String target=in.next();
        boolean found=false;
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].equals(target)) { // == compares whether both variables refer to the same object in memory.
                // .equals() compares the actual text (content) of the strings.
                System.out.println("the target string is found at index" +" "+ i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("not found");
        }

    }
}
