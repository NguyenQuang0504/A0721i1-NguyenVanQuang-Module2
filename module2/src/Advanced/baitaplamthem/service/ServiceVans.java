package Advanced.baitaplamthem.service;

import Advanced.baitaplamthem.data.ReadAndWriteFile;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceVans {
    public  final  String PATH_HANG_SX ="D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\Advanced\\baitaplamthem\\data\\hangSX.csv";
    public final String PATH = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\Advanced\\baitaplamthem\\data\\vams.csv";
    Scanner scanner = new Scanner(System.in);
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    public Vans create(){
        List<String> list = readAndWriteFile.readFile(PATH_HANG_SX);
        System.out.println("Ban hay nhap BKS");
        String bks = scanner.nextLine();
        System.out.println("Ban hay chon id hang sx");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        int index = Integer.parseInt(scanner.nextLine());
        String name = list.get(index);
        System.out.println("Ban hay nhap Years");
        int yesrs = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hya nhap namePeople");
        String namePeople = scanner.nextLine();
        System.out.println("Ban hay nhap weight");
        int weight = Integer.parseInt(scanner.nextLine());
        return new Vans(bks,name,yesrs,namePeople,weight);
    }
    public void add(){
        List<Vans> list1 = getListVans();
        list1.add(create());
        readAndWriteFile.writeFile(PATH,list1);
    }
    public List<Vans> getListVans(){
        List<Vans> list = new ArrayList<>();
        List<String> listString = readAndWriteFile.readFile(PATH);
        for (String list1: listString){
            String arr[] = list1.split(",");
            list.add(new Vans(arr[0], arr[1],Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[4])));
        }
        return list;
    }
    public void display(){
        List<Vans> listCar = getListVans();
        for (Vans list: listCar){
            System.out.println(list);
        }
    }
    public boolean searchBks(String bks){
        List<Vans> listCar = getListVans();
        int size = listCar.size();
        for(int i = 0;i<size;i++){
            if(bks.equals(listCar.get(i).getBsk())){
                return true;
            }
        }
        return false;
    }
    public void delete(String bks){
        List<Vans> listCar = getListVans();
        for(int i = 0;i<listCar.size();i++){
            if(bks.equals(listCar.get(i).getBsk())){
                System.out.println("Da xoa " +listCar.get(i).toString());
                listCar.remove(i);
            }
        }
        readAndWriteFile.writeFile(PATH,listCar);
    }
}
