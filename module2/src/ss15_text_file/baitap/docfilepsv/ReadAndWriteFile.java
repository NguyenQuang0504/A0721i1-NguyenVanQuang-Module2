package ss15_text_file.baitap.docfilepsv;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ReadAndWriteFile {
    // Code doc file
    public List<String> readFile(String link){
        List<String> listCountry = new ArrayList<>();
        File file   = new File(link);
        FileReader fileReader = null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String array[];
            while((line = bufferedReader.readLine())!=null){
                array = line.split(",");
                listCountry.add(array[2]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listCountry;
    }
    //Code ghi file
    public void writeFile(String link, List<String> listString){
         File file = new File(link);
         FileWriter fileWriter = null;
         BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for(String lis: listString){
                bufferedWriter.write(lis);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
