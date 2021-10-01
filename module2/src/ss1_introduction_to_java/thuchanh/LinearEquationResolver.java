package ss1_introduction_to_java.thuchanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        double a;
        double b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap he so a: ");
        a = Double.parseDouble(input.nextLine());
        System.out.println("Ban hay nhap he so b: ");
        b = Double.parseDouble(input.nextLine());
        System.out.println("Ban hay nhap he so c: ");
        c = Double.parseDouble(input.nextLine());
        if(a==0){
            if(b==c){
                System.out.println("Phuong trinh co vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem!!!");
            }
        }
        else{
            double result = (c-b)/a;
            System.out.println("Nghiem cua phuong trinh la: " +result);
        }
    }
}
