package thi_module_2.Phone;

public class PhoneChinhHang extends Phone {
    private int tgBaoHanh;
    private String pvBaoHanh;
    public PhoneChinhHang(){

    }

    public PhoneChinhHang(int id, String name, double cost, String nhaSx, int tgBaoHanh, String pvBaoHanh) {
        super(id, name, cost, nhaSx);
        this.tgBaoHanh = tgBaoHanh;
        this.pvBaoHanh = pvBaoHanh;
    }

    public int getTgBaoHanh() {
        return tgBaoHanh;
    }

    public void setTgBaoHanh(int tgBaoHanh) {
        this.tgBaoHanh = tgBaoHanh;
    }

    public String getPvBaoHanh() {
        return pvBaoHanh;
    }

    public void setPvBaoHanh(String pvBaoHanh) {
        this.pvBaoHanh = pvBaoHanh;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "," + tgBaoHanh +
                "," + pvBaoHanh;
    }

    public String toString1() {
        return  super.toString1()+
                "tgBaoHanh=" + tgBaoHanh +
                ", pvBaoHanh='" + pvBaoHanh + '\'' +
                '}';
    }
}
