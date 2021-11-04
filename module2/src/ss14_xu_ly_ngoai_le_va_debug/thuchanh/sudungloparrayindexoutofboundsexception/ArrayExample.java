package ss14_xu_ly_ngoai_le_va_debug.thuchanh.sudungloparrayindexoutofboundsexception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Integer[] arr = new Integer[100];
        arr = createRandom();
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ban hay nhap index");
        int index = Integer.parseInt(scaner.nextLine());
        try{
            // Cau lenh co the xay ra exception khi nhap index lon hon do dai mang
            System.out.println("Phan tu thu " +index +" la :" +arr[index]);
        }
        catch (Exception e){
            // khi co exception thi in ra exception
            e.printStackTrace();
        }
        finally {
            System.out.println("Out");
        }
        System.out.println("Ket thuc");
    }
    public static Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        for(int i=0;i<arr.length;i++){
            arr[i] = rd.nextInt(100);
            System.out.println(" Array[" +i +"] = " +arr[i]);
        }
        return arr;
    }
}
