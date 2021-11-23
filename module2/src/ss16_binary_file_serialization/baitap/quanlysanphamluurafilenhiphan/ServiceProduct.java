package ss16_binary_file_serialization.baitap.quanlysanphamluurafilenhiphan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceProduct {
    public static String LINK_PATH = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\ss16_binary_file_serialization\\baitap\\quanlysanphamluurafilenhiphan\\data\\Product.dat";
    private Scanner scanner = new Scanner(System.in);
    ReadAndWriteFile list = new ReadAndWriteFile();
    List<Product> listProduct = new ArrayList<>();
    public void add(){
        System.out.println("Ban hay nhap id Product");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("Ban hay nhap cost Product");
        int cost = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id,name,cost);
        listProduct = list.readFile(LINK_PATH);
        listProduct.add(product);
        list.writeFile(LINK_PATH, listProduct);
        listProduct.clear();
    }
    public void search(){
        System.out.println("Ban hay nhap ID");
        int id = Integer.parseInt(scanner.nextLine());
     for (Product list1: list.readFile(LINK_PATH)){
         if(list1.getIdProduct() == id){
             System.out.println(list1);
         }
     }
    }
    public void display(){
      for (Product list: list.readFile(LINK_PATH)){
          System.out.println(list);
      }
    }
}
