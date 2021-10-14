package ss6_inheritance.baitap.LopPointVaMoveablePoint;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap x:");
        float x = Float.parseFloat(input.nextLine());
        System.out.println("Ban hay nhap y: ");
        float y = Float.parseFloat(input.nextLine());
        Point point = new Point(x,y);
        System.out.println(point.toString());
        point.setX(3.9f);
        System.out.println(point.toString());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Ban hay nhap xSpeed: ");
        float xSpeed = Float.parseFloat(input.nextLine());
        System.out.println("Ban hay nhap ySpeed");
        float ySpeed = Float.parseFloat(input.nextLine());
        MoveablePoint movePoint = new MoveablePoint(x,y,xSpeed,ySpeed);
        System.out.println(movePoint.toString());
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Move");
        movePoint.move();
        System.out.println(movePoint.toString());
    }
}
