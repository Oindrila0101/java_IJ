package DSA_qs;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        pattern(n);
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * n - 1); k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
