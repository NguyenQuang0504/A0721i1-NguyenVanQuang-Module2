package Template.service;

import Template.model.Student;

import java.util.Scanner;

public class ServiceStudent {
    private Scanner input = new Scanner(System.in);
    public Student studentList[] = new Student[100];
    public void add(){
        System.out.println("Ban hay nhap id:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap name:");
        String name = input.nextLine();
        System.out.println("Ban hay nhap age:");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap address:");
        String address = input.nextLine();
        System.out.println("Ban hay nhap scores:");
        int scores = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap subject:");
        String subject = input.nextLine();
        Student student = new Student(id,name,age,address,scores,subject);
        for(int i=0;i<studentList.length;i++){
            if(studentList[i]==null){
                studentList[i] = student;
                break;
            }
        }
    }
    public void display(){
        System.out.println("Hien thi danh sach");
        for(int i=0;i<studentList.length;i++){
            if(studentList[i]==null){
                System.out.println("Het sanh sach");
                break;
            }
            else {
                System.out.println(studentList[i].toString());
            }
        }
    }
    public void Sua(){
        System.out.println("Ban hay nhap id student muon sua: ");
        int id_change = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap thong tin muon thay doi: ");
        System.out.println("Ban hay nhap id:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap name:");
        String name = input.nextLine();
        System.out.println("Ban hay nhap age:");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap address:");
        String address = input.nextLine();
        System.out.println("Ban hay nhap scores:");
        int scores = Integer.parseInt(input.nextLine());
        System.out.println("Ban hay nhap subject:");
        String subject = input.nextLine();
        Student student = new Student(id,name,age,address,scores,subject);
        for(int i =0;i<studentList.length;i++){
            if(studentList[i].getId()==id_change){
                studentList[i] = student;
                break;
            }
        }
    }
    public void delete(){
        System.out.println("Ban hay nhap id muon xoa");
        int id = Integer.parseInt(input.nextLine());
        for(int i=0;i<studentList.length;i++){
            if(studentList[i].getId()==id){
                for(int j=i; j<studentList.length-1;j++){
                    studentList[j] = studentList[j+1];
                }
                break;
            }
        }
    }
}
