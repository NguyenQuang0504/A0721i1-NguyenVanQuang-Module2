package ss6_inheritance.baitap.LopPoint2DVaPoint3D;

import java.awt.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Ban hay nhap X");
        Scanner input = new Scanner(System.in);
        float x = Float.parseFloat(input.nextLine());
        System.out.println("Ban hay nhap Y");
        float y = Float.parseFloat(input.nextLine());
        Point2D point2d = new Point2D(x,y);
        System.out.println("In ra thong tin Point2D");
        System.out.println("Thong tin" +point2d.toString());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Ban hay nhap Z");
        float z = Float.parseFloat(input.nextLine());
        Point3D point3d = new Point3D(x,y,z);
        System.out.println(point3d.toString());
    }
}
