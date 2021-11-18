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
    LinkedList<Contract> listConstract = new LinkedList<Contract>();
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
    @Override
    public void add(){
        listConstract.add(inputAdd());
        for (Contract list: listConstract) {
            writeAndReadFile.writeFile(PATH, list);
        }
    }
    @Override
    public void display() {
        for (String list2: writeAndReadFile.readFile(PATH)){
            System.out.println(list2);
        }
    }
    public List<Contract> getList(){
        List<String > list = writeAndReadFile.readFile(PATH);
        List<Contract> listConstract1 = new ArrayList<>();
        for (String list1: list){
            String array[] = list1.split(",");
            Contract contract = new Contract(Integer.parseInt(array[0]), Integer.parseInt(array[1]),Integer.parseInt(array[2]),Integer.parseInt(array[3]),Integer.parseInt(array[4]));
            listConstract1.add(contract);
        }
        return listConstract1;
    }
    @Override
    public void edit() {
        display();
        System.out.println("Ban hay nhap id Constract muon edit");
        int id = Integer.parseInt(scanner.nextLine());

        for (int i=0;i<getList().size();i++){
            if(getList().get(i).getIdContract()==id){
                listConstract.add(i,inputAdd());
                listConstract.remove(i+1);
            }
        }
    }

}
