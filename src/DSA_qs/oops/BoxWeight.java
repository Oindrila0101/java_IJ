package DSA_qs.oops;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l,double h,double w,double weight){
        super(l,h,w);
        //super() is used in a child class to call the constructor of the parent class.
        // call the parent class constructor
        //used to initialize values present in parent class

        //System.out.println(super.w);
        this.weight=weight;
    }

}
