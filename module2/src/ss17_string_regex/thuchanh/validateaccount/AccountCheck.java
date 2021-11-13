package ss17_string_regex.thuchanh.validateaccount;

import java.util.Scanner;

public class AccountCheck {
    public static final String ACCOUNT = "^[_a-z0-9]{6,}$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban hay nhap Account");
        String account = scanner.nextLine();
        if(check(account)){
            System.out.println("Ban nhap account dung");
        }
        else {
            System.out.println("Ban nhap account sai");
        }
    }
    public static boolean check(String account){
        return account.matches(ACCOUNT);
    }
}
