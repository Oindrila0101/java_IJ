package DSA_qs;
import java.util.Scanner;

public class return_string_fn {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your name");
        String naam=in.next();
        String personalized=myGreet(naam);
        System.out.println(personalized);
    }
    static String myGreet(String name){
        String message="Hii" + " " + name;
        return message;
    }
}
