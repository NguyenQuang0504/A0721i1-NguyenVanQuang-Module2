package Advanced.ReadAndWriteFIle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite<T> {
    private final String PATH = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\Advanced\\ReadAndWriteFIle\\data\\Text.csv";
    public void writeData(List<T> list){
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (T list1: list){
                bufferedWriter.write(list1.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<String> readData(){
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> list = new ArrayList<>();
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
