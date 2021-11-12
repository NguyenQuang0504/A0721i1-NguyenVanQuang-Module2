package ss16_binary_file_serialization.baitap.quanlysanphamluurafilenhiphan;

import com.sun.scenario.effect.impl.state.AccessHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static String LINK_PATH = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\ss16_binary_file_serialization\\baitap\\quanlysanphamluurafilenhiphan\\data\\Product.dat";

    public static void main(String[] args) {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        ServiceProduct listProduct = new ServiceProduct();
        do {
            System.out.println("1. ADD");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4. EXIT");
            System.out.println("------------------------------------------Nhap opction--------------------------------------");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    System.out.println("ADD");
                    listProduct.add();
                    break;
                case 2:
                    System.out.println("DISPLAY");
                    listProduct.display();
                    break;
                case 3:
                    System.out.println("SEARCH");
                    listProduct.search();
                    break;
                default:
                    check = false;
            }
        }
        while (check);
    }
}
