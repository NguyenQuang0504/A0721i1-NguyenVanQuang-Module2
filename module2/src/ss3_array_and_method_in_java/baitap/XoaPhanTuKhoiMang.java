package ss3_array_and_method_in_java.baitap;

import java.lang.reflect.Array;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        String text = "";
        int index;
        double element;
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap so phan tu cua mang:");
        index = Integer.parseInt(input.nextLine());
        double array_number[] = new double[index];
        for (int i=0;i<array_number.length;i++){
            System.out.println("Ban hay nhap phan tu thu " +i +" cua mang!!!");
            array_number[i] = Double.parseDouble(input.nextLine());
        }
        System.out.println("Ban hay nhap phan tu muon xoa!!!");
        element = Double.parseDouble(input.nextLine());
        for(int i = 0;i<array_number.length;i++){
            if(array_number[i] == element){
                for(int j = i;j<array_number.length-1;j++){
                    array_number[j] = array_number[j+1];
                }
                i--;
            }
            array_number[array_number.length-1] = 0;
        }
        for(int i=0;i<array_number.length;i++){
            text = text  +array_number[i] +",";
        }
        System.out.println(text);
    }
}
