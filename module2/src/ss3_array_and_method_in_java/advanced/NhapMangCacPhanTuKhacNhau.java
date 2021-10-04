package ss3_array_and_method_in_java.advanced;

import java.util.Scanner;

public class NhapMangCacPhanTuKhacNhau {
    public static void main(String[] args) {
        int index;
        String text = "";
        int i=0;
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("Ban hay nhap so phan tu cua mang");
        index = Integer.parseInt(input.nextLine());
        }
        while (index<0);
        int array[] = new int[index];
            do{
                boolean check = true;
                System.out.println("Ban hay nhap phan tu thu " +i +" cua mang");
                array[i] = Integer.parseInt(input.nextLine());
                for(int j = i-1;j>=0;j--){
                    if(array[i] == array[j]){
                        System.out.println("Ban nhap phan tu thu " +i +" bi trung!!");
                        check = false;
                        break;
                    }
                }
                if(check){
                    i++;
                }
            }
            while (i<index);
            for(int j=0;j<array.length;j++){
                text = text +array[j] +" ";
            }
        System.out.println("Mang ban vua nhap la: " +text);
    }
}
