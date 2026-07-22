package DSA_qs.oops;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("hello world");
        //System.out.println(this.age); // tou cannot use this keyword in static
    }

    public Human(int age,String name,int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;
    }
}
