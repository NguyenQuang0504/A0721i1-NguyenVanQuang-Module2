package case_study.services;

import case_study.data.WriteAndReadFile;
import case_study.models.Contract;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ContractServiceImpl implements ContactService{
    public static final String PATH = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\case_study\\data\\contract.csv";
    WriteAndReadFile writeAndReadFile = new WriteAndReadFile();
    static Scanner scanner = new Scanner(System.in);
    public Contract inputAdd() {
        System.out.println("Ban hay nhap id Constracts");
        int idConstracts = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap id Booking");
        int idBooking = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap deposit");
        int deposit = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap money");
        int money = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap is Customer");
        int idCustomer = Integer.parseInt(scanner.nextLine());
        return new  Contract(idConstracts,idBooking,deposit,money,idCustomer);
    }
    public List<Contract> getConstract(){
        List<Contract> contractList = new LinkedList<>();
        List<String> list = writeAndReadFile.readFile(PATH);
        for(int i=0;i<list.size();i++){
            String arr[] = list.get(i).split(",");
            Contract contract = new Contract(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]) , Integer.parseInt(arr[3]),Integer.parseInt(arr[4]));
            contractList.add(contract);
        }
        return contractList;
    }
    @Override
    public void add(){
        List<Contract> list = new ArrayList<>();
        list = getConstract();
        list.add(inputAdd());
        writeAndReadFile.writeFile(PATH,list);
    }
    @Override
    public void display() {
        List<Contract> list = new ArrayList<>();
        list = getConstract();
        for (Contract list1: list){
            System.out.println(list1.toString());
        }
    }
    @Override
    public void edit() {
        display();
        System.out.println("Ban hay nhap id Constract muon edit");
        int id = Integer.parseInt(scanner.nextLine());
        List<Contract> list = new ArrayList<>();
        list = getConstract();
        int size = list.size();
        for (int i=0;i<size;i++){
            if(list.get(i).getIdContract()==id){
                list.add(i,inputAdd());
                list.remove(i+1);
            }
        }
        writeAndReadFile.writeFile(PATH,list);
    }

}
