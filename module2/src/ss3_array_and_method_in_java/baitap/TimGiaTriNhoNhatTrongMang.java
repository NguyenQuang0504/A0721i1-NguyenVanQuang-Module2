package ss3_array_and_method_in_java.baitap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int min;
        int array_number[];
        int index;
        String text = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap so phan tu cua mang!!!");
        index = Integer.parseInt(input.nextLine());
        array_number = new int[index];
        for (int i=0;i<array_number.length;i++){
            System.out.println("Ban hay nhap phan tu thu " +i +" cua mang");
            array_number[i] = Integer.parseInt(input.nextLine());
            text = text +array_number[i] +" ";
        }
        min = array_number[0];
        for (int i = 0;i<array_number.length;i++){
            if (array_number[i] < min){
                min = array_number[i];
            }
        }
        System.out.println("Mang ban vua nhap la:" +text);
        System.out.println("Phan tu be nhat la: " +min);
    }
}
