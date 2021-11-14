package case_study.services;

import case_study.models.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    Scanner input = new Scanner(System.in);
    public static ArrayList<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add( new Employee(1, "Thuy", 8600, "Nu", 123, 3456, "thuykawaii@gmail.com", "Daihoc", "HH", 30000000));
        employeeList.add( new Employee(2, "Thuy2", 8600, "Nu", 123, 3456, "thuykawaii@gmail.com", "Daihoc", "HH", 30000000));
        employeeList.add( new Employee(3, "Thuy3", 8600, "Nu", 123, 3456, "thuykawaii@gmail.com", "Daihoc", "HH", 30000000));
    }
    public Employee input1(){
        System.out.println("Ban hay nhap id Employee");
        int idEmployee = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap name Employee");
        String nameEmployee = input.nextLine();
        System.out.println("Ban hay nhap date cua Employee");
        int dateEmployee = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap gender Employee");
        String genderEmployee = input.nextLine();
        System.out.println("Ban hay nhap CMND Employee");
        int cmndEmployee = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap phone number Employee");
        int phoneNumberEmployee = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap Email Employee");
        String emailEmployee = input.nextLine();
        System.out.println("Ban hay nhap level Employee");
        String levelEmployee = input.nextLine();
        System.out.println("Ban hay nhap position Employee");
        String positionEmployee = input.nextLine();
        System.out.println("Ban hay nhap salary Employee");
        int salaryEmployee = Integer.parseInt(input.nextLine());
        return new Employee(idEmployee,nameEmployee,dateEmployee,genderEmployee,cmndEmployee,phoneNumberEmployee,emailEmployee,levelEmployee,positionEmployee,salaryEmployee);
    }
    public void add() {
        employeeList.add(input1());
    }

    @Override
    public void display() {
        for(int i = 0;i<employeeList.size();i++){
            System.out.println(employeeList.get(i).toString());
        }
    }

    @Override
    public void edit() {
        System.out.println("Ban hay nhap id Employee muon edit");
        boolean check = false;
        int id = Integer.parseInt(input.nextLine());
        for(int i = 0;i<employeeList.size();i++){
            if(employeeList.get(i).getId()==id){
                employeeList.add(i,input1());
                employeeList.remove(i+1);
                check = true;
            }
        }
        if(!check){
            System.out.println("Ban nhap id khong dung");
        }
    }
}
