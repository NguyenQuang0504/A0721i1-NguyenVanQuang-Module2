package ss6_inheritance.baitap.LopCicleVaCylinder;

public class Cylinder extends Circle {
    private double height = 1.0;
    public Cylinder(){

    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder( double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double setVolume(){
        return super.setArea()*this.height;
    }
    public String toString(){
        return super.toString() +" and height: " +this.height +" Volume: " +setVolume();
    }
}
