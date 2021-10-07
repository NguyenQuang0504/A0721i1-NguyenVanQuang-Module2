package ss5_accessmodifier_staticmethod_staticproperty.thuchanh.staticpropeties;

public class Car {
    private String name;
    private String engine;
    public static int NumberCar;
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        NumberCar++;
    }
}
