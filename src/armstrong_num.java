package DSA_qs;
import java.util.Scanner;
public class armstrong_num {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number=");
        int n=in.nextInt();

        armstrong(n);

    }
    static void armstrong(int n){
        int original=n;
        int sum=0;
        while(n>0) {
            int rem = n % 10;
            int cube = (int) Math.pow(rem, 3);
            sum = sum + cube;
            n = n / 10;
        }

            if (original==sum) {
                System.out.println("armstrong number");
            } else {
                System.out.println("not a armstrong number");
            }

    }

}

