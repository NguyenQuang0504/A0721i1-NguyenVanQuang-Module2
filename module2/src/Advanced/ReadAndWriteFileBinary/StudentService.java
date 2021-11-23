package Advanced.ReadAndWriteFileBinary;

import Advanced.ReadAndWriteFIle.ReadAndWrite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    Scanner scanner = new Scanner(System.in);
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    public final String PATH = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\Advanced\\ReadAndWriteFileBinary\\Text.csv";
    public Student create1(){
        List<Student> list = new ArrayList<>();
        System.out.println("Ban hay nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap ten");
        String name = scanner.nextLine();
        System.out.println("Ban hay nhap age");
        int date = Integer.parseInt(scanner.nextLine());
        System.out.println("BAn hay nhap address");
        String address = scanner.nextLine();
        return new  Student(id,name,date,address);


    }
// Phuong thuc add creat vao file
    public void add(){
        List<Student> list = readAndWriteFile.readFile(PATH);
        list.add(create1());
        readAndWriteFile.writeFile(PATH,list);
        System.out.println("Da ghi du lieu vao file");
    }
// Phuong thuc display student
    public void display(){
        List<Student> list = readAndWriteFile.readFile(PATH);
        System.out.println("Danh sach student");
        for (Student list1: list){
            System.out.println(list1.toString());
        }
    }
// Phuongt thuc tim kiem theo ten
    public void search(){
        List<Student> list = readAndWriteFile.readFile(PATH);
        System.out.println("Ban hay nhap ten Student");
        String name = scanner.nextLine();
        System.out.println("Cac Student co ten trung voi: " +name);
        for (Student list1: list){
            if(list1.getName().contains(name)){
                System.out.println(list1.toString());
            }
        }
    }
// Phuong thuc edit
    public void edit(){
        display();
        List<Student> list =  readAndWriteFile.readFile(PATH);
        System.out.println("Ban hay nhap id Student");
        int id =    Integer.parseInt(scanner.nextLine());
        int size = list.size();
        for (int i = 0;i<size;i++){
            if(list.get(i).getId() == id){
                list.set(i,create1());
            }
        }
        readAndWriteFile.writeFile(PATH,list);
    }

    public void delete(){
        display();
        List<Student> list = readAndWriteFile.readFile(PATH);
        System.out.println("Ban hay nhap ten Student");
        String name = scanner.nextLine();
        int size = list.size();
        for(int i = 0;i<size;i++){
            if(name.equals(list.get(i).getName())){
                list.remove(i);
            }
        }
        readAndWriteFile.writeFile(PATH,list);
    }
}
