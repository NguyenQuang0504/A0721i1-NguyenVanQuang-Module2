package case_study.models;

public class Customer extends Person implements Comparable {
    private String levelCustomer;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, int date, String gender, int cmnd, int phone, String email, String levelCustomer, String address) {
        super(id, name, date, gender, cmnd, phone, email);
        this.levelCustomer = levelCustomer;
        this.address = address;
    }

    public String getLevelCustomer() {
        return levelCustomer;
    }

    public void setLevelCustomer(String levelCustomer) {
        this.levelCustomer = levelCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString()+
                "," + levelCustomer +
                "," + address ;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
