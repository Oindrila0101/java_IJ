package DSA_qs;
import java.util.Scanner;
public class largest_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("please enter the first number");
        int a= in.nextInt();
        System.out.println("please enter the second number");
        int b=in.nextInt();
        System.out.println("please enter the third number");
        int c= in.nextInt();
        int max=0;
        if(a>b){
            max=a;
        }
        else if (b>c) {
            max=b;
        } else if (c>max) {
            max=c;

        }
        System.out.println(max);

    }
}
