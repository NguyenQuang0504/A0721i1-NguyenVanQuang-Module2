package ss3_array_and_method_in_java.thuchanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int max = 0;
        int array_number[];
        int index;
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap so phan tu cua mang:");
        index = Integer.parseInt(input.nextLine());
        array_number = new int[index];
        for(int i=0;i<array_number.length;i++){
            System.out.println("Ban hay nhap phan tu thu " +i +" cua mang");
            array_number[i] = Integer.parseInt(input.nextLine());
        }
        for(int i =0;i<array_number.length;i++){
            if(array_number[i]>=max){
                max = array_number[i];
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: " +max);
    }
}
