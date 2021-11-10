package case_study.services;

import case_study.models.Customer;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public LinkedList<Customer> listCustomer = new LinkedList<>();
    static Scanner input = new Scanner(System.in);
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
        listCustomer.addFirst(input1());
    }

    @Override
    public void display() {
        for(int i = 0;i<listCustomer.size();i++){
            System.out.println(listCustomer.get(i).toString());
        }
    }

    @Override
    public void edit() {
        System.out.println("Ban hay nhap id Employee muon edit");
        boolean check = false;
        int id = Integer.parseInt(input.nextLine());
        for(int i = 0;i<listCustomer.size();i++){
            if(listCustomer.get(i).getId()==id){
                listCustomer.add(i,input1());
                listCustomer.remove(i+1);
                check = true;
            }
        }
        if(!check){
            System.out.println("Ban nhap id khong dung");
        }
    }
}
