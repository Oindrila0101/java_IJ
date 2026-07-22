package DSA_qs.oops;

//outside classes can not be static only inner classes can be static
public class Innerclass {

    static class Test{
        String name;

        public Test(String name){
            this.name=name;
        }

    }

    public static void main(String[] args) {
        Test a=new Test("oindrila");
        Test b=new Test("bitisha");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
/*ststic class A{

}
 */