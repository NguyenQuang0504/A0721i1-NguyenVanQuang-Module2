package case_study.services;

import case_study.models.Contract;

import java.util.LinkedList;
import java.util.Scanner;

public class ContractServiceImpl implements ContactService{
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
    }
    @Override
    public void display() {
    for (Contract listConstract: listConstract){
        System.out.println(listConstract);
    }
    }

    @Override
    public void edit() {
    display();
        System.out.println("Ban hay nhap id Constract muon edit");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i=0;i<listConstract.size();i++){
            if(listConstract.get(i).getIdContract()==id){
                listConstract.add(i,inputAdd());
                listConstract.remove(i+1);
            }
        }
    }

}
