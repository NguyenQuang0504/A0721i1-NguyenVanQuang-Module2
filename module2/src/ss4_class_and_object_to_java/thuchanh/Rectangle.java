package ss4_class_and_object_to_java.thuchanh;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width *this.height;
    }
    public double getPerimetter(){
        return (this.width + this.height)*2;
    }
    public String display(){
        return "Rectangle " +" Width: " +this.width +", " +" Height: " +this.height + " Area: " +this.getArea();
    }
}
