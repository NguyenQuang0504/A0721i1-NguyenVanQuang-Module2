package ss3_array_and_method_in_java.baitap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int array_1[];
        int array_2[];
        int array_3[];
        int index_1;
        int index_2;
        String text1="";
        String text2="";
        String text3="";
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap so phan tu cua mang 1");
        index_1 = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap so phan tu cua mang 2");
        index_2 = Integer.parseInt(input.nextLine());
        array_1 = new int[index_1];
        array_2 = new int[index_2];
        for(int i = 0;i<array_1.length;i++){
            System.out.println("Ban hay nhap phan tu thu " +i +" cua mang 1");
            array_1[i] = Integer.parseInt(input.nextLine());
            text1 = text1 +array_1[i] +",";
        }
        for(int i = 0;i<array_2.length;i++){
            System.out.println("Ban hay nhap phan tu thu " +i +" cua mang 2");
            array_2[i] = Integer.parseInt(input.nextLine());
            text2 = text2 +array_2[i]+",";
        }
        array_3 = new int[array_1.length+array_2.length];
        // Cong mang
        for(int i = 0;i<array_3.length;i++){
            if(i<array_1.length){
                array_3[i] = array_1[i];
                text3 = text3 +array_3[i] + ",";
            }
            else {
                array_3[i] = array_2[(i-(array_1.length))];
                text3 = text3 +array_3[i] + ",";
                }
        }
        System.out.println("Mang 1: " +text1);
        System.out.println("Mang 2: " +text2);
        System.out.println("Mang 3: " +text3);
    }
}
