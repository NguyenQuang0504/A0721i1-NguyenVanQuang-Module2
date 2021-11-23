package Advanced.baitaplamthem.service;

public class Motobike extends Vehicle {
    private int wattage;

    public Motobike() {

    }

    public Motobike(String bsk, String name, int years, String namePeople, int wattage) {
        super(bsk, name, years, namePeople);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return super.toString()+
                "," + wattage;
    }
}
