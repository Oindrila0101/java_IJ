package DSA_qs;

public class fn_overloading {
    public static void main(String[] args) {
        fun(34);
        fun("oindrila pramanik");
    }

    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println(name);
    }
}
