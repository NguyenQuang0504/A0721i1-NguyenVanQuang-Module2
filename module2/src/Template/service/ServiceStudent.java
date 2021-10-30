package Template.service;

import Template.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceStudent {
    private Scanner input = new Scanner(System.in);
    public ArrayList<Student> studentList = new ArrayList<>();
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
        studentList.add(student);
    }
    public void display(){
        System.out.println("Hien thi danh sach");
        for(int i=0;i<studentList.size();i++){
                System.out.println(studentList.get(i));
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
        for(int i =0;i<studentList.size();i++){
            if(studentList.get(i).getId()==id_change){
                studentList.add(i,student);
                studentList.remove(i+1);
                break;
            }
        }
    }
    public void delete(){
        System.out.println("Ban hay nhap id muon xoa");
        int id = Integer.parseInt(input.nextLine());
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getId()==id){
                studentList.remove(i);
                break;
                }
            }
        }
}
