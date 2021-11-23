package Advanced.baitaplamthem.service;

public class Vans extends Vehicle {
    private int weight;

    public Vans() {

    }

    public Vans(String bsk, String name, int years, String namePeople, int weight) {
        super(bsk, name, years, namePeople);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString()+
                "," + weight;
    }
}
