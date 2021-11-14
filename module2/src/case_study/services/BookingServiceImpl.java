package case_study.services;

import case_study.data.WriteAndReadFile;
import case_study.models.Booking;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    public static final String LINK_FACILITY = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\case_study\\data\\facility.csv";
    WriteAndReadFile writeAndReadFile = new WriteAndReadFile();
    static Set<Booking> listBooking = new TreeSet<>();
    Queue<Booking> listConstracts = new LinkedList<>();
    ContractServiceImpl listConstacts2 = new ContractServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();

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
         Booking booking = new  Booking(id, dateStart, dateEnd, years, idCustomer, nameService, opctionService);
         writeAndReadFile.writeFile(LINK_FACILITY, booking);
        facilityService.editMaintennance(nameService);
    }

    @Override
    public void display() {
       writeAndReadFile.readFile(LINK_FACILITY);
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
