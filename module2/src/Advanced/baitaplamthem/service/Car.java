package Advanced.baitaplamthem.service;

public class Car extends Vehicle {
    private int numberIndex;
    private String styleCar;

    public Car(){

    }

    public Car(String bsk, String name, int years, String namePeople, int numberIndex, String styleCar) {
        super(bsk, name, years, namePeople);
        this.numberIndex = numberIndex;
        this.styleCar = styleCar;
    }

    public int getNumberIndex() {
        return numberIndex;
    }

    public void setNumberIndex(int numberIndex) {
        this.numberIndex = numberIndex;
    }

    public String getStyleCar() {
        return styleCar;
    }

    public void setStyleCar(String styleCar) {
        this.styleCar = styleCar;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "," + numberIndex +
                "," + styleCar;
    }
}
