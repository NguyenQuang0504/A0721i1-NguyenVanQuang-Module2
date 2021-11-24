package thi_module_2.Service;
import thi_module_2.Phone.PhoneChinhHang;
import thi_module_2.data.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceDienThoaiChinhHang {
    Scanner scanner = new Scanner(System.in);
    public final String PATH = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\thi_module_2\\data\\DienThoaiChinhHang.csv";
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    public List<PhoneChinhHang> getList(){
        List<PhoneChinhHang> list = new ArrayList<>();
        List<String> listString = readAndWriteFile.readFile(PATH);
        for(String list1: listString){
            String arr[] = list1.split(",");
            list.add(new PhoneChinhHang(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]), arr[3], Integer.parseInt(arr[4]), arr[5]));
        }
        return list;
    }
    public PhoneChinhHang create(int id){
        System.out.println("Ban hay nhap name");
        String name = scanner.nextLine();
        double cost = 0;
        try {
            cost = setCost();
        } catch (ExceptionCustom exceptionCustom) {
            exceptionCustom.printStackTrace();
        }
        System.out.println("Ban hay nhap nha Sx");
        String nhaSx = scanner.nextLine();
        int tgBh = 0;
        try {
            tgBh = setTgBh();
        } catch (ExceptionTimeBh exceptionTimeBh) {
            exceptionTimeBh.printStackTrace();
        }
        System.out.println("Ban hay nhap pham vi hao hanh");
        String pvBh = scanner.nextLine();
        return new PhoneChinhHang(id,name,cost,nhaSx,tgBh,pvBh);
    }
    public double setCost() throws ExceptionCustom {
        System.out.println("Ban hay nhap cost");
        double cost = Double.parseDouble(scanner.nextLine());
        if(cost<0){
            throw new ExceptionCustom("Ban nhap sai gia");
        }
        return cost;
    }
    public int setTgBh() throws ExceptionTimeBh {
        System.out.println("Ban hay nhap thoi gian bao hanh");
        int tgBh = Integer.parseInt(scanner.nextLine());
        if(tgBh>730||tgBh<0){
            throw new ExceptionTimeBh("Ban nhap tg bao hanh sai");
        }
        return tgBh;
    }
    public void add(){
        List<PhoneChinhHang> list = getList();
        int id;
        if(list.size()>0){
            id=list.size()+1;
        }
        else {
            id =1;
        }
        list.add(create(id));
        readAndWriteFile.writeFile(PATH,list);
    }
    public boolean searchId(int id){
        List<PhoneChinhHang> lisId = getList();
        for (int i=0;i<lisId.size();i++){
            if(lisId.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }
    public void delete(int id){
        List<PhoneChinhHang> list = getList();
        for (int i = 0;i<list.size();i++){
            if(list.get(i).getId() == id){
                System.out.println("Ban da xoa thanh cong " +list.get(i).toString());
                list.remove(i);
            }
        }
        readAndWriteFile.writeFile(PATH,list);
    }
    public void display(){
        List<PhoneChinhHang> list = getList();
        for (PhoneChinhHang list1: list){
            System.out.println(list1.toString1());
        }
    }
    public boolean check(String name){
        List<PhoneChinhHang> list = getList();
        for (PhoneChinhHang list1: list){
            if(list1.getName().contains(name)){
                return true;
            }
        }
        return false;
    }
    public void search(String name){
        List<PhoneChinhHang> list = getList();
        for (PhoneChinhHang list1: list){
            if(list1.getName().contains(name)){
                System.out.println(list1.toString1());
            }
        }
    }
}
