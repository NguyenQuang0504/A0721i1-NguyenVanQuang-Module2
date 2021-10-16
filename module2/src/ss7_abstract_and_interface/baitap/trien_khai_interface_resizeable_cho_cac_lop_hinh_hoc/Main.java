package ss7_abstract_and_interface.baitap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

import ss6_inheritance.thuchanh.Square;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random generator = new Random();
        Circle[] circleList = new Circle[1];
        Rectangle[] rectangleList = new Rectangle[1];
        Squares[] squareList = new Squares[1];
        circleList[0] = new Circle("Red",true,1.0);
        rectangleList[0] = new Rectangle("Red", true, 100,200);
        squareList[0] = new Squares("Red", true, 10);
        for (int i = 0;i<rectangleList.length;i++){
            int value = generator.nextInt((100 - 0) + 1) + 0;
            circleList[i].resize(value);
            rectangleList[i].resize(value);
            squareList[i].resize(value);
        }
        for(Circle circle: circleList){
            System.out.println(circle);
        }
        for(Rectangle rectangle: rectangleList){
            System.out.println(rectangle);
        }
        for(Squares squares: squareList){
            System.out.println(squares);
        }
    }
}
