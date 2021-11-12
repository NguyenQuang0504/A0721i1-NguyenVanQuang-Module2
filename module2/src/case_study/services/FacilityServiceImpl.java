package case_study.services;

import case_study.models.*;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
   public static LinkedHashMap<Facility, Integer> listMap = new LinkedHashMap<>();
    static {
        listMap.put(new House("Phong don", 11, "House", 120, 33000000, 32, "Thue theo nam"), 5);
        listMap.put(new Room("Tivi free", "Romm", 20, 2000000, 2, "thue theo gio"), 7);
        listMap.put(new Villa("Phong doi", 50,2,"Thue Villa", 50,5000000,3,"Thue theo thang"),1);
    }
    @Override
    public void displayMaintenance() {
    for(Map.Entry<Facility,Integer> list: listMap.entrySet()){
        if(list.getValue()>=5){
            System.out.println(list);
        }
    }
    }

    @Override
    public void add() {
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban hay chon opction");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 2:
                System.out.println("-----------------------------------------Add House----------------------");
                System.out.println("Nhap Name Service");
                String nameService = scanner.nextLine();
                System.out.println("Nhap Area");
                double area = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap Price");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap maxPeople");
                int maxPeople = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap Rent");
                String rent = scanner.nextLine();
                System.out.println("Nhap standradRoom");
                String standradRoom = scanner.nextLine();
                System.out.println("Nhap numFloor");
                int numFloor = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap so lan su dung");
                int num = Integer.parseInt(scanner.nextLine());
                listMap.put(new House(standradRoom, numFloor, nameService, area, price,maxPeople, rent),num);
                break;
            case 3:
                System.out.println("----------------------------------------Add Room------------------------------");
                System.out.println("Nhap Name Service");
                String nameService1 = scanner.nextLine();
                System.out.println("Nhap Area");
                double area1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap Price");
                double price1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap maxPeople");
                int maxPeople1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap Rent");
                String rent1 = scanner.nextLine();
                System.out.println("Nhap freeService");
                String freeService = scanner.nextLine();
                System.out.println("Nhap so lan su dung");
                int num1 = Integer.parseInt(scanner.nextLine());
                listMap.put(new Room(freeService, nameService1, area1, price1,maxPeople1, rent1),num1);
                break;
            case 1:
                System.out.println("---------------------------------------Add Villa--------------------------------");
                System.out.println("Nhap Name Service");
                String nameService2 = scanner.nextLine();
                System.out.println("Nhap Area");
                double area2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap Price");
                double price2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap maxPeople");
                int maxPeople2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap Rent");
                String rent2 = scanner.nextLine();
                System.out.println("Nhap standradRoom");
                String standradRoom2 = scanner.nextLine();
                System.out.println("Nhap numFloor");
                int numFloor2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Ban hay nhap AreaPool");
                double areaPool = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap so lan su dung");
                int num2 = Integer.parseInt(scanner.nextLine());
                listMap.put(new Villa(standradRoom2, areaPool, numFloor2, nameService2, area2, price2, maxPeople2, rent2),num2);
                break;
            default:
                break;
        }
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
    public void addFacility(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Name Service");
        String nameService = scanner.nextLine();
        System.out.println("Nhap Area");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap Price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap maxPeople");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Rent");
        String rent = scanner.nextLine();
    }
    public void editMaintennance(String nameService){
        for (Map.Entry<Facility,Integer> list: listMap.entrySet()){
           if(list.getKey().getNameService().endsWith(nameService)){
                list.setValue(list.getValue()+1);
            }
        }
    }
}
