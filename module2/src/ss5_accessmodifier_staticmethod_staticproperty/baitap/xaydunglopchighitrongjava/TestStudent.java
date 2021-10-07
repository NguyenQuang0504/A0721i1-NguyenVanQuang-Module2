package ss5_accessmodifier_staticmethod_staticproperty.baitap.xaydunglopchighitrongjava;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap ten sinh vien");
        String name = input.nextLine();
        System.out.println("Ban hay nhap lop");
        String classes = input.nextLine();
        Students student = new Students();
        student.setName(name);
        student.setClasses(classes);
        System.out.println(student.display());
    }
}
