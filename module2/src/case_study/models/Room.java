package case_study.models;

import java.util.Objects;

public class Room extends Facility {
    private String freeService;
    public Room(){

    }
    public Room(String freeService, String nameService, double area, double price, int maxPeople, String styleRent){
        super(nameService,area,price,maxPeople,styleRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(freeService, room.freeService);
    }

    @Override
    public int hashCode() {
        return 12;
    }
}
