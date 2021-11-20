package case_study.services;

import case_study.models.Booking;
import case_study.models.Customer;

import java.util.*;

public class PromotionServiceImpl {
    private Scanner scanner = new Scanner(System.in);
    BookingServiceImpl list = new BookingServiceImpl();
    static CustomerServiceImpl listCustomer = new CustomerServiceImpl();
    static List<Customer> listCustomerService = new ArrayList<>();
    static Stack<Customer> getListCustomerVoucher = new Stack<>();
    List<Integer> listNumber = new ArrayList<>();
    static {
//        listCustomerService.add(new Customer(1,"Quang",05042000,"Nam",192130,+8439711,"quang10a30504@gmail.com","Dai hoc","Hue"));
//        listCustomerService.add(new Customer(2,"Quang2",05042000,"Nam",192130,+8439711,"quang10a30504@gmail.com","Dai hoc","Hue"));
//        listCustomerService.add(new Customer(3,"Quang3",05042000,"Nam",192130,+8439711,"quang10a30504@gmail.com","Dai hoc","Hue"));
    }
    public void display(){
        Set<Booking>  temp = (Set<Booking>) list.getListBooking();
        System.out.println("Ban hay nhap nam muon hien thi");
        int years = Integer.parseInt(scanner.nextLine());
         for (Booking list: list.getListBooking()){
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
    public void getVoucher(){
        Set<Booking>  temp = (Set<Booking>) list.getListBooking();
        System.out.println("Ban hay nhap nam muon hien thi");
        int years = Integer.parseInt(scanner.nextLine());
        for (Booking list: list.getListBooking()){
            if(list.getYears()==years){
                for (Customer list1: listCustomer.getListCustomer()){
                    if(list1.getId()==list.getIdCustomer()){
                        listCustomerService.add(list1);
                    }
                }
            }
        }
        for (Booking list1: list.getListBooking()){
            for (Customer list2: listCustomerService){
                if(list1.getIdCustomer() == list2.getId()){
                    getListCustomerVoucher.push(list2);
                }
            }
        }
        System.out.println("Ban dang hien co so khach hang su dung dich vu la: " +getListCustomerVoucher.size());
        for (Customer list: getListCustomerVoucher){
            System.out.println("Ban hay nhap phan tram khuyen mai cua ma khuyen mai nay!!!!!!");
            int km = Integer.parseInt(scanner.nextLine());
            listNumber.add(km);
        }
        int count = getListCustomerVoucher.size();
        System.out.println("--------------------------------------------List Customer getVoucher--------------------------------------");
        for(int i=0;i<2;i++){
            System.out.println(getListCustomerVoucher.pop() +" He so khuyen mai: " +listNumber.get(i));
        }
    }
}
