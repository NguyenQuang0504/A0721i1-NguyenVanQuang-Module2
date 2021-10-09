package ss5_accessmodifier_staticmethod_staticproperty.baitap.accessmodifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        System.out.println("Ban hay nhap radius cho Circle 1");
        Scanner input = new Scanner(System.in);
        double radius = Double.parseDouble(input.nextLine());
        System.out.println("Ban hay nhap radius cho Circle 2");
        double radius1 = Double.parseDouble(input.nextLine());
        Circle circle = new Circle(radius);
        Circle circle1 = new Circle(radius1);
        System.out.println("Ban kinh cua Circle1: " +circle.getRadius());
        System.out.println("Ban kinh cua Circle2: " +circle1.getRadius());
        System.out.println("Dien tich 2 hinh Circle: " +circle.getArea() +" va " +circle1.getArea());
    }
}
