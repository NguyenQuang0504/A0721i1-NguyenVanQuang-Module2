package ss3_array_and_method_in_java.baitap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        String text = "";
        int max = 0;
        int array_number[][];
        int row;
        int column;
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap so hang cua mang!!!");
        row = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap so cot cua mang!!!");
        column = Integer.parseInt(input.nextLine());
        array_number = new int[row][column];
        for(int i = 0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println("Ban hay nhap phan tu array_number[" +i +"][" +j +"] cua mang!!!");
                array_number[i][j] = Integer.parseInt(input.nextLine());
                text = text + array_number[i][j] +" ";
            }
            text = text +"\n";
        }
        for (int i=0;i<row;i++){
            for (int j =0;j<column;j++){
                if(array_number[i][j] > max){
                    max = array_number[i][j];
                }
            }
        }
        System.out.println("Mang ban nhap la:\n " +text);
        System.out.println("Max la: " +max);
    }
}
