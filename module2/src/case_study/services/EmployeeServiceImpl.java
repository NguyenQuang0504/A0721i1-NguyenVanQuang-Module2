package case_study.services;

import case_study.data.WriteAndReadFile;
import case_study.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    Scanner input = new Scanner(System.in);
    public final String PATH = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\case_study\\data\\employee.csv";
    public WriteAndReadFile writeAndReadFile = new WriteAndReadFile();
//    static {
//        employeeList.add( new Employee(1, "Thuy", 8600, "Nu", 123, 3456, "thuykawaii@gmail.com", "Daihoc", "HH", 30000000));
//        employeeList.add( new Employee(2, "Thuy2", 8600, "Nu", 123, 3456, "thuykawaii@gmail.com", "Daihoc", "HH", 30000000));
//        employeeList.add( new Employee(3, "Thuy3", 8600, "Nu", 123, 3456, "thuykawaii@gmail.com", "Daihoc", "HH", 30000000));
//    }
// Phuong thuc doc file va tra ve list employee
    public ArrayList<Employee> getEmployeeList(){
        List<String> stringList = writeAndReadFile.readFile(PATH);
        ArrayList<Employee> list = new ArrayList<>();
        for(String list1: stringList){
            String arr[] = list1.split(",");
            Employee employee = new Employee(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8], Integer.parseInt(arr[9]));
            list.add(employee);
        }
        return list;
    }
// phuong thuc nhap va tra ve doi tuong employee
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
// Phuong thuc ghi doi tuong vao file
    public void add() {
        List<Employee> list = new ArrayList<>();
        list = getEmployeeList();
        list.add(input1());
        writeAndReadFile.writeFile(PATH, list);
    }
    // Phuong thuc hien thi
    @Override
    public void display() {
        List<Employee> list = getEmployeeList();
        for (Employee list1: list){
            System.out.println(list1);
        }
    }
// Phuong thuc edit
    @Override
    public void edit() {
        System.out.println("Ban hay nhap id Employee muon edit");
        boolean check = false;
        List<Employee> list = getEmployeeList();
        int id = Integer.parseInt(input.nextLine());
        for(int i = 0;i<list.size();i++){
            if(list.get(i).getId()==id){
                list.add(i,input1());
                list.remove(i+1);
                check = true;
            }
        }
        writeAndReadFile.writeFile(PATH, list);
        if(!check){
            System.out.println("Ban nhap id khong dung");
        }
    }
}
