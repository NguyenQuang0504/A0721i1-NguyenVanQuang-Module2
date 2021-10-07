package ss4_class_and_object_to_java.baitap.Fan;

import java.util.Scanner;

public class TestFan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        // cai quat 1
        System.out.println("Ban hay cai dat cac thong quat 1!!");
        String check;
        // Set onoff
        System.out.println("Ban hay nhap trang thai");
        check = input.nextLine();
        if (check == "on") {
            fan1.setOn(true);
        } else {
            fan1.setOn(false);
        }
        // set speed
        System.out.println("Ban hay nhap toc do");
        int speed = Integer.parseInt(input.nextLine());
        fan1.setSpeed(speed);
        // set radius
        System.out.println("Ban hay nhap radius");
        double radius = Double.parseDouble(input.nextLine());
        fan1.setRadius(radius);
        //set color
        System.out.println("Ban hay nhap mau sac cho quat");
        String color = input.nextLine();
        fan1.setColor(color);
        // cai quat 2
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Ban hay cai dat cac thong quat 2!!");
        String check1;
        // Set onoff
        System.out.println("Ban hay nhap trang thai");
        check1 = input.nextLine();
        if (check1 == "on") {
            fan2.setOn(true);
        } else {
            fan2.setOn(false);
        }
        // set speed
        System.out.println("Ban hay nhap toc do");
        int speed1 = Integer.parseInt(input.nextLine());
        fan2.setSpeed(speed1);
        // set radius
        System.out.println("Ban hay nhap radius");
        double radius1 = Double.parseDouble(input.nextLine());
        fan2.setRadius(radius1);
        //set color
        System.out.println("Ban hay nhap mau sac cho quat");
        String color1 = input.nextLine();
        fan2.setColor(color1);
        //Display
        System.out.println("Quat 1: ");
        System.out.println(fan1.toString());
        System.out.println("Quat 2: ");
        System.out.println(fan2.toString());
    }
}
