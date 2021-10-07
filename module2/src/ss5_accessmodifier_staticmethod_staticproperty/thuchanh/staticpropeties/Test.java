package ss5_accessmodifier_staticmethod_staticproperty.thuchanh.staticpropeties;

public class Test {
    public static void main(String[] args) {
        //Tao 1 doi tuong car
        Car car1 = new Car("BMW", "Xang");
        System.out.println("So luong xe: " +Car.NumberCar);
        Car car2 = new Car("Lambogini","Xang");
        System.out.println("So luong xe: " +Car.NumberCar);
        Car car3 = new Car("RollRoy", "Xang");
        System.out.println("So luong xe: " +Car.NumberCar);
    }
}
