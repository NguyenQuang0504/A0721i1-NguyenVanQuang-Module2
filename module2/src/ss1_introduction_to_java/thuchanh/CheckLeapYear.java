package ss1_introduction_to_java.thuchanh;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Year:");
        year = Integer.parseInt(input.nextLine());
        if(year%4==0){
            if(year%100==0 && year%400!=0){
                System.out.println(year +" is NOT leap year!!!");
            }
            else {
                System.out.println(year +" is leap year!!!");
            }
        }
        else{
            System.out.println(year + " is NOT leap year!!!");
        }
    }
}
