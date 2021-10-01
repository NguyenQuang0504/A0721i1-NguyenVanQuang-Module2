package ss2_loop_in_java.thuchanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        float money;
        float rate;
        double interest = 0;
        int month;
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap so tien gui vao: ");
        money = Float.parseFloat(input.nextLine());
        System.out.println("Ban hay nhap lai suat: ");
        rate = Float.parseFloat(input.nextLine());
        System.out.println("Ban hay nhap so thang gui: ");
        month = Integer.parseInt(input.nextLine());
        for(int i = 0; i < month; i++){
            interest += money * (rate/100)/12 * month;
        }
        System.out.println("So tien lai nhan duoc la: " +interest);
    }
}
