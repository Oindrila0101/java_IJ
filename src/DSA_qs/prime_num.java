package DSA_qs;
import java.util.Scanner;
public class prime_num {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number=");
        int n=in.nextInt();
        prime(n);

    }
    static void prime(int n){
        int count=0;
        if(n<1){
            System.out.println("wrong number");;

        }
        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                count++;
            }
        }
            if(count==2){
                System.out.println("prime number");
            }
            else{
                System.out.println("not prime number");
            }

        }
    }

