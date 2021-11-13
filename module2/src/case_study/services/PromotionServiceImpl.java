package case_study.services;

import case_study.models.Booking;
import case_study.models.Customer;

import java.util.*;

public class PromotionServiceImpl {
    private Scanner scanner = new Scanner(System.in);
    BookingServiceImpl list = new BookingServiceImpl();
    CustomerServiceImpl listCustomer = new CustomerServiceImpl();
    List<Customer> listCustomerService = new ArrayList<>();
    public void display(){
        Set<Booking>  temp = list.getList();
        System.out.println("Ban hay nhap nam muon hien thi");
        int years = Integer.parseInt(scanner.nextLine());
         for (Booking list: list.getList()){
             if(list.getYears()==years){
                 for (Customer list1: listCustomer.getListCustomer()){
                     if(list1.getId()==list.getIdCustomer()){
                         listCustomerService.add(list1);
                     }
                 }
             }
         }
        System.out.println("Customer su dung dich vu");
         for (Customer lis2: listCustomerService){
             System.out.println(lis2);
         }
    }
}
