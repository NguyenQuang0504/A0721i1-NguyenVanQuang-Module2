package ss3_array_and_method_in_java.thuchanh;
import java.util.Scanner;

public class TimViTriCuaSinhVienTrongMang {
    public static void main(String[] args)
    {
        int count = 0;
        boolean check = true;
        String[] nameStudent;
        int index;
        String student;
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap so luong sinh vien: ");
        index = Integer.parseInt(input.nextLine());
        nameStudent = new String[index];
        for(int i=0;i<nameStudent.length;i++){
            System.out.println("Ban hay nhap phan tu thu " +i +" cua mang");
            nameStudent[i] = input.nextLine();
        }
        System.out.println("Ban hay nhap ten sinh vien muon tim kiem vi tri: ");
        student = input.nextLine();
        for(int i=0;i<nameStudent.length;i++){
            if(nameStudent[i].equals(student)){
                count = i;
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Sinh vien ban nhap khong co trong danh sach!!!");
        }
        else {
            System.out.println("Sinh vien ban nhap nam o vi tri thu " +count +" cua sanh sach");
        }
    }
}
