package ss6_inheritance.baitap.LopCicleVaCylinder;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap radius");
        double radius = Double.parseDouble(input.nextLine());
        System.out.println("Ban hay nhap color");
        String color = input.nextLine();
        // Tao doi tuong circle
        Circle circle = new Circle(radius,color);
        System.out.println("In ra thong tin circle");
        System.out.println(circle.toString());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Ban hay nhap chieu cao");
        double height = Double.parseDouble(input.nextLine());
        // Khoi tao doi tuong Cylinder
        Cylinder cylinder = new Cylinder(radius,"blue",height);
        System.out.println(" In ra thong tin cua Cylinder");
        System.out.println(cylinder.toString());
    }
}
