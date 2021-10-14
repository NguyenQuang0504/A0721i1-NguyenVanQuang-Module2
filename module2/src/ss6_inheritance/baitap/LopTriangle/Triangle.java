package ss6_inheritance.baitap.LopTriangle;

import ss6_inheritance.thuchanh.Shape;

public class Triangle extends Shape {
    private double side1 = 0.0;
    private double side2 = 0.0;
    private double side3 = 0.0;

    public Triangle() {
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return this.side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        double p = (this.side1+this.side2+this.side3)/2;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
    }
    public double getPerimetter(){
        return this.side1+this.side2+this.side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3
                +", Area: " +getArea() +
                " , Primetter: " +getPerimetter()+
                ", color: " +super.toString()+
                '}';
    }
}
