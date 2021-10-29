package case_study.models;

public class House extends Facility{
    private String standradRoom;
    private int numFloor;
    public House(){

    }
    public House(String standradRoom, int numFloor, String nameService, double area, double price, int maxPeople, String styleRent){
        super(nameService, area, price, maxPeople, styleRent);
        this.standradRoom = standradRoom;
        this.numFloor = numFloor;
    }

    public String getStandradRoom() {
        return standradRoom;
    }

    public void setStandradRoom(String standradRoom) {
        this.standradRoom = standradRoom;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }

    @Override
    public String toString() {
        return "House{" +super.toString()+
                "standradRoom='" + standradRoom + '\'' +
                ", numFloor=" + numFloor +
                '}';
    }
}
