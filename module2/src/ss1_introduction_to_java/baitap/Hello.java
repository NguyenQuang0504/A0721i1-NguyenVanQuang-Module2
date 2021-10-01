package ss1_introduction_to_java.baitap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = input.nextLine();
        System.out.println("Hello: " +name);
    }
}
