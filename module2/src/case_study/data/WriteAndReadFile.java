package case_study.data;

import case_study.models.Booking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFile {

    // Ham viet 1 doi tuong Object vao trong file
    public  void  writeFile(String link, Object o){
        File file = new File(link);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(o.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ham doc 1 file va tra ve array lis kieu String, moi dong la 1 phan tu
    public List<String> readFile(String link){
        File file = new File(link);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        ArrayList<String> list = new ArrayList<>();
        try {
            if(file.length()>0) {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line = null;
                while ((line = bufferedReader.readLine())!= null){
                    list.add(line);
                }
                bufferedReader.close();
                fileReader.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
