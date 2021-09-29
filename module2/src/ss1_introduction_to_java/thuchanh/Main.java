package ss1_introduction_to_java.thuchanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        Double r;
        final double PI = 3.14d;
        Scanner input =  new Scanner(System.in);
        System.out.println("Ban hay nhap ban kinh hinh tron");
        r = Double.parseDouble(input.nextLine());
        double S = PI*r*r;
        System.out.println("Dien tich hinh tron la:" +S);
    }
}
