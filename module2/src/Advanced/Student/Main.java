package Advanced.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        boolean check = true;
        int choices = 0;
        do {
            System.out.println("OPCTION");
            System.out.println("1. ADD STUDENT");
            System.out.println("2. DISPLAY STUDENT");
            System.out.println("3. EDIT STUDENT");
            System.out.println("4. SEARCH STUDENT");
            System.out.println("5. EXIT");
            try {
                choices = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                e.printStackTrace();
            }
            switch (choices){
                case 1:
                    System.out.println("-------------------------------------------------------");
                    studentService.add1();
                    break;
                case 2:
                    System.out.println("-------------------------------------------------------");
                    studentService.display1();
                    break;
                case 3:
                    System.out.println("-------------------------------------------------------");
                    studentService.edit1();
                    break;
                case 4:
                    System.out.println("-------------------------------------------------------");
                    studentService.search1();
                    break;
                case 5:
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
