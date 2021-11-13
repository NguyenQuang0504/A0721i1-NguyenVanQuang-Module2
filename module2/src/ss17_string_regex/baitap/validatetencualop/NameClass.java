package ss17_string_regex.baitap.validatetencualop;

import java.util.Scanner;

public class NameClass {
    static final String NAME_CLASS = "^[ACP]+[0-9]{4}[GHIKLM]$";
    public static void main(String[] args) {
        System.out.println("Ban hay nhpa ten lop muon kiem tra");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(check(name)){
            System.out.println("Ten ban nhap dung");
        }
        else {
            System.out.println("Ten ban nhap sai nha");
        }
    }
    public static boolean check(String nameClass){
        return nameClass.matches(NAME_CLASS);
    }
}
