package ss7_abstract_and_interface.baitap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

import ss6_inheritance.thuchanh.Shape;

public class Rectangle extends Shape implements Resizeable {
    private double width = 0.0d;
    private double height = 0.0d;
    public Rectangle(){

    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void resize(double percent) {
    this.width = this.width +this.width*(percent/100);
    this.height = this.height +this.height*(percent/100);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                super.toString() +
                '}';
    }
}
