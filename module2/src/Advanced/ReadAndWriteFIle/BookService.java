package Advanced.ReadAndWriteFIle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    static List<Book> listBook = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    ReadAndWrite readAndWrite = new ReadAndWrite();
    public BookService(){
        listBook = getAll();
    }
    public ArrayList<Book> getAll(){
        ArrayList<Book> listBook = new ArrayList<>();
        List<String> list = readAndWrite.readData();
        for (String list1: list){
           String arr[] = list1.split(",");
           Book newBook = new Book(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]));
           listBook.add(newBook);
        }
      return   listBook;
    }
    public void update(){
        readAndWrite.writeData(listBook);
    }
    public Book create(int id){
        System.out.println("Ban hay nhap name");
        String name = scanner.nextLine();
        System.out.println("Ban hay nhap cost");
        double cost = Double.parseDouble(scanner.nextLine());
        return new Book(id,name,cost);
    }
    public void add(){
        int id;
        if(listBook.size()>0){
             id=listBook.size()+1;
        }
        else {
           id =1;
        }
        listBook.add(create(id));
        for (Book list: listBook){
            readAndWrite.writeData(listBook);
        }
    }
    public void display(){
       List<String> list = new ArrayList<>();
       list = readAndWrite.readData();
       for (String list1: list){
           System.out.println(list1);
       }
    }
    public void edit(){
        display();
        getAll();
        System.out.println("Ban hay nhap id muon edit");
        int id = Integer.parseInt(scanner.nextLine());
        int size = listBook.size();
        for (int i=0;i<size;i++){
            if(listBook.get(i).getId()==id){
                System.out.println("Nhap id moi");
                int idNew = Integer.parseInt(scanner.nextLine());
                listBook.add(i,create(idNew));
                listBook.remove(i+1);
                update();
            }
        }
    }
    public void delete(){
        display();
        int count=0;
        System.out.println("Ban hay nhap id muon xoa");
        int id = Integer.parseInt(scanner.nextLine());
        int sizea = listBook.size();
        for (int i = 0;i <sizea ; i++){
            if(listBook.get(i).getId() == id){
               count = i;
            }
        }
        listBook.remove(count);
        update();
    }
}
