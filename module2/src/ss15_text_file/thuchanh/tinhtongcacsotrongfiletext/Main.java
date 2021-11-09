package ss15_text_file.thuchanh.tinhtongcacsotrongfiletext;

public class Main {
    private static final String LINK = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\ss15_text_file\\thuchanh\\tinhtongcacsotrongfiletext\\data\\Text.csv";
    public static void main(String[] args) {
        ReadFileText read = new ReadFileText();
        read.readFile(LINK);
    }
}
