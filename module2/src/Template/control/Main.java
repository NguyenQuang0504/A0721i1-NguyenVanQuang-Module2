package Template.control;

import Template.service.ServiceStudent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        ServiceStudent student = new ServiceStudent();
        boolean check  = true;
        do {
            System.out.println("Ban hay chon cac tuy chon: ");
            System.out.println("1. Them SV");
            System.out.println("2. Hien thi");
            System.out.println("3. Sua");
            System.out.println("4. Xoa");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    System.out.println("-----------------------------------------------------------------");
                    student.add();
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------------");
                    student.display();
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------------");
                    student.Sua();
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------------------");
                    student.delete();
                    break;
                default:
                    System.out.println("No opction");
                    check  = false;
            }
        }
        while(check);
    }
}
