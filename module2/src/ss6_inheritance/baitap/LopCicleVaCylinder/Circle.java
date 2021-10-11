package ss6_inheritance.baitap.LopCicleVaCylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){

    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double setArea(){
        return  this.radius*Math.PI*Math.PI;
    }
    public double setPrimetter(){
        return 2*Math.PI*this.radius;
    }
    public String toString(){
        return "radius: " +this.radius +" color: " +this.color +" Area: " +setArea() +" Primetter: " +setPrimetter();
    }
}
