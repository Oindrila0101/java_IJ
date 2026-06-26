package DSA_qs;
import java.util.Scanner;

public class function2 {
    public static void main(String[] args) {
       int ans= mul();
        System.out.println(ans);
    }

    //return the value
    static int mul(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=in.nextInt();
        System.out.println("enter second number");
        int num2=in.nextInt();
        int result=num1*num2;
        return result;
    }
}
