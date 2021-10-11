package ss6_inheritance.thuchanh;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*(Math.pow(Math.PI,2));
    }
    public double getPerimetter(){
        return this.radius*2*Math.PI;
    }
    public String toString(){
        return "A Circle with radius=" +this.radius +", which is a subclass of " +super.toString();
    }
}
