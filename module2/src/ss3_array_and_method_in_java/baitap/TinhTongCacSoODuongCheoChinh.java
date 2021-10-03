package ss3_array_and_method_in_java.baitap;

import java.util.Scanner;

public class TinhTongCacSoODuongCheoChinh {
    public static void main(String[] args) {
        int row;
        int sum = 0;
        int matrix[][];
        String text = "\n";
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap so hang va cot cua ma tran!!!");
        row = Integer.parseInt(input.nextLine());
        matrix = new int[row][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.println("Ban hay nhap matrix[" +i +"][" +j +"]: ");
                matrix[i][j] = Integer.parseInt(input.nextLine());
                text = text +matrix[i][j] +" ";
            }
            text = text +"\n";
        }
        System.out.println("Mang ban vua nhap la: " +text);
        System.out.println("----------------------------------------------------------------------");
        for(int i=0;i<row;i++){
            sum = sum +matrix[i][i];
        }
        System.out.println("Tong cac phan tu o duong cheo chinh la: " +sum);
    }
}
