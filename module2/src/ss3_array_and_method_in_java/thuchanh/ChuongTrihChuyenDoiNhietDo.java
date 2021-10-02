package ss3_array_and_method_in_java.thuchanh;

import java.util.Scanner;

public class ChuongTrihChuyenDoiNhietDo {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 3) {
            System.out.println("1. C to F\n" +
                    "2. F to C\n" +
                    "3. Exit");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Ban hay nhap vao do C: ");
                    double do_c = Double.parseDouble(input.nextLine());
                    System.out.println("Do F: " +CtoF(do_c));
                    break;
                case 2:
                    System.out.println("Ban hay nhap vao do F: ");
                    double do_f = Double.parseDouble(input.nextLine());
                    System.out.println("Do C: " +FtoC(do_f));
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
    public static double CtoF(double C){
        return (9.0 / 5) *C  + 32;
    }
    public static double FtoC(double F){
        return (5.0 / 9) * (F - 32);
    }
}
