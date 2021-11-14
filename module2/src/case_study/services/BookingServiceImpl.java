package case_study.services;

import case_study.models.Booking;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Set<Booking> listBooking = new TreeSet<>();
    Queue<Booking> listConstracts = new LinkedList<>();
    ContractServiceImpl listConstacts2 = new ContractServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static {
        listBooking.add(new Booking(1,15,30,2021,2,"Houe","ADD"));
        listBooking.add(new Booking(2,10,31,2021,1,"Houe","ADD"));
    }
    static Scanner scanner = new Scanner(System.in);
    public void add() {
        System.out.println("--------------------------------------------Danh sach khach hang va dich vu dang hien co!!!!!!!----------------------------------------");
        System.out.println("-------------------------- Danh sach dich vu------------------------------------");
        facilityService.display();
        System.out.println("Nhap id Booking");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap ngay bat dau book");
        int dateStart = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap ngay ket thuc");
        int dateEnd = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap nam su dung dich vu");
        int years = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap idCustomer");
        int idCustomer = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap nameService");
        String nameService = scanner.nextLine();
        System.out.println("Ban hay nhap opction Service");
        String opctionService = scanner.nextLine();
        listBooking.add(new Booking(id, dateStart, dateEnd, years, idCustomer, nameService, opctionService));
        facilityService.editMaintennance(nameService);
    }

    @Override
    public void display() {
        for (Booking list : listBooking) {
            System.out.println(list);
        }
    }

    @Override
    public void edit() {
        listConstacts2.edit();
    }

    @Override
    public void create() {
        for (Booking list : listBooking) {
            listConstracts.add(list);
        }
        System.out.println("------------------------------------- Creat Constracts---------------------------------");
        System.out.println("Cai dat hop dong!!!!!!");
        System.out.println("Hop dong cho: "+listConstracts.remove());
        listConstacts2.add();
    }

    @Override
    public void displayContact() {
        listConstacts2.display();
    }
    public Set<Booking> getList(){
        return listBooking;
    }
}
