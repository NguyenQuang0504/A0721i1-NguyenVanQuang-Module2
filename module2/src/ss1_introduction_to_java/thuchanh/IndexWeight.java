package ss1_introduction_to_java.thuchanh;

import java.util.Scanner;

public class IndexWeight {
    public static void main(String[] args) {
        double weight;
        double height;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Ban hay nhap can nang: ");
            weight = Double.parseDouble(input.nextLine());
        }
        while (weight>500||weight<=0);
        do {
            System.out.println("Ban hay nhap chieu cao: ");
            height = Double.parseDouble(input.nextLine());
        }
        while (height>3.0||height<=0);
        double bmi = weight/(height*height);
        System.out.println("Chi so BMI cua ban la: " +bmi);
        if(bmi>=30){
            System.out.println("Obese");
        }
        else if(bmi>=25){
            System.out.println("Overweight");
        }
        else if(bmi>=18.5){
            System.out.println("Normal");
        }
        else{
            System.out.println("Underweight");
        }
    }
}
