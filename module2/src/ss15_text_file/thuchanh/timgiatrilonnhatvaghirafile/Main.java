package ss15_text_file.thuchanh.timgiatrilonnhatvaghirafile;

public class Main {
    static final String LINK_OUT = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\ss15_text_file\\thuchanh\\timgiatrilonnhatvaghirafile\\data\\OutFile.csv";
    static final String LINK_IN = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\ss15_text_file\\thuchanh\\tinhtongcacsotrongfiletext\\data\\Text.csv";
    public static void main(String[] args) {
      ReadWriteFile readWriteFile = new ReadWriteFile();
      readWriteFile.writeFile(LINK_OUT,readWriteFile.readFile(LINK_IN));
    }
}
