package Advanced.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReadAndWriteFile<T> {
    public List<String> readFile(String link){
        File file = new File(link);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> list= new ArrayList<>();
        try {
            if(file.length()>0){
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line=bufferedReader.readLine()) != null){
                    list.add(line);
                }
            }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        return list;
    }

    public void writeFile(String link, Collection<T> collection){
        File file = new File(link);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (T list: collection){
                bufferedWriter.write(list.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
