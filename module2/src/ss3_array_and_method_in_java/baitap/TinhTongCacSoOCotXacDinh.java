package ss3_array_and_method_in_java.baitap;

import java.util.Scanner;

public class TinhTongCacSoOCotXacDinh {
    public static void main(String[] args) {
        int row;
        int column;
        int sum = 0;
        int colum_sum;
        int matrix[][];
        String text = "\n";
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap so hang cua ma tran!!!");
        row = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap so cot cua ma tran!!!");
        column = Integer.parseInt(input.nextLine());
        matrix = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println("Ban hay nhap matrix[" +i +"][" +j +"]: ");
                matrix[i][j] = Integer.parseInt(input.nextLine());
                text = text +matrix[i][j] +" ";
            }
            text = text +"\n";
        }
        System.out.println("Mang ban vua nhap la: " +text);
        System.out.println("----------------------------------------------------------------------");
        do {
            System.out.println("Ban hay nhap cot muon tinh tong");
            colum_sum = Integer.parseInt(input.nextLine());
            if(colum_sum>=column){
                System.out.println("So hang khong dung\n");
            }
        }
        while (colum_sum>=column);
        for(int i=0;i<row;i++){
            sum = sum +matrix[i][colum_sum];
        }
        System.out.println("Tong cac phan tu cua cot thu " +colum_sum +" la: " +sum);
    }
}
