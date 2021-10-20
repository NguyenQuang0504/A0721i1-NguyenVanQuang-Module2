package ss8_clean_code.thuchanh.refactoring3;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double volume = getPerimetter(radius) * height + 2 * getArea(radius);
        return volume;
    }
    public static double getArea(int radius){
     return Math.PI * radius * radius;
    }
    public static double getPerimetter(int radius){
        return  2 * Math.PI  * radius;
    }
}
