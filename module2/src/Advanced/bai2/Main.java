package Advanced.bai2;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        String b = new String("a");
        setA(a);
        setB(b);
        System.out.println(a);
        System.out.println(b);
    }
    public static void setA(int a){
        a=a*2;
    }
    public static void setB(String b){
        b = b + "s";
    }
}
