package Advanced.ReadAndWriteFIle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();
        boolean check = true;
        do{
            int choices = 0;
            System.out.println("------------------------------------OPCTION--------------------------------------");
            System.out.println("1. ADD BOOK");
            System.out.println("2. DISPLAY");
            System.out.println("3. EDIT");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");
            try {
                choices = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                e.printStackTrace();
            }
            switch (choices){
                case 1:
                    System.out.println("-----------------------------------------------------------------------------------------");
                    bookService.add();
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------------------------------------");
                    bookService.display();
                    break;
                case 3:
                    System.out.println("-------------------------------------------------------------------------------------------");
                    bookService.edit();
                    break;
                case 4:
                    System.out.println("--------------------------------------------------------------------------------------------");
                    bookService.delete();
                    break;
                case 5:
                    check = false;
                    break;
                default:
                    System.out.println("NO CORRECT");
                    check = false;

            }
        }
        while (check);
    }
}
