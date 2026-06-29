package DSA_qs;
import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter an array=");
        int[] arr=new int[4];

        //syntax
        //datatype[] variable_name=new datatype[size];
        //store 5 roll numbers
        int[] rolln=new int[5];
        //or directly
        int[] rolln2={12,35,67,23,78};

        // int[] rolln; //declaration of array, rolln is getting defined in the stack
        //rolln=new int[5]; // actually here object is being created in the memory(heap)

        //System.out.println(rolln[1]);

        // String [] arr=new String[4];
        // System.out.println(arr[0]);

        //String name=null;
        // int num=null;; this is wrong because primitive datatypes

        //input using for loop
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        /*for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
         */

        //for ech loop
        for(int num:arr){ // for every element in array,print the element
            System.out.println(num + " "); //here num represents element of the array
        }
        // System.out.println(arr[5]); // index out of bound error

        // array of objects
        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1]="oindrila";
        System.out.println(Arrays.toString(str));


    }
}
