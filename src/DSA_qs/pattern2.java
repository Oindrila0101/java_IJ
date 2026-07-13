package DSA_qs;
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number=");
        int n = in.nextInt();
        pattern(n);


    }

    static void pattern(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}


