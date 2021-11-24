package thi_module_2.Phone;

public abstract class Phone {
    private int id;
    private String name;
    private double cost;
    private String nhaSx;
    public Phone(){

    }

    public Phone(int id, String name, double cost, String nhaSx) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.nhaSx = nhaSx;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getNhaSx() {
        return nhaSx;
    }

    public void setNhaSx(String nhaSx) {
        this.nhaSx = nhaSx;
    }

    @Override
    public String toString() {
        return id +
                "," + name +
                "," + cost +
                "," + nhaSx;
    }

    public String toString1() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", nhaSx='" + nhaSx;
    }

}
