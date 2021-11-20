package case_study.services;

import case_study.data.WriteAndReadFile;
import case_study.models.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public final String PATH = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\case_study\\data\\customer.csv";
    static WriteAndReadFile writeAndReadFile = new WriteAndReadFile();
    static Scanner input = new Scanner(System.in);
    public void set() {
        LinkedList<Customer> list = new LinkedList<>();
        list.add(new Customer(1, "Quang", 05042000, "Nam", 192130, +8439711, "quang10a30504@gmail.com", "Dai hoc", "Hue"));
        list.add(new Customer(2, "Quang2", 05042000, "Nam", 192130, +8439711, "quang10a30504@gmail.com", "Dai hoc", "Hue"));
        list.add(new Customer(3, "Quang3", 05042000, "Nam", 192130, +8439711, "quang10a30504@gmail.com", "Dai hoc", "Hue"));
        writeAndReadFile.writeFile(PATH, list);
    }
    public LinkedList<Customer> getListCustomer(){
        List<String> list = writeAndReadFile.readFile(PATH);
        LinkedList<Customer> list1 = new LinkedList<>();
        for (String list2: list){
            String arr[] = list2.split(",");
            Customer customer = new Customer(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8]);
            list1.add(customer);
        }
        return list1;
    }
    public Customer input1(){
        System.out.println("Ban hay nhap id Customer");
        int idEmployee = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap name Customer");
        String nameEmployee = input.nextLine();
        System.out.println("Ban hay nhap date cua Customer");
        int dateEmployee = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap gender Customer");
        String genderEmployee = input.nextLine();
        System.out.println("Ban hay nhap CMND Customer");
        int cmndEmployee = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap phone number Customer");
        int phoneNumberEmployee = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap Email Customer");
        String emailEmployee = input.nextLine();
        System.out.println("Ban hay nhap level Customer");
        String levelEmployee = input.nextLine();
        System.out.println("Ban hay nhap address Customer");
        String addressCustomer = input.nextLine();
        return new Customer(idEmployee,nameEmployee,dateEmployee,genderEmployee,cmndEmployee,phoneNumberEmployee,emailEmployee,levelEmployee,addressCustomer);
    }
    public void add() {
        LinkedList<Customer> list = new LinkedList<>();
        list = getListCustomer();
        list.add(input1());
        writeAndReadFile.writeFile(PATH,list);
    }

    @Override
    public void display() {
        LinkedList<Customer> list = getListCustomer();
        for (Customer list1: list){
            System.out.println(list1.toString1());
        }
    }

    @Override
    public void edit() {
        System.out.println("Ban hay nhap id Customer muon edit");
        boolean check = false;
        int id = Integer.parseInt(input.nextLine());
        LinkedList<Customer> listCustomer = getListCustomer();
        int size = listCustomer.size();
        for(int i = 0;i<size;i++){
            if(listCustomer.get(i).getId()==id){
                listCustomer.add(i,input1());
                listCustomer.remove(i+1);
                check = true;
            }
        }
        writeAndReadFile.writeFile(PATH, listCustomer);
        if(!check){
            System.out.println("Ban nhap id khong dung");
        }
    }
}
