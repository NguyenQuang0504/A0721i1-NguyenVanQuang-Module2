package ss6_inheritance.baitap.LopTriangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap do dai canh 1:");
        double side1 = Double.parseDouble(input.nextLine());
        System.out.println("Ban hay nhap do dai canh thu hai");
        double side2 = Double.parseDouble(input.nextLine());
        System.out.println("Ban hay nhap do dai canh thu 3: ");
        double side3 = Double.parseDouble(input.nextLine());
        System.out.println("Ban hay nhap color");
        String color = input.nextLine();
        Triangle triangle = new Triangle(color, true, side1, side2, side3);
        System.out.println(triangle.toString());
    }
}
