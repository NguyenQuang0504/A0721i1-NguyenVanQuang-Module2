package case_study.services;

import case_study.models.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityServiceImpl implements FacilityService {
   public static LinkedHashMap<Facility, Integer> listMap = new LinkedHashMap<>();
    static {
        listMap.put(new House("Phong don", 11, "House", 120, 33000000, 32, "Thue theo nam"), 1);
        listMap.put(new Room("Tivi free", "Romm", 20, 2000000, 2, "thue theo gio"), 1);
        listMap.put(new Villa("Phong doi", 50,2,"Thue Villa", 50,5000000,3,"Thue theo thang"),1);
    }
    @Override
    public void displayMaintenance() {

    }

    @Override
    public void add() {
        
    }

    @Override
    public void display() {
         for(Map.Entry<Facility,Integer> emt :  listMap.entrySet()){
             System.out.println( emt);
         }
    }
    @Override
    public void edit() {
    }
}
