package ss7_abstract_and_interface.baitap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

import Template.model.Student;
import ss6_inheritance.thuchanh.Shape;
import ss6_inheritance.thuchanh.Square;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random generator = new Random();
        Shape[] shapeList = new Shape[3];
        shapeList[0] = new Circle("red", true, 5.0);
        shapeList[1] = new Rectangle("blue", true, 10,20);
        shapeList[2] = new Squares("green", true, 15);
        System.out.println("Start");
        for(Shape shape: shapeList){
            System.out.println(shape.toString());
        }
        for (int i = 0;i<shapeList.length;i++){
            int value = generator.nextInt((100 - 0) + 1) + 0;
            shapeList[i].resize(value);
        }
        System.out.println("Change");
        for(Shape shape: shapeList){
            System.out.println(shape.toString());
        }
    }
}
