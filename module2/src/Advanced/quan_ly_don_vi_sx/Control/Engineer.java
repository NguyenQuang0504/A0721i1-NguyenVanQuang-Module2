package Advanced.quan_ly_don_vi_sx.Control;

public class Engineer extends Cadres {
    private String specialized;
    public Engineer(){

    }
    public Engineer(String name, String date, String address, String gender, String specialized) {
        super(name, date, address, gender);
        this.specialized = specialized;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    @Override
    public String verhicle() {
        return " Engineer used Car!!!";
    }

    @Override
    public String toString() {
        return "Engineer{" +
                " name: " +super.getName()+
                " date: " +super.getDate()+
                " address: " +super.getAddress()+
                " gender: " +super.getGender()+
                " specialized='" + specialized + '\'' +
                '}';
    }
}
