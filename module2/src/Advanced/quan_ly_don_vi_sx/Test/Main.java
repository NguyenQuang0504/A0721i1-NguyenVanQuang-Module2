package Advanced.quan_ly_don_vi_sx.Test;

import Advanced.quan_ly_don_vi_sx.Control.Cadres;
import Advanced.quan_ly_don_vi_sx.Control.Employee;
import Advanced.quan_ly_don_vi_sx.Control.Engineer;
import Advanced.quan_ly_don_vi_sx.Control.Worker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cadres[] cadres = new Cadres[100];
        boolean check = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay chon Opction!!!");
        do{
            System.out.println("1. Nhap thong tin cho can bo!!!");
            System.out.println("2. Tim kiem theo ten!!!");
            System.out.println("3. Hien thi danh sach can bo!!!");
            System.out.println("4. Thoat!!!");
            int opction = Integer.parseInt(input.nextLine());
            switch (opction){
                case 1:
                    System.out.println("1. Nhap thong tin Worker!!!");
                    System.out.println("2. Nhap thong tin Engineer!!!");
                    System.out.println("3. Nhap thong tin Employee!!!");
                    int opction1 = Integer.parseInt(input.nextLine());
                    switch (opction1){
                        case 1:
                            System.out.println("Nhap Worker");
                            System.out.println("Ban hay nhap ten cua worker ");
                            String name = input.nextLine();
                            System.out.println("Ban hay nhap ngay thang nam sinh");
                            String date = input.nextLine();
                            System.out.println("Ban hay nhap address");
                            String address = input.nextLine();
                            System.out.println("Ban hay nhap gioi tinh");
                            String gender = input.nextLine();
                            System.out.println("Ban hay nhap cap bac");
                            String level = input.nextLine();
                            Worker worker = new Worker(name,date,address,gender,level);
                            for(int i =0;i<cadres.length;i++){
                                if(cadres[i]==null){
                                    cadres[i] = (Worker)worker;
                                    break;
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Nhap Engneer!!!");
                            System.out.println("Ban hay nhap ten cua engneer ");
                            String name1 = input.nextLine();
                            System.out.println("Ban hay nhap ngay thang nam sinh");
                            String date1 = input.nextLine();
                            System.out.println("Ban hay nhap address");
                            String address1 = input.nextLine();
                            System.out.println("Ban hay nhap gioi tinh");
                            String gender1 = input.nextLine();
                            System.out.println("Ban hay nhap chuyen nganh");
                            String specialized = input.nextLine();
                            Engineer engineer = new Engineer(name1,date1,address1,gender1,specialized);
                            for(int i =0;i<cadres.length;i++){
                                if(cadres[i]==null){
                                    cadres[i] = (Engineer)engineer;
                                    break;
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Nhap Employee!!!");
                            System.out.println("Ban hay nhap ten cua engneer ");
                            String name2 = input.nextLine();
                            System.out.println("Ban hay nhap ngay thang nam sinh");
                            String date2 = input.nextLine();
                            System.out.println("Ban hay nhap address");
                            String address2 = input.nextLine();
                            System.out.println("Ban hay nhap gioi tinh");
                            String gender2 = input.nextLine();
                            System.out.println("Ban hay nhap cong viec");
                            String work = input.nextLine();
                            Employee employee = new Employee(name2,date2,address2,gender2,work);
                            for(int i =0;i<cadres.length;i++){
                                if(cadres[i]==null){
                                    cadres[i] = (Employee)employee;
                                    break;
                                }
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Thong tin can bo can tim kiem!!!!");
                    System.out.println("Ban hay nhap ten can bo!!!");
                    String name = input.nextLine();
                    for(int i =0;i<cadres.length;i++){
                        if(cadres[i]!=null) {
                            if (cadres[i].getName().equals(name)) {
                                System.out.println(cadres[i]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Danh sach can bo !!!");
                    for (Cadres cadres2: cadres) {
                        if (cadres2 != null) {
                            System.out.println(cadres2.toString());
                        }
                    }
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    check=false;
                    break;
            }
        }
        while (check);
    }
}
