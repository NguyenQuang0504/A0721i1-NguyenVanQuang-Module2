package thi_module_2.Phone;

public class PhoneXachTay extends Phone {
    private String cuontry;
    private String status;

    public PhoneXachTay() {
    }

    public PhoneXachTay(int id, String name, double cost, String nhaSx, String cuontry, String status) {
        super(id, name, cost, nhaSx);
        this.cuontry = cuontry;
        this.status = status;
    }

    public String getCuontry() {
        return cuontry;
    }

    public void setCuontry(String cuontry) {
        this.cuontry = cuontry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString()+
                "," + cuontry +
                "," + status;
    }
    public String toString1() {
        return  super.toString1()+
                ", country=" + cuontry +
                ", status='" + status + '\'' +
                '}';
    }
}
