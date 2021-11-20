package case_study.services;

import Advanced.ReadAndWriteFIle.Book;
import case_study.data.WriteAndReadFile;
import case_study.models.Booking;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    public static final String LINK_FACILITY = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\case_study\\data\\facility.csv";
    WriteAndReadFile writeAndReadFile = new WriteAndReadFile();
    Queue<Booking> listConstracts = new LinkedList<>();
    ContractServiceImpl listConstacts2 = new ContractServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();

    static Scanner scanner = new Scanner(System.in);
    // Tra ve list dang co trong file
    public Queue<Booking> getListBooking(){
        List<String> listString = writeAndReadFile.readFile(LINK_FACILITY);
        Queue<Booking> listBooking = new ArrayDeque<>();
        for (int i=0;i< listString.size();i++){
            String arr[] = listString.get(i).split(",");
            Booking booking = new Booking(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]),Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6]);
            listBooking.add(booking);
        }
        return listBooking;
    }

    public Booking createBooking(){
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
        return new  Booking(id, dateStart, dateEnd, years, idCustomer, nameService, opctionService);
    }
    public void add() {
// Add vo file
        Queue<Booking> list = new  ArrayDeque<>();
        list = getListBooking();
        list.add(createBooking());
        writeAndReadFile.writeFile(LINK_FACILITY, list);
        facilityService.editMaintennance(createBooking().getNameService());
    }

    @Override
    public void display() {
// Display tu file
        Queue<Booking> list = new ArrayDeque<>();
        list = getListBooking();
        for (Booking list1: list){
            System.out.println(list1.toString());
        }
    }

    @Override
    public void edit() {
        listConstacts2.edit();
    }

    @Override
    public void create() {

        for (Booking list : getListBooking()) {
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
}
