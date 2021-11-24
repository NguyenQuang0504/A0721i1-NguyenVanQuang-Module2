package thi_module_2.Service;

import thi_module_2.Phone.PhoneChinhHang;
import thi_module_2.Phone.PhoneXachTay;
import thi_module_2.data.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceDienThoaiXachTay {
    public final String PATH = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\thi_module_2\\data\\DienThoaiXachTay.csv";
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    Scanner scanner = new Scanner(System.in);
    public List<PhoneXachTay> getList(){
        List<PhoneXachTay> list = new ArrayList<>();
        List<String> listString = readAndWriteFile.readFile(PATH);
        for(String list1: listString){
            String arr[] = list1.split(",");
            list.add(new PhoneXachTay(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]), arr[3],arr[4], arr[5]));
        }
        return list;
    }
    public PhoneXachTay create(int id){
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
        System.out.println("Ban hay nhap quoc gia xach tay");
        String country = scanner.nextLine();
        System.out.println("Ban hay nhap trang thai");
        String status = scanner.nextLine();
        return new PhoneXachTay(id,name,cost,nhaSx, country, status);
    }
    public double setCost() throws ExceptionCustom {
        System.out.println("Ban hay nhap cost");
        double cost = Double.parseDouble(scanner.nextLine());
        if(cost<0){
            throw new ExceptionCustom("Ban nhap sai gia");
        }
        return cost;
    }
    public void add(){
        List<PhoneXachTay> list = getList();
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
        List<PhoneXachTay> lisId = getList();
        for (int i=0;i<lisId.size();i++){
            if(lisId.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }
    public void delete(int id){
        List<PhoneXachTay> list = getList();
        for (int i = 0;i<list.size();i++){
            if(list.get(i).getId() == id){
                System.out.println("Ban da xoa thanh cong " +list.get(i).toString());
                list.remove(i);
            }
        }
        readAndWriteFile.writeFile(PATH,list);
    }
    public void display(){
        List<PhoneXachTay> list = getList();
        for (PhoneXachTay list1: list){
            System.out.println(list1.toString1());
        }
    }

    public boolean check(String name){
        List<PhoneXachTay> list = getList();
        for (PhoneXachTay list1: list){
            if(list1.getName().contains(name)){
                return true;
            }
        }
        return false;
    }

    public void search(String name){
        List<PhoneXachTay> list = getList();
        for (PhoneXachTay list1: list){
            if(list1.getName().contains(name)){
                System.out.println(list1.toString1());
            }
        }
    }
}
