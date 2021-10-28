package ss11_java_collection_framework.thuchanh.phanbietHashMapvaHashSet;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] studentList = new Student[5];
        studentList[0] = new Student("Quang", 22, "Da Nang");
        studentList[1] = new Student("Thuy", 22, "Da Nang");
        studentList[2] = new Student("Nhi", 22, "Hue");
        studentList[3] = new Student("Khanh", 22, "Da Nang");
        studentList[4] = new Student("Vui", 22, "Hue");
        Map<Integer, Student> hashMap = new HashMap<>();
        for(int i = 0;i<studentList.length;i++){
            hashMap.put((i+1),studentList[i]);
        }
        Set<Student> hashSet = new HashSet<>();
        for(int i = 0;i<studentList.length;i++){
            hashSet.add(studentList[i]);
        }
        System.out.println("-----------------------------Hien Thi Map---------------------------------");
        for(Map.Entry<Integer, Student> student : hashMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("-----------------------------Hien Thi Set----------------------------------");
        for(Student student : hashSet){
            System.out.println(student.toString());
        }
    }
}
