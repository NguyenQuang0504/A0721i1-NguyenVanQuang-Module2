package ss3_array_and_method_in_java.advanced;

import java.util.Scanner;

public class SapXepMangTangDan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index;
        int stack = 0;
        String text_input = "";
        String text_output = "";
        System.out.println("Ban hay nhap so phan tu cua mang");
        index = Integer.parseInt(input.nextLine());
        int array[] = new int[index];
        for( int i=0;i<array.length;i++){
            System.out.println("Ban hay nhap phan tu array[" +i +"] cua mang!!!");
            array[i] = Integer.parseInt(input.nextLine());
            text_input = text_input +array[i] +" ";
        }
        // Xap xep mang theo phuong phap noi bot
        for(int i=0;i<array.length;i++){
            for(int j=array.length-1;j>=1;j--){
                if(array[j]<array[j-1]){
                    stack = array[j];
                    array[j] = array[j-1];
                    array[j-1] = stack;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            text_output = text_output +array[i] +" ";
        }
        System.out.println("Mang ban nhap la: " +text_input);
        System.out.println("Mang su khi sap xep la:" +text_output);
    }
}
