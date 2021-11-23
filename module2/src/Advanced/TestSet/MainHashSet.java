package Advanced.TestSet;

import java.util.*;

public class MainHashSet {
    public static void main(String[] args) {
        Set<Student> listStudent = new HashSet<>();
        listStudent.add(new Student(1,"Quang1", 20, "Hue"));
        listStudent.add(new Student(5,"Quang5", 20, "Hue"));
        listStudent.add(new Student(4,"Quang4", 20, "Hue"));
        listStudent.add(new Student(2,"Quang2", 20, "Hue"));
        listStudent.add(new Student(2,"Quang2", 20, "Hue"));
        for (Student list: listStudent){
            System.out.println(list.toString());
            System.out.println(list.hashCode());
        }
    }
}
