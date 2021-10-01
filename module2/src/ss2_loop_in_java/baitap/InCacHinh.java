package ss2_loop_in_java.baitap;

import java.util.Scanner;

public class InCacHinh {
    public static void main(String[] args) {
        String text = "";
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("Hay chon cac tuy chon sau: ");
            System.out.println("1. Ve hinh chu nhat");
            System.out.println("2. Ve hinh tam giac deu");
            System.out.println("3. Ve hinh tam giac vuong");
            System.out.println("0. Exit");
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    for(int i =1;i<=10;i++){
                        for (int j = 0;j<=5;j++){
                            text = text + "*";
                        }
                        System.out.println(text);
                        text = "";
                    }
                break;
                case 2:
                    for (int i = 1;i<=10;i++){
                        for(int j=(10-i);j>=1;j--){
                            text = text +" ";
                        }
                        for(int k = 1;k<=(i*2-1);k++){
                            text = text +"*";
                        }
                        System.out.println(text);
                        text = "";
                    }
                    break;
                case 3:
                    for(int i = 1;i<=10;i++){
                        for (int j = 1;j<=i;j++){
                            text = text +"*";
                        }
                        System.out.println(text);
                        text = "";
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!!!");
            }
        }
    }
}
