package ss9_list.Test;
import Template.model.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestHashSet {
    public static void main(String[] args) {
        TreeSet<Student> studentHashSet = new TreeSet<>();
        studentHashSet.add(new Student(1,"chanh7",253,"DN",5,"Toán"));
        studentHashSet.add(new Student(2,"chanh2",253,"DN",5,"Toán"));
        studentHashSet.add(new Student(1,"chanh1",523,"DN",5,"Toán"));
        studentHashSet.add(new Student(4,"chanh4",23,"DN",5,"Toán"));
        studentHashSet.add(new Student(1,"chanh1",255,"DN",5,"Toán"));

        for (Student student: studentHashSet) {
            System.out.println(student +"- "+student.hashCode());
        }
    }
}
