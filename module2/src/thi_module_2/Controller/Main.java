package thi_module_2.Controller;

import thi_module_2.Service.ServiceDienThoaiChinhHang;
import thi_module_2.Service.ServiceDienThoaiXachTay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceDienThoaiChinhHang serviceDienThoaiChinhHang = new ServiceDienThoaiChinhHang();
        ServiceDienThoaiXachTay serviceDienThoaiXachTay = new ServiceDienThoaiXachTay();
        boolean check = true;
        String choices = null;
        do {
            System.out.println("OPCTION");
            System.out.println("1. ADD ");
            System.out.println("2. DELETE ");
            System.out.println("3. DISPLAY");
            System.out.println("4. SEARCH");
            System.out.println("5. EXIT");
            try {
                choices = scanner.nextLine();
            }catch (Exception e){
                e.printStackTrace();
            }
            switch (choices){
                case "1":
                    System.out.println("------------------------OPCTION-------------------------------");
                    System.out.println("1.ADD DIEN THOAI CHINH HANG");
                    System.out.println("2.ADD DIEN THOAI XACH TAY");
                    int choices1 = Integer.parseInt(scanner.nextLine());
                    switch (choices1){
                        case 1:
                            System.out.println("ADD DIEN THOAI CHINH HANG");
                            serviceDienThoaiChinhHang.add();
                            break;
                        case 2:
                            System.out.println("ADD DIEN THOAI XACH TAY");
                            serviceDienThoaiXachTay.add();
                            break;
                    }
                    break;
                case "2":
                    System.out.println("-----------------------OPCTION--------------------------------");
                    System.out.println("1.DELETE DIEN THOAI CHINH HANG");
                    System.out.println("2.DELETE DIEN THOAI XACH TAY");
                    int choices2 = Integer.parseInt(scanner.nextLine());
                    switch (choices2){
                        case 1:
                            serviceDienThoaiChinhHang.display();
                            System.out.println("Ban hay nhap id");
                            int id = Integer.parseInt(scanner.nextLine());
                            if(serviceDienThoaiChinhHang.searchId(id)){
                                System.out.println("Ban co muon xoa dien thoai chinh hang co id: " +id);
                                System.out.println("1.Yes");
                                System.out.println("2.No");
                                String choises = scanner.nextLine();
                                switch (choises){
                                    case "Yes":
                                        serviceDienThoaiChinhHang.delete(id);
                                        break;
                                    case "No":
                                        break;
                                }
                            }
                            break;
                        case 2:
                            serviceDienThoaiXachTay.display();
                            System.out.println("Ban hay nhap id");
                            int id1 = Integer.parseInt(scanner.nextLine());
                            if(serviceDienThoaiXachTay.searchId(id1)){
                                System.out.println("Ban co muon xoa dien thoai chinh hang co id: " +id1);
                                System.out.println("1.Yes");
                                System.out.println("2.No");
                                String choises = scanner.nextLine();
                                switch (choises){
                                    case "Yes":
                                        serviceDienThoaiXachTay.delete(id1);
                                        break;
                                    case "No":
                                        break;
                                }
                            }
                            break;
                    }
                    break;
                case "3":
                    System.out.println("--------------------------OPCTION-----------------------------");
                    System.out.println("1.DISPLAY DIEN THOAI CHINH HANG");
                    System.out.println("2.DISPLAY DIEN THOAI XACH TAY");
                    int choices3 = Integer.parseInt(scanner.nextLine());
                    switch (choices3){
                        case 1:
                            System.out.println("DISPLAY DIEN THOAI CHINH HANG");
                            serviceDienThoaiChinhHang.display();
                            break;
                        case 2:
                            System.out.println("DISPLAY DIEN THOAI XACH TAY");
                            serviceDienThoaiXachTay.display();
                            break;
                    }
                    break;
                case "4":
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Ban hay nhap ten cua dien thoai muon tim kiem");
                    String name = scanner.nextLine();
                    if(serviceDienThoaiChinhHang.check(name)||serviceDienThoaiXachTay.check(name)) {
                        if (serviceDienThoaiChinhHang.check(name)) {
                            System.out.println("Dien thoai chinh hang");
                            serviceDienThoaiChinhHang.search(name);
                        }
                        if (serviceDienThoaiXachTay.check(name)) {
                            System.out.println("Dien thoai xach tay");
                            serviceDienThoaiXachTay.search(name);
                        }
                    }
                    else {
                        System.out.println("Khong co dien thoai co ten nhu ban nhap");
                    }
                    break;
                case "5":
                    System.out.println("EXIT");
                    check = false;
                    break;
                default:
                    System.out.println("NO CORRECT");
                    break;
            }
        }
        while (check);
    }
}
