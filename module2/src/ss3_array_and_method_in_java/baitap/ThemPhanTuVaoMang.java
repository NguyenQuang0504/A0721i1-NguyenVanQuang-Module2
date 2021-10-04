package ss3_array_and_method_in_java.baitap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        String text = "";
        int array_number[] = {1, 2, 3, 4, 5, 6, 0, 0, 0, 0};
        int number;
        int index;
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap phan tu muon them vao!!!");
        number = Integer.parseInt(input.nextLine());
        do {
            System.out.println("Ban hay nhap vi tri phan tu them vao!!!");
            index = Integer.parseInt(input.nextLine());
        }
        while (index >= 10);
        // Them phan tu vao mang.
        for (int i = 0; i < array_number.length; i++) {
            if (index == i) {
                for (int j = array_number.length - 1; j >= i + 1; j--) {
                    array_number[j] = array_number[j - 1];
                }
                array_number[i] = number;
            }
        }
        //Duyet mang luu vao text
        for (int i = 0; i < array_number.length; i++) {
            text = text + array_number[i] + ",";
        }
        System.out.println("Mang sau khi them " + number + " vao vi tri " + " thu " + index + " la: " + text);
    }
}
