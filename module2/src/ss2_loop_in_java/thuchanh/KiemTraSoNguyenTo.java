package ss2_loop_in_java.thuchanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        int a;
        boolean check = true;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Ban hay nhap so muon kiem tra: ");
            a = Integer.parseInt(input.nextLine());
        }
        while (a<=1);
        for(int i = 2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println(a +" la so nguyen to!!!");
        }
        else {
            System.out.println(a +" khong la so nguyen to!!!");
        }
    }
}
