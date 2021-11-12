package ss16_binary_file_serialization.thuchanh.docvaghidanhsachsinhvienrafilenhiphan;

import ss15_text_file.thuchanh.timgiatrilonnhatvaghirafile.ReadWriteFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final String LINK_PATH = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\ss16_binary_file_serialization\\thuchanh\\docvaghidanhsachsinhvienrafilenhiphan\\data\\Text.dat";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> listStudent = new ArrayList<>();
        ReadAndWriteFile lis = new ReadAndWriteFile();
        listStudent.add(new Student(1,"Quang", "Hue"));
        listStudent.add(new Student(2,"Thuy", "Hue"));
        listStudent.add(new Student(3,"Huy", "DN"));
        lis.writeFile(LINK_PATH, listStudent);
        lis.readFile(LINK_PATH);
    }

}
