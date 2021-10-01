package ss2_loop_in_java.thuchanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap so thu nhat: ");
        number1 = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap so thu hai: ");
        number2 = Integer.parseInt(input.nextLine());
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);
        if(number1 == 0 && number2 ==0){
            System.out.println("Khong co UCLN");
        }
        else if(number1 == 0 || number2 ==0){
            if(number1==0){
                System.out.println("UCLN la: " +number2);
            }
            else {
                System.out.println("UCLN la: " +number1);
            }
        }
        else {
            while (number1!=number2){
                if(number1>number2){
                    number1 = number1 -number2;
                }
                else {
                    number2 = number2 - number1;
                }
            }
            System.out.println("UCLN  la: " +number1);
        }
    }
}
