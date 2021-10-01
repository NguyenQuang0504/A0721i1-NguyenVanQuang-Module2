package ss1_introduction_to_java.baitap;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        int rate;
        int usd;
        int vnd;
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap ty gia giua USD va VND");
        rate = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap so tien USD: ");
        usd = Integer.parseInt(input.nextLine());
        vnd = rate*usd;
        System.out.println("Ty so: " +rate +"\n" +"USD: " +usd +"\n" +"VND: " +vnd);
    }
}
