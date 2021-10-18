package Advanced.quan_ly_don_vi_sx.Control;

public abstract class Cadres {
    private String name;
    private String date;
    private String address;
    private String gender;
    public Cadres(){

    }
    public Cadres(String name, String date, String address, String gender) {
        this.name = name;
        this.date = date;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract String verhicle();
    public abstract String toString();
}
