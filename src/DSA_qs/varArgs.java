package DSA_qs;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,67,34,89,23,69);
        multiple(2,4,"oindrila","Bitisha");

    }
    static void multiple(int a,int b,String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
