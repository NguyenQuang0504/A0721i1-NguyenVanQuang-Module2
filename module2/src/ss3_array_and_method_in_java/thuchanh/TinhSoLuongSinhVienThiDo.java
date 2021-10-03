package ss3_array_and_method_in_java.thuchanh;

import java.util.Scanner;

public class TinhSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        int count=0;
        double marks[];
        int students;
        String text = "";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Ban hay nhap so luong sinh vien");
            students = Integer.parseInt(input.nextLine());
            if(students>=30){
                System.out.println("So luong sinh vien ban nhap khong dung!");
            }
        }
        while (students>30);
        marks = new double[students];
        for(int i=0;i<marks.length;i++){
            System.out.println("Ban hay nhap diem cua sinh vien thu: " +(i+1));
            marks[i] = Double.parseDouble(input.nextLine());
            if(marks[i]>5.0){
                count = count +1;
            }
            text = text +marks[i] +" ";
        }
        System.out.println("Danh sach diem cua sinh vien: " +text +"\n So luong sinh vien do la: " +count);
    }
}
