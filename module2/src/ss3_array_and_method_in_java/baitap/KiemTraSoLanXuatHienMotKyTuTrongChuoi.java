package ss3_array_and_method_in_java.baitap;

import java.util.Scanner;

public class KiemTraSoLanXuatHienMotKyTuTrongChuoi {
    public static void main(String[] args) {
        String str;
        int count=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap chuoi!!");
        str = input.nextLine();
        char check='a';
        for(int i=0;i<str.length();i++){
            if(check == str.charAt(i)){
                count = count +1;
            }
        }
        System.out.println("Chuoi ban nhap: " +str);
        System.out.println("So lan xuat hien cua ky tu a la: " +count);
    }
}
