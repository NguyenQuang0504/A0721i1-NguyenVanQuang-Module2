package ss7_abstract_and_interface.baitap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

import ss6_inheritance.thuchanh.Shape;

public class Circle extends Shape implements Resizeable{
    private double radius = 0.0d;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public void resize(double percent) {
       this.setRadius(this.radius*(percent/100)+this.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                super.toString() +
                '}';
    }
}
