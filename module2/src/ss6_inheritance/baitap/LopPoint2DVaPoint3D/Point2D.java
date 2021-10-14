package ss6_inheritance.baitap.LopPoint2DVaPoint3D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D(){

    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    // trả ve mang 2 phan tu x va y
    public float[] getXY(){
        return new float[] {this.x, this.y};
    }
    // In ra mang bang cach in ra phuong thuc getXy
    public String toString(){
        return "Point2D: " + Arrays.toString(getXY());
    }
}
