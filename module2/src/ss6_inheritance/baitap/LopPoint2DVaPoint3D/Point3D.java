package ss6_inheritance.baitap.LopPoint2DVaPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
        super.setX(x);
        super.setY(y);
    }
    //Phuong thuc tra ve mang 3 phan tu la x,y,z
    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), this.z};
    }
    // Phuong thuc tra ve mang bang cach goi phuong thuc getXYZ
    public String toString() {
        return "Point3D: " + Arrays.toString(getXYZ());
    }
}
