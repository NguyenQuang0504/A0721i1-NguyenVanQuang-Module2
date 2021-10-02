package ss3_array_and_method_in_java.thuchanh;

import java.util.Scanner;

public class TimMinSuDungPhuongThuc {
    public static void main(String[] args) {
        int index;
        System.out.println("Ban hay nhap so phan tu cua mang: ");
        Scanner input = new Scanner(System.in);
        index = Integer.parseInt(input.nextLine());
        double array[] = new double[index];
        for( int i = 0;i<array.length;i++){
            System.out.println("Ban hay nhap phan tu thu " +i +" cua mang!");
            array[i] = Double.parseDouble(input.nextLine());
        }
        System.out.println("Phan tu nho nhat trong mang la: " +min(array));
    }
    public static double min(double[] array){
        double min = array[0];
        for(int i = 0;i<array.length;i++){
            if(array[i]<=min){
                min = array[i];
            }
        }
        return min;
    }
}
