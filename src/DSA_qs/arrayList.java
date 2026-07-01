package DSA_qs;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //syntax
        ArrayList<Integer> list=new ArrayList<>(5);

        list.add(67);
        list.add(24);
        list.add(243);
        list.add(342);


       // System.out.println(list.contains(24));
        list.set(0,99);
        list.remove(2);
       // System.out.println(list);
        
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            
        }
        //get irtem at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here,list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
