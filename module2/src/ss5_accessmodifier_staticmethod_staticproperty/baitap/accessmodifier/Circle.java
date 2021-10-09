package ss5_accessmodifier_staticmethod_staticproperty.baitap.accessmodifier;

public class Circle {
    // Khoi tao hai thuoc tinh co access modifier la private
    private double radius = 1.0;
    private String color = "red";
    //Khoi tao hai ham tao la khong tham so va 1 tham so la radius
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    //Khoi tao hai phuong thuc co access modifier la public la getRadius va getArea
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.pow(Math.PI,2)*this.radius;
    }
}
