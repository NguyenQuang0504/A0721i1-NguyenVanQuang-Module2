package Advanced.Student;

import Advanced.ReadAndWriteFIle.ReadAndWrite;

import java.util.*;

public class StudentService {
    public static final String LINK = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\Advanced\\Student\\FileText.csv";
    Scanner scanner = new Scanner(System.in);
    ReadAndWriteFile readAndWrite = new ReadAndWriteFile();
    List<Student> listStudent = new ArrayList<>();
    // CRUD dang binh thuong dung List de luu
    public Student create(){
        System.out.println("Ban hay nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap name");
        String name = scanner.nextLine();
        System.out.println("Ban hay nhap age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap gender");
        String gender = scanner.nextLine();
        System.out.println("Ban hay nhap subject");
        String subject = scanner.nextLine();
       return new Student(id,name,age,gender,subject);
    }
    public  void  add(){
        listStudent.add(create());
    }
    public void display(){
        for (Student list: listStudent){
            System.out.println(list.toString1());
        }
    }
    public void edit(){
        display();
        System.out.println("Ban hay nhap id muon sua");
        int id = Integer.parseInt(scanner.nextLine());
        int size = listStudent.size();
        for(int i=0;i<size;i++){
            if(listStudent.get(i).getId() == id){
                listStudent.add(i,create());
                listStudent.remove(i+1);
            }
        }
    }
    public void search(){
        System.out.println("Ban hay nhap ten sinh vien muon kiem tra");
        String name = scanner.nextLine();
        for(int i = 0;i<listStudent.size();i++){
            if(listStudent.get(i).getName().equals(name)){
                System.out.println(listStudent.get(i).toString1());
            }
        }
    }
    // Luu tru du lieu trong file.
    public StudentService(){
        getListStudent();
    }
    // Ham doc tu file va tra ve List Student
    public List<Student> getListStudent(){
        List<Student> list = new ArrayList<>();
        List<String> listString = readAndWrite.readFile(LINK);
        for (String list1: listString){
            String arr[] = list1.split(",");
            list.add(new Student(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), arr[3], arr[4]));
        }
        return list;
    }
    //Ham tao moi mot Student
    public Student create1(){
        System.out.println("Ban hay nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap name");
        String name = scanner.nextLine();
        System.out.println("Ban hay nhap age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap gender");
        String gender = scanner.nextLine();
        System.out.println("Ban hay nhap subject");
        String subject = scanner.nextLine();
        return new Student(id,name,age,gender,subject);
    }
//Ham add 1 Student vao list va ghi vao file
    public void add1(){
        List<Student> list = getListStudent();
        list.add(create());
        readAndWrite.writeFile(LINK,list);
    }
    // Ham doc tu file luu ra list va hien thi
    public void display1(){
        List<Student> list = getListStudent();
        for (Student list1: list){
            System.out.println(list1.toString1());
        }
    }
    // Ham nhap vap id va edit
    public void edit1(){
        display1();
        System.out.println("ban hay nhap id muon edit");
        int id = Integer.parseInt(scanner.nextLine());
        List<Student> list = getListStudent();
        for (int i = 0;i<list.size();i++){
            if(list.get(i).getId()==id){
                list.add(i, create1());
                list.remove(i+1);
            }
        }
        readAndWrite.writeFile(LINK,list);
    }
    // Ham nhap vao ten va tim kiem
    public void search1(){
        System.out.println("Ban hay nhap ten sinh vien muon tim kiem");
        String name = scanner.nextLine();
        List<Student> list1 = getListStudent();
        for (Student list: list1){
            if(list.getName().equals(name)){
                System.out.println(list.toString1());
            }
        }
    }
}
