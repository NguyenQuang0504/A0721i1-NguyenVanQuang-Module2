package ss12_thuat_toan_tim_kiem.baitap.timchuoilientiepcododailonnhat;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String stringInput ;
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap chuoi muon kiem tra");
        stringInput = input.nextLine();
        char charArray[] = stringInput.toCharArray();
        for(int i=0;i<charArray.length;i++){
            for(int j=i+1;j<charArray.length;j++){
                if((int)charArray[j]<(int)charArray[i]){
                    char count = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = count;
                }
            }
        }
        for(int i = 0;i<charArray.length;i++){
            System.out.println(charArray[i]);
        }
    }
}
