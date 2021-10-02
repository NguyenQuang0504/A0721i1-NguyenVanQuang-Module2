package ss3_array_and_method_in_java.thuchanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        String text = "";
        String out_text = " ";
        int c;
        int number_array[] = new int[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <number_array.length;i++){
            System.out.println("Ban hay nhap phan tu thu " +i +" cua mang");
            number_array[i] = Integer.parseInt(input.nextLine());
            text = text +number_array[i] +",";
        }
        System.out.println("Mang nhap vao la: "+text);
        for(int i=0;i<number_array.length/2;i++){
            c = number_array[i];
            number_array[i] = number_array[number_array.length-1-i];
            number_array[number_array.length-1-i] = c;
        }
        for (int i=0;i<number_array.length;i++){
            out_text = out_text +number_array[i] +",";
        }
        System.out.println("Mang sau khi sap xep la: " +out_text);
    }
}
