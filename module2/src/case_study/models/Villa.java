package case_study.models;

public class Villa extends Facility {
    private String standradRoom;
    private double AreaPool;
    private int numFloor;

    public Villa(String standradRoom, double AreaPool, int numFloor, String nameService, double area, double price, int maxPeople, String styleRent) {
        super(nameService, area, price, maxPeople, styleRent);
        this.standradRoom = standradRoom;
        this.AreaPool = AreaPool;
        this.numFloor = numFloor;
    }
    public Villa(){

    }

    public String getStandradRoom() {
        return standradRoom;
    }

    public void setStandradRoom(String standradRoom) {
        this.standradRoom = standradRoom;
    }

    public double getAreaPool() {
        return AreaPool;
    }

    public void setAreaPool(double areaPool) {
        AreaPool = areaPool;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString() +
                "standradRoom='" + standradRoom + '\'' +
                ", AreaPool=" + AreaPool +
                ", numFloor=" + numFloor +
                '}';
    }
}
