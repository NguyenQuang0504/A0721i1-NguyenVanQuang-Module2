package ss4_class_and_object_to_java.thuchanh;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        System.out.println("Ban hay nhap width: ");
        Scanner input = new Scanner(System.in);
        double width = Double.parseDouble(input.nextLine());
        System.out.println("Ban hay nhap height: ");
        double height = Double.parseDouble(input.nextLine());
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle.display());
    }
}
