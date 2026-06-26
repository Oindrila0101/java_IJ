package DSA_qs;
import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("please enter a number");
        int n=in.nextInt();
        if(n<1){
            System.out.println(n);
            return;
        }
        int p=0;
        int q=1;
        int count=2;
        while(count<=n){
            int temp=q;
            q=q+p;
            p=temp;
            count++;
        }
        System.out.println(q);
        //return q;
    }
}
