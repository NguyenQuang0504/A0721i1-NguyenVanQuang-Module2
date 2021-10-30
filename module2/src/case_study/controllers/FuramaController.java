package case_study.controllers;

import case_study.services.CustomerServiceImpl;
import case_study.services.EmployeeService;
import case_study.services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        boolean check = true;
        EmployeeServiceImpl employees = new EmployeeServiceImpl();
        CustomerServiceImpl customerList = new CustomerServiceImpl();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.println("Ban hay chon cac opction");
            int choisee = Integer.parseInt(input.nextLine());
            switch (choisee){
                case 1:
                    System.out.println("-------------------------------------Employee Mannagement----------------------------------");
                    System.out.println("" +
                            "1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tEdit employee\n" +
                            "4\tReturn main menu\n");
                    int choisee1 = Integer.parseInt(input.nextLine());
                    switch (choisee1){
                        case 1:
                            System.out.println("-------------------------------------------------------------Display list employee-----------------------------------------------");
                            employees.display();
                            break;
                        case 2:
                            System.out.println("---------------------------------------------------------------Add new employee---------------------------------------------------");
                            employees.add();
                            break;
                        case 3:
                            System.out.println("-------------------------------------------------------------------Edit employee------------------------------------------------------");
                            employees.edit();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("---------------------------------------Customer Mannagement--------------------------------");
                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    int choisee2 = Integer.parseInt(input.nextLine());
                    switch (choisee2){
                        case 1:
                            System.out.println("---------------------------------------------------------------Display list customers------------------------------------------------------");
                            customerList.display();
                            break;
                        case 2:
                            System.out.println("----------------------------------------------------------------Add new customers---------------------------------------------------------");
                            customerList.add();
                            break;
                        case 3:
                            System.out.println("----------------------------------------------------------------Edit customers--------------------------------------------------------------");
                            customerList.edit();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("-------------------------------------Facility Mannagement---------------------------------");
                    System.out.println("1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    int choisee3 = Integer.parseInt(input.nextLine());
                    switch (choisee3){
                        case 1:
                            System.out.println("Display list facility");
                            break;
                        case 2:
                            System.out.println("Add new facility");
                            break;
                        case 3:
                            System.out.println("Display list facility maintenance");
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("--------------------------------------Booking Mannagement----------------------------------");
                    System.out.println("1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    int choisee4 = Integer.parseInt(input.nextLine());
                    switch (choisee4){
                        case 1:
                            System.out.println("Add new booking");
                            break;
                        case 2:
                            System.out.println("Display list booking");
                            break;
                        case 3:
                            System.out.println("Create new constracts");
                            break;
                        case 4:
                            System.out.println("Display list constracts");
                            break;
                        case 5:
                            System.out.println("Edit constracts");
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("--------------------------------------Promotion Mannagement--------------------------------");
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    int choisee5 = Integer.parseInt(input.nextLine());
                    switch (choisee5){
                        case 1:
                            System.out.println("Display list customers use service");
                            break;
                        case 2:
                            System.out.println("Display list customer get voucher");
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    check = false;
            }
        }
        while (check);
    }
}
