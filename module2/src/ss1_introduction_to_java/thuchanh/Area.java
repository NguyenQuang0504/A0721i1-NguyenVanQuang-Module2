// Tính dienj tích hcn với thông số được nhập từ bàn phím
package ss1_introduction_to_java.thuchanh;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap width:");
        a = Double.parseDouble(input.nextLine());
        System.out.println("Ban hay nhap height:");
        b = Double.parseDouble(input.nextLine());
        double area = a*b;
        System.out.println("Dien tich cua hinh chu nhat la: " +area);
    }
}
