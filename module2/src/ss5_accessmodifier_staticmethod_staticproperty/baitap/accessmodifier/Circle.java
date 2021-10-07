package ss5_accessmodifier_staticmethod_staticproperty.baitap.accessmodifier;

public class Circle {
    //Hai properties kieu private
    private double radius = 1.0;
    private String color = "red";
    //Hai ham tao
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    //Phuong thuc
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
}
