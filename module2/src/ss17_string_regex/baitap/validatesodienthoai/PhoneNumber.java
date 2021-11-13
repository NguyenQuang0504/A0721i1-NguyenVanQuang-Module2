package ss17_string_regex.baitap.validatesodienthoai;

import java.util.Scanner;

public class PhoneNumber {
    private static final String NUMBER = "^[0-9]{2}[-]+[0]{1}[0-9]{9}$";
    public static void main(String[] args) {
        System.out.println("Ban hay nhap phonenumber");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        if(checkPhoneNumber(number)){
            System.out.println("Ban nhap number dung");
        }
        else {
            System.out.println("Ban nhap number sai");
        }
    }
    public static boolean checkPhoneNumber(String number){
        return number.matches(NUMBER);
    }
}
