package ss11_java_collection_framework.baitap.luyentapsudungArrayListLinkedListvaJavaCollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> listProduct = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    public void add(){
        System.out.println("Ban hay nhap id");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap ten Product");
        String name = input.nextLine();
        System.out.println("Ban hay nhap khoi luong Product");
        int weight = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap gia Product");
        int price = Integer.parseInt(input.nextLine());
        Product products = new Product(id,name,weight,price);
        listProduct.add(products);
    }
    public void display(){
        for (int i = 0;i<listProduct.size();i++){
            System.out.println(listProduct.get(i));
        }
    }
    public void repair(){
        boolean check = false;
        int count = 0;
        System.out.println("Ban hay nhap id muon sua thong tin!!!");
        int id = Integer.parseInt(input.nextLine());
        for(int i = 0;i<listProduct.size();i++){
            if(listProduct.get(i).getId() == id){
                check = true;
                count = i;
                break;
            }
        }
        if(check){
            System.out.println("Ban hay nhap id moi");
            int id1 = Integer.parseInt(input.nextLine());
            System.out.println("Ban hay nhap ten Product moi");
            String name = input.nextLine();
            System.out.println("Ban hay nhap khoi luong Product moi");
            int weight = Integer.parseInt(input.nextLine());
            System.out.println("Ban hay nhap gia Product moi");
            int price = Integer.parseInt(input.nextLine());
            Product products = new Product(id1,name,weight,price);
            listProduct.add(count,products);
            listProduct.remove(count+1);
        }
        else {
            System.out.println("Ban nhap id khong dung");
        }
    }
    public void delete(){
        System.out.println("Ban hay nhap id muon xoa");
        boolean check = false;
        int cout = 0;
        int id = Integer.parseInt(input.nextLine());
        for(int i = 0;i<listProduct.size();i++){
            if(listProduct.get(i).getId()==id){
                check = true;
                listProduct.remove(i);
            }
        }
        if(!check){
            System.out.println("Ban nhap id khong dung!!!!!!!!!!");
        }
    }
    public void search(){
        System.out.println("Ban hay nhap ten Product muon tim kiem");
        boolean check = false;
        String name = input.nextLine();
        for(int i = 0;i<listProduct.size();i++){
            if(listProduct.get(i).getName().equals(name)){
                System.out.println("-----------------------------------San pham ban muon tim la!!!!!!--------------------------------------");
                System.out.println(listProduct.get(i));
                check = true;
            }
        }
        if(!check){
            System.out.println("San pham ban tim kiem khong co!!!!!!!!");
        }
    }
    public void sort(){
        listProduct.sort((o1, o2) ->o1.getPrice()-o2.getPrice());
    }
}
