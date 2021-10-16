package ss7_abstract_and_interface.baitap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

import ss6_inheritance.thuchanh.Shape;

public class Squares extends Shape implements Resizeable {
    private double size = 0.0d;

    public Squares() {
    }

    public Squares(double size) {
        this.size = size;
    }

    public Squares(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void resize(double percent) {
    this.size = this.size+this.size*(percent/100);
    }

    @Override
    public String toString() {
        return "Squares{" +
                "size=" + size +
                super.toString()+
                '}';
    }
}
