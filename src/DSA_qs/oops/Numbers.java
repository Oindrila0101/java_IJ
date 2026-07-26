package DSA_qs.oops;
//polymorphism (method overloading) (Compile time)
//The method name is the same.
//But the parameters are different.
//The compiler decides which method to call, so it is called Compile-time Polymorphism.

public class Numbers {
    double sum(double a, int b) {
        return a + b;
    }

    double sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(2, 3);
        obj.sum(1, 3, 7);

//        obj.sum(4, 5, 6, 8);
    }
}
