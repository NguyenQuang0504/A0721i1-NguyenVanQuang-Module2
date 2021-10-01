package ss1_introduction_to_java.baitap;

import java.util.Scanner;

public class NumberIntoLetter {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
// Nhap so can chuyen
        do{
            System.out.println("Ban hay nhap so can chuyen: ");
            number = Integer.parseInt(input.nextLine());
        }
// Kiem tra neu so co 4 chu so hoac nho hon khong thi nhap lai
        while (number/1000>=1||number<0);
        if(number <=9){
            switch (number){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
        else if(number<20){
            int number_check = number%10;
            switch (number_check){
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Elevent");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fiveteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        }
        else if(number<100){
            int tens = number/10;
            int ones = number%10;
            String tens_letter = " ";
            String ones_letter = " ";
            switch (tens){
                case 2:
                    tens_letter = "Twenty";
                    break;
                case 3:
                    tens_letter = "Thirty";
                    break;
                case 4:
                    tens_letter = "Forty";
                    break;
                case 5:
                    tens_letter= "Fifty";
                    break;
                case 6:
                    tens_letter = "Sixty";
                    break;
                case 7:
                    tens_letter = "Seventy";
                    break;
                case 8:
                    tens_letter = "Eighty";
                    break;
                case 9:
                    tens_letter = "Ninety";
                    break;
            }
            switch (ones){
                case 0:
                    break;
                case 1:
                    ones_letter = "One";
                    break;
                case 2:
                    ones_letter = "Two";
                    break;
                case 3:
                    ones_letter = "Three";
                    break;
                case 4:
                    ones_letter = "Four";
                    break;
                case 5:
                    ones_letter = "Five";
                    break;
                case 6:
                    ones_letter = "Six";
                    break;
                case 7:
                    ones_letter = "Seven";
                    break;
                case 8:
                    ones_letter = "Eight";
                    break;
                case 9:
                    ones_letter = "Nine";
                    break;
            }
            System.out.println("Ket qua la: " +tens_letter +" " +ones_letter);
        }
        else{
            int hunderd = number/100;
            int tens = (number-hunderd*100)/10;
            int ones = number%10;
            String hundered_letter = " ";
            String tens_letter = " ";
            String ones_letter = " ";
            switch (hunderd){
                case 1:
                    hundered_letter = "One hundred";
                    break;
                case 2:
                    hundered_letter = "Two hundred";
                    break;
                case 3:
                    hundered_letter = "Three hundred";
                    break;
                case 4:
                    hundered_letter = "Four hundred";
                    break;
                case 5:
                    hundered_letter = "Five hundred";
                    break;
                case 6:
                    hundered_letter = "Six hundred";
                    break;
                case 7:
                    hundered_letter = "Seven hundred";
                    break;
                case 8:
                    hundered_letter = "Eight hundred";
                    break;
                case 9:
                    hundered_letter = "Nine hundred";
                    break;
            }
            switch (tens){
                case 2:
                    tens_letter = "Twenty";
                    break;
                case 3:
                    tens_letter = "Thirty";
                    break;
                case 4:
                    tens_letter = "Forty";
                    break;
                case 5:
                    tens_letter= "Fifty";
                    break;
                case 6:
                    tens_letter = "Sixty";
                    break;
                case 7:
                    tens_letter = "Seventy";
                    break;
                case 8:
                    tens_letter = "Eighty";
                    break;
                case 9:
                    tens_letter = "Ninety";
                    break;
            }
            switch (ones){
                case 0:
                    break;
                case 1:
                    ones_letter = "One";
                    break;
                case 2:
                    ones_letter = "Two";
                    break;
                case 3:
                    ones_letter = "Three";
                    break;
                case 4:
                    ones_letter = "Four";
                    break;
                case 5:
                    ones_letter = "Five";
                    break;
                case 6:
                    ones_letter = "Six";
                    break;
                case 7:
                    ones_letter = "Seven";
                    break;
                case 8:
                    ones_letter = "Eight";
                    break;
                case 9:
                    ones_letter = "Nine";
                    break;
            }
            System.out.println("Ket qua la: " +hundered_letter +" " +tens_letter +" " +ones_letter);
        }
    }
}
