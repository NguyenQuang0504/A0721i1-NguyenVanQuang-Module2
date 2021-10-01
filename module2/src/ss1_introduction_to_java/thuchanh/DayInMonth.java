package ss1_introduction_to_java.thuchanh;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        int month;
        Scanner input = new Scanner(System.in);
        System.out.println("Which month that you want to count days? ");
        month = Integer.parseInt(input.nextLine());
        switch (month){
            case 2:
                System.out.println("Thang " +month +" co 28 hoac 29 ngay!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " +month +" co 31 ngay");
                break;
            default:
                System.out.println("Thang " +month +" co 30 ngay");
        }
    }
}
