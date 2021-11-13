package ss17_string_regex.thuchanh.validateemail;

import java.util.Scanner;

public class EmailExample {
    public static final String EMAIL_CHECK = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban hay nhap email muon check");
        String email = scanner.nextLine();
        if(check(email)){
            System.out.println("Ban nhap dung email");
        }
        else {
            System.out.println("Ban nhap sai email");
        }
    }

    public static boolean check(String email){
        return email.matches(EMAIL_CHECK);
    }
}
