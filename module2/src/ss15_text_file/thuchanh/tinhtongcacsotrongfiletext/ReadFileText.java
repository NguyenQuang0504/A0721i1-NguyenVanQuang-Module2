package ss15_text_file.thuchanh.tinhtongcacsotrongfiletext;

import java.io.*;

public class ReadFileText {
    public void readFile(String linkFile){
        File file = new File(linkFile);
        FileReader fileReader =null;
        BufferedReader bufferedReader = null;
        try {
            int sum=0;
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while((line = bufferedReader.readLine())!=null){
                sum = sum + Integer.parseInt(line);
            }
            System.out.println("Ket qua la: " +sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
