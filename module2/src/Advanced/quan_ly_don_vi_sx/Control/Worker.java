package Advanced.quan_ly_don_vi_sx.Control;

public class Worker extends Cadres {
    private String level = "basic";
    public Worker(){

    }
    public Worker(String name, String date, String address, String gender, String level) {
        super(name, date, address, gender);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String verhicle() {
        return "Worker used motobike and car!!!";
    }

    @Override
    public String toString() {
        return "Worker{" +
                " name: " +super.getName()+
                " date: " +super.getDate()+
                " address: " +super.getAddress()+
                " gender: " +super.getGender()+
                " level='" + level + '\'' +
                '}';
    }
}
