package ss16_binary_file_serialization.thuchanh.docvaghidanhsachsinhvienrafilenhiphan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public void writeFile(String link, ArrayList<Student> listStudent){
        File file = new File(link);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        List<Student> list = new ArrayList<>();
        // Kiem tra xem file co du lieu thi gan du lieu vao list
        if(file.length()>0){
        list = readFile(link);
        }
        // add cac phan tu cua listStudent vao list
        for(Student list1: listStudent){
            list.add(list1);
        }
        try {
            fileOutputStream = new FileOutputStream(file,false); // False la ghi de
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            // Ghi list vao file
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Student> readFile(String link){
        File file = new File(link);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        ArrayList<Student> list = new ArrayList<>();
        try {
            // Kiem tra xem nu file co do dai lon hon khong moi tao duoc objectInputStream
            if(file.length()>0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                list = (ArrayList<Student>) objectInputStream.readObject();
            }
            for (Student listStudent: list){
                System.out.println(listStudent);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
