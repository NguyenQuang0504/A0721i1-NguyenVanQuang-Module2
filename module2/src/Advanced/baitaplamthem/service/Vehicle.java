package Advanced.baitaplamthem.service;

public abstract class Vehicle {
    private String bsk;
    private String name;
    private int years;
    private String namePeople;

    public  Vehicle(){

    }
    public Vehicle(String bsk, String name, int years, String namePeople) {
        this.bsk = bsk;
        this.name = name;
        this.years = years;
        this.namePeople = namePeople;
    }

    public String getBsk() {
        return bsk;
    }

    public void setBsk(String bsk) {
        this.bsk = bsk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getNamePeople() {
        return namePeople;
    }

    public void setNamePeople(String namePeople) {
        this.namePeople = namePeople;
    }

    @Override
    public String toString() {
        return
                 bsk+
                "," + name +
                "," + years +
                "," + namePeople;
    }
}
