package DSA_qs.oops;

public class Main {
    public static void main(String[] args) {
        Human oindrila=new Human(22,"oindrila",10000,false);
        Human bitisha=new Human(32,"bitisha",20000,true);
        Human debayani=new Human(38,"debayani",70000,false);
        Human ipsita=new Human(52,"ipsita",50000,false);

        System.out.println(Human.population);
        System.out.println(Human.population);

        Main funn=new Main();
        funn.fun2();

        //greeting();

    }

    //this is not dependent on objects
    static void fun(){
        //Non-static method 'greeting()' cannot be referenced from a static context
        //you can use this because it requires an instance but the function you are using it in does not depend on instances
        //greeting();

        //you cannot access non static stuff without referencing their instances in a static context
        //hence, here i am referrencing it
        Main obj=new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }

    //we know that something which is not static, belongs to an object
    void greeting(){
        //fun();
        System.out.println("hello world");
    }
}

//static method is belonged to the class do not belonged to the object

//inside a static method you cannot use anything that is non-static
