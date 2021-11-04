package ss14_xu_ly_ngoai_le_va_debug.thuchanh.sudunglopnumberformatexception;

import java.util.Scanner;

public class CoculationException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap y");
        int y = Integer.parseInt(scanner.nextLine());
        try{
            Coculator(x,y);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Ket thuc chuong trinh");
    }
    public static void Coculator(int x, int y) throws Exception{
        double sum = x+y;
        double sub = x-y;
        double mul = x*y;
        double div = x/y;
        System.out.println("Tong " +sum);
        System.out.println("Hieu " +sub);
        System.out.println("Tich " +mul);
        System.out.println("Thuong " +div);
    }
}
