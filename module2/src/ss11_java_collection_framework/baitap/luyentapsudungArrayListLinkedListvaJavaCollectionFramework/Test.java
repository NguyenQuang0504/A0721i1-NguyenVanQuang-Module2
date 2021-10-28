package ss11_java_collection_framework.baitap.luyentapsudungArrayListLinkedListvaJavaCollectionFramework;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean check = true;
        Scanner input = new Scanner(System.in);
        ProductManager product = new ProductManager();
        System.out.println("----------------------------------------MENU PRODUCT-----------------------------------");
        do{
            System.out.println("-----------------------------------Opction!!!!-------------------------------------------------");
            System.out.println(" 1. ADD PRODUCT!!!");
            System.out.println(" 2. REPAIR");
            System.out.println(" 3. DELETE");
            System.out.println(" 4. DISPLAY");
            System.out.println(" 5. SEARCH");
            System.out.println(" 6. SORT");
            System.out.println(" 7. EXIT");
            System.out.println("-----------------------------------------------------------------------------------------------");
            int choisee = Integer.parseInt(input.nextLine());
            switch (choisee){
                case 1:
                    System.out.println("---------------------------------------ADD-------------------------------------");
                    product.add();
                    break;
                case 2:
                    System.out.println("--------------------------------------REPAIR-----------------------------------");
                    product.repair();
                    break;
                case 3:
                    System.out.println("-------------------------------------DELETE-------------------------------------");
                    product.delete();
                    break;
                case 4:
                    System.out.println("----------------------------------------DISPLAY---------------------------------");
                    product.display();
                    break;
                case 5:
                    System.out.println("---------------------------------------SEARCH------------------------------------");
                    product.search();
                    break;
                case 6:
                    System.out.println("----------------------------------------SORT---------------------------------------");
                    product.sort();
                    break;
                default:
                    check = false;
            }
        }
        while (check);
    }
}
