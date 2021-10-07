package ss5_accessmodifier_staticmethod_staticproperty.thuchanh.staticmetod;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    public StaticMethod(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    public static void change(){
        college = "CODEGYM";
    }
    public String display(){
        return "Name: " +this.name +" Rollno: " +this.rollno +" College: " +college;
    }
}
