package Advanced.ReadAndWriteFileBinary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        boolean check = true;
        do {
            System.out.println("----------------OPCTION------------------------");
            System.out.println("1.ADD");
            System.out.println("2.DISPLAY");
            System.out.println("3.EDIT");
            System.out.println("4.SEARCH");
            System.out.println("5.DELETE");
            System.out.println("6.EXIT");
            int choices = Integer.parseInt(scanner.nextLine());
            switch (choices){
                case 1:
                    System.out.println("ADD");
                    studentService.add();
                    break;
                case 2:
                    System.out.println("DISPLAY");
                    studentService.display();
                    break;
                case 3:
                    System.out.println("EDIT");
                    studentService.edit();
                    break;
                case 4:
                    System.out.println("SEARCH");
                    studentService.search();
                    break;
                case 5:
                    System.out.println("DELETE");
                    studentService.delete();
                    break;
                case 6:
                    System.out.println("EXIT");
                    check = false;
                    break;
                default:
                    check = false;
            }
        }
        while (check);
    }
}
