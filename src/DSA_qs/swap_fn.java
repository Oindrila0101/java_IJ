package DSA_qs;
import java.util.Scanner;
public class swap_fn {
    public static void main(String[] args) {
        int a=10;
        int b=20;

      /*  int temp=a;
        a=b;
        b=temp;

        /* If you mean swapping inside a method, this will not work:
        static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
        because Java passes primitive types (int) by value, so only copies of a and b are swapped.
        The original variables in main() remain unchanged.
        */

        swap(a,b);
        System.out.println(a + " " +b);

    }
    static void swap(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
    }
}
