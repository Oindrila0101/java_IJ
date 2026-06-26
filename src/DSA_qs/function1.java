package DSA_qs;
import java.util.Scanner;

public class function1 {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=in.nextInt();
        System.out.println("enter second number");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("result="+ sum);
    }
}
