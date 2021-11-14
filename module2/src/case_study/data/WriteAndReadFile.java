package case_study.data;

import case_study.models.Booking;

import java.io.*;

public class WriteAndReadFile {
    public void writeFile(String link, Object T){
        File file = new File(link);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(T.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Object readFile(String link){
        File file = new File(link);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        Object T = new Object();
        try {
            if(file.length()>0) {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line = null;
                String arr[];
                while ((line = bufferedReader.readLine())!= null){
                    arr = line.split(",");
                    T = arr;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return T;
    }
}
