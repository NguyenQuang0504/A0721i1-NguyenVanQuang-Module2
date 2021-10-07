package ss5_accessmodifier_staticmethod_staticproperty.thuchanh.staticmetod;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod.change();
        //Khoi tao cac doi tuong
        StaticMethod st1 = new StaticMethod(1000, "Quang");
        StaticMethod st2 = new StaticMethod(1111, "Thuy");
        StaticMethod st3 = new StaticMethod(1234, "Hung");
        // Goi phuong thuc display de in ra
        System.out.println(st1.display());
        System.out.println(st2.display());
        System.out.println(st3.display());
    }
}
