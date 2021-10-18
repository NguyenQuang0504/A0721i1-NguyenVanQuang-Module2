package Advanced.quan_ly_don_vi_sx.Control;

public class Employee extends Cadres {
    private String work;
    public Employee(){

    }
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Employee(String name, String date, String address, String gender, String work) {
        super(name, date, address, gender);
        this.work = work;
    }

    @Override
    public String verhicle() {
        return " Employee used Motobike and Bus!!!";
    }

    @Override
    public String toString() {
        return "Employee{" +
                " name: " +super.getName()+
                " date: " +super.getDate()+
                " address: " +super.getAddress()+
                " Gender: " +super.getGender()+
                " work='" + work + '\'' +
                '}';
    }
}
