package ss4_class_and_object_to_java.baitap.QuadraticEquation;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap a, b, c: ");
        double a = Double.parseDouble(input.nextLine());
        double b = Double.parseDouble(input.nextLine());
        double c = Double.parseDouble(input.nextLine());
        QuadraticEquation quadraticequation = new QuadraticEquation(a,b,c);
        if(quadraticequation.Discriminant()>0){
            System.out.println("Phuong trinh co 2 nghiem la: " +quadraticequation.getRoot1() +" va " +quadraticequation.getRoot2());
        }
        else if(quadraticequation.Discriminant()==0){
            System.out.println("Phuong trinh co nghiem duy nhat la: " +quadraticequation.getRoot1());
        }
        else{
            System.out.println("Not Root!!!");
        }
    }
}
