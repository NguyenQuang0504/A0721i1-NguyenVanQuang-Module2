package Advanced.baitaplamthem.controller;
import Advanced.baitaplamthem.service.ServiceCar;
import Advanced.baitaplamthem.service.ServiceMotobike;
import Advanced.baitaplamthem.service.ServiceVans;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceCar serviceCar = new ServiceCar();
        ServiceVans serviceVans = new ServiceVans();
        ServiceMotobike serviceMotobike = new ServiceMotobike();
        boolean check = true;
        String choices = null;
        do {
            System.out.println("OPCTION");
            System.out.println("1. ADD VEHICLE");
            System.out.println("2. DISPLAY VEHICLE");
            System.out.println("3. DELETE VEHICLE");
            System.out.println("4. EXIT");
            try {
                choices = scanner.nextLine();
            }catch (Exception e){
                e.printStackTrace();
            }
            switch (choices){
                case "1":
                        System.out.println("-------------------------------------------------------");
                        System.out.println("1.ADD VANS");
                        System.out.println("2.ADD CARS");
                        System.out.println("3.ADD MOTOBIKE");
                        int choices1 = Integer.parseInt(scanner.nextLine());
                        switch (choices1){
                            case 1:
                                System.out.println("ADD VANS");
                                serviceVans.add();
                                break;
                            case 2:
                                System.out.println("ADD CARS");
                                serviceCar.add();
                                break;
                            case 3:
                                System.out.println("ADD MOTOBIKE");
                                serviceMotobike.add();
                                break;
                        }
                    break;
                case "2":
                    System.out.println("-------------------------------------------------------");
                    System.out.println("1.DISPLAY VANS");
                    System.out.println("2.DISPLAY CARS");
                    System.out.println("3.DISPLAY MOTOBIKE");
                    int choices2 = Integer.parseInt(scanner.nextLine());
                    switch (choices2){
                        case 1:
                            System.out.println("DISPLAY VANS");
                            serviceVans.display();
                            break;
                        case 2:
                            System.out.println("DISPLAY CARS");
                            serviceCar.display();
                            break;
                        case 3:
                            System.out.println("DISPLAY MOTOBIKE");
                            serviceMotobike.display();
                            break;
                    }
                    break;
                case "3":
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Ban hay nhap BKS");
                    String bks = scanner.nextLine();
                    if(serviceCar.searchBks(bks)||serviceMotobike.searchBks(bks)||serviceVans.searchBks(bks)){
                        System.out.println("Ban co muon xoa " +bks);
                        System.out.println("1.Yes");
                        System.out.println("2.No");
                        String choises = scanner.nextLine();
                        switch (choises){
                            case "Yes":
                                serviceCar.delete(bks);
                                serviceMotobike.delete(bks);
                                serviceVans.delete(bks);
                                break;
                            case "No":
                                break;
                        }
                    }
                    else {
                        System.out.println("Bien kiem soat khong ton tai");
                    }
                    break;
                case "4":
                    System.out.println("EXIT");
                    check = false;
                    break;
                default:
                    System.out.println("NO CORRECT");
                    break;
            }
        }
        while (check);
    }
}
