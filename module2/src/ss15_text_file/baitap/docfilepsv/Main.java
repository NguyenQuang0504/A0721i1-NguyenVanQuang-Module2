package ss15_text_file.baitap.docfilepsv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static final String LINK = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\ss15_text_file\\baitap\\docfilepsv\\data\\File1.csv";
    static final String LINK1 = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\ss15_text_file\\baitap\\docfilepsv\\data\\FileOut.csv";
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        System.out.println("Danh sach cac quoc gia!!!!!!!");
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        array = readAndWriteFile.readFile(LINK);
        for(String list: array){
            System.out.println(list);
        }
        readAndWriteFile.writeFile(LINK1, array);
    }
}
