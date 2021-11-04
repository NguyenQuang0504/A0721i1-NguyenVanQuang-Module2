package ss14_xu_ly_ngoai_le_va_debug.baitap.sudunglopillegaltriangleexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            setTriangle();
        }
        catch (ExceptionTriangle e){
            e.printStackTrace();
            System.out.println("Chay catch");
        }
        finally {
            System.out.println("Out");
        }
        System.out.println("Dung chuong trinh");
    }
    public static void setTriangle() throws ExceptionTriangle{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban hay nhap a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap b");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap c");
        int c = Integer.parseInt(scanner.nextLine());
        if(a<=0||b<=0||c<=0){
            throw new ExceptionTriangle("Ban nhap canh tam giac bi sai");
        }
        if(a+b<c||a+c<b||b+c<a){
            throw new ExceptionTriangle("Ban nhap 3 canh bi sai");
        }
    }
}
