package case_study.services;

import case_study.models.Booking;

import java.util.*;

public class BookingServiceImpl implements BookingService{
    Set<Booking> listBooking = new TreeSet<>();
    Queue<Booking> listConstracts = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);
    public void add(){
        System.out.println("--------------------------------------------Danh sach khach hang va dich vu dang hien co!!!!!!!----------------------------------------");
        System.out.println("Nhap id Booking");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap ngay bat dau book");
        int dateStart = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap ngay ket thuc");
        int dateEnd = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap idCustomer");
        int idCustomer = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap nameService");
        String nameService = scanner.nextLine();
        System.out.println("Ban hay nhap opction Service");
        String opctionService = scanner.nextLine();
        listBooking.add(new Booking(id,dateStart,dateEnd,idCustomer,nameService,opctionService));
    }

    @Override
    public void display() {
    for(Booking list: listBooking){
        System.out.println(list);
    }
    }

    @Override
    public void edit() {
    }

    @Override
    public void create() {
    for (Booking list: listBooking){
        listConstracts.add(list);
    }
        System.out.println("------------------------------------- Creat Constracts---------------------------------");
    }
    @Override
    public void displayContact() {

    }
}
