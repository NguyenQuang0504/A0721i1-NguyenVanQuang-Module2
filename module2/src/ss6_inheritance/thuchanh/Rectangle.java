package ss6_inheritance.thuchanh;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double lenght = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.lenght = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLenght() {
        return this.lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public String toString(){
        return "A Rectangle with width=" +this.width +" and length=" +this.lenght +", which is a subclass of " +super.toString();
    }
}
