package ss6_inheritance.baitap.LopPointVaMoveablePoint;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
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
    // Xay dung phuong thuc set x,y kieu float
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    // Xay dung phuong thuc getXY tra ve kieu du lieu la mang hai phan tu x,y
    public float[] getXY(){
        return new float[]  {this.x, this.y};
    }
    //Xay dung phuong thuc toString de tra ve doi tuong kieu String
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}'+
                    " Array: " + Arrays.toString(getXY());
    }
}
