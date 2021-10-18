package ss6_inheritance.thuchanh;

import ss7_abstract_and_interface.baitap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.Resizeable;

public class Shape implements Resizeable {
    private String color = "blue";
    private boolean filled = true;
    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public boolean getFilled(){
        return this.filled;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public String toString(){
        return "A Shape with color of " +this.color +" and"  +" filled " +this.filled;
    }

    @Override
    public void resize(double percent) {

    }

}
