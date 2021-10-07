package ss4_class_and_object_to_java.baitap.quadraticequation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double Discriminant(){
        return Math.pow(this.b,2)-4*this.a*this.c;
    }
    public double getRoot1(){
        if(this.Discriminant()>=0){
            return (-this.b+Math.sqrt(this.Discriminant()))/2*this.a;
        }
        else {
            return 0;
        }
    }
    public double getRoot2(){
        if(this.Discriminant()>=0){
            return (-this.b-Math.sqrt(this.Discriminant()))/2*this.a;
        }
        else {
            return 0;
        }
    }

}
