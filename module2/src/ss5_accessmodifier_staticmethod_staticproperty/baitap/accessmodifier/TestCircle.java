package ss5_accessmodifier_staticmethod_staticproperty.baitap.accessmodifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap ban kinh duong tron: ");
        double radius = Double.parseDouble(input.nextLine());
        Circle circle = new Circle(radius);
        System.out.println("Ban kinh cua duong tron: " +circle.getRadius());
        System.out.println("Dien tich cua duong tron la: " +circle.getArea());
    }
}
