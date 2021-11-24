package Advanced.baitaplamthem.service;

import Advanced.baitaplamthem.data.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceMotobike {
    public final String VALIDATE = "^[0-9]{2}+[-Y]+[0-9]{1}+[-]{1}+[0-9]{3}+[.]+[0-9]{2}$";
    public final String PATH_BKS = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\Advanced\\baitaplamthem\\data\\BKS";
    public final String PATH_HANG_SX = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\Advanced\\baitaplamthem\\data\\hangSX.csv";
    public final String PATH = "D:\\A0721i1-NguyenVanQuang-Module2\\module2\\src\\Advanced\\baitaplamthem\\data\\motobike.csv";
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    Scanner scanner = new Scanner(System.in);

    public Motobike create() {
        String bks = setBks();
        List<String> list = readAndWriteFile.readFile(PATH_HANG_SX);
        System.out.println("-----------------Danh sach cac hangh SX----------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        int index = 0;
        try {
            System.out.println("Ban hay chon id hang sx");
            index = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Nhap sai dinh dang");
        }
        String name = list.get(index + 1);
        System.out.println("Ban hay nhap Years");
        int yesrs = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hya nhap namePeople");
        String namePeople = scanner.nextLine();
        System.out.println("Ban hay nhap wattage");
        int wattage = Integer.parseInt(scanner.nextLine());
        return new Motobike(bks, name, yesrs, namePeople, wattage);
    }

    public void add() {
        List<Motobike> list1 = getListMotobike();
        list1.add(create());
        readAndWriteFile.writeFile(PATH, list1);
    }
// Phuong thuc getList tra ve list Motobike
    public List<Motobike> getListMotobike() {
        List<Motobike> list = new ArrayList<>();
        List<String> listString = readAndWriteFile.readFile(PATH);
        for (String list1 : listString) {
            String arr[] = list1.split(",");
            list.add(new Motobike(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[4])));
        }
        return list;
    }
// Phuong thuc display de hien thi list Motobike
    public void display() {
        List<Motobike> listCar = getListMotobike();
        for (Motobike list : listCar) {
            System.out.println(list);
        }
    }

    public boolean searchBks(String bks) {
        List<Motobike> listCar = getListMotobike();
        int size = listCar.size();
        for (int i = 0; i < size; i++) {
            if (bks.equals(listCar.get(i).getBsk())) {
                return true;
            }
        }
        return false;
    }

    public void delete(String bks) {
        List<Motobike> listCar = getListMotobike();
        List<String> lisBks = readAndWriteFile.readFile(PATH_BKS);
        for (int i = 0; i < listCar.size(); i++) {
            if (bks.equals(listCar.get(i).getBsk())) {
                System.out.println("Da xoa " + listCar.get(i).toString());
                listCar.remove(i);
            }
        }
        for (int i = 0; i < lisBks.size(); i++) {
            if (bks.equals(lisBks.get(i))) {
                lisBks.remove(i);
            }
        }
        readAndWriteFile.writeFile(PATH_BKS,lisBks);
        readAndWriteFile.writeFile(PATH, listCar);
    }

    public boolean checkBks(String bks) {
        return bks.matches(VALIDATE);
    }

    public String setBks() {
        List<String> listBks = readAndWriteFile.readFile(PATH_BKS);
        String bks = null;
        boolean check = true;
        do {
            System.out.println("ban hay nhap BKS");
            bks = scanner.nextLine();
            if (checkBks(bks)) {
                check = false;
            } else {
                System.out.println("Nhap sai Bks!!!!!!!!!");
            }
            for (int i = 0; i < listBks.size(); i++) {
                if (listBks.get(i).equals(bks)) {
                    System.out.println("Bien kiem soat bi trung lap");
                    check = true;
                    break;
                }
            }
        }
        while (check) ;
        listBks.add(bks);
        readAndWriteFile.writeFile(PATH_BKS, listBks);
        return bks;
    }
}
