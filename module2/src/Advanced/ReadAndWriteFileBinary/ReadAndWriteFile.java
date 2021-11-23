package Advanced.ReadAndWriteFileBinary;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReadAndWriteFile<T> {
// Phuong thuc write Collection<T> vao file
    public void writeFile(String link, List<T> collection){
        File file = new File(link);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        List<T> list = new ArrayList<>();
// Kiem tra xem file cos phan tu thi ghi vao list roi them cac pt cua collection vao va write ra
//        if(file.length()>0){
//            list = readFile(link);
//        }
//        for(T list1: collection){
//            list.add(list1);
//        }
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(collection);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Phuong thuc ghi file nhi phan tra ve Collection<T>
    public List<T> readFile(String link){
        File file = new File(link);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        List<T> collection = new ArrayList<>();
        try {
            if(file.length()>0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                collection = (List<T>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return collection;
    }
}
