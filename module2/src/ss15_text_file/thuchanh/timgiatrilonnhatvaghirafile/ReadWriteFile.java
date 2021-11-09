package ss15_text_file.thuchanh.timgiatrilonnhatvaghirafile;

import java.io.*;

public class ReadWriteFile {
    public int readFile(String link){
        int max = 0;
        File file = new File(link);
        FileReader fileReader = null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line= null;
            max = Integer.parseInt(bufferedReader.readLine());
            while((line = bufferedReader.readLine())!=null){
                if(Integer.parseInt(line)>max){
                    max = Integer.parseInt(line);
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return max;
    }
    public void writeFile(String link, int max){
        File file = new File(link);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Max la " +max);
            System.out.println("Max da ghi vao file, max la: " +max);
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
