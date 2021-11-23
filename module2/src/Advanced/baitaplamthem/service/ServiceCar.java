package Advanced.baitaplamthem.service;

import Advanced.Student.Student;
import Advanced.baitaplamthem.data.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceCar {
    public  final  String PATH_HANG_SX ="D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\Advanced\\baitaplamthem\\data\\hangSX.csv";
    public final String PATH = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\Advanced\\baitaplamthem\\data\\car.csv";
    Scanner scanner = new Scanner(System.in);
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    public Car create(){
        List<String> list = readAndWriteFile.readFile(PATH_HANG_SX);
        System.out.println("Ban hay nhap BKS");
        String bks = scanner.nextLine();
        System.out.println("-----------------Danh sach hang sx------------------");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("Ban hay chon id hang sx");
        int index = Integer.parseInt(scanner.nextLine());
        String name = list.get(index);
        System.out.println("Ban hay nhap Years");
        int yesrs = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hya nhap namePeople");
        String namePeople = scanner.nextLine();
        System.out.println("Ban hay nhap NumberIndex");
        int numIndex = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap style Car");
        String style = scanner.nextLine();
        return new Car(bks,name,yesrs,namePeople,numIndex,style);
    }
    public void add(){
        List<Car> list1 = getListCar();
        list1.add(create());
    readAndWriteFile.writeFile(PATH,list1);
    }

    public List<Car> getListCar(){
        List<Car> list = new ArrayList<>();
        List<String> listString = readAndWriteFile.readFile(PATH);
        for (String list1: listString){
            String arr[] = list1.split(",");
            list.add(new Car(arr[0], arr[1],Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[4]), arr[5]));
        }
        return list;
    }
    public void display(){
        List<Car> listCar = getListCar();
        for (Car list: listCar){
            System.out.println(list);
        }
    }
    public boolean searchBks(String bks){
        List<Car> listCar = getListCar();
        for(int i = 0;i<listCar.size();i++){
            if(listCar.get(i).getBsk().equals(bks)){
                return true;
            }
        }
        return false;
    }
    public void delete(String bks){
        List<Car> listCar = getListCar();
        for(int i = 0;i<listCar.size();i++){
            if(listCar.get(i).getBsk().equals(bks)){
                System.out.println("Da xoa " +listCar.get(i).toString());
                listCar.remove(i);
            }
        }
        readAndWriteFile.writeFile(PATH,listCar);
    }
}
