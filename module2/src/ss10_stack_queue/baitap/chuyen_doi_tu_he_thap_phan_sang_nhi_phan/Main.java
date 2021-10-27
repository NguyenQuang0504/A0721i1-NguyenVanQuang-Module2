package ss10_stack_queue.baitap.chuyen_doi_tu_he_thap_phan_sang_nhi_phan;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap so muon doi thanh nhi phan!!!!");
        int number = Integer.parseInt(input.nextLine());
        while (number!=0){
            stacks.push(number%2);
            number = (int)number/2;
        }
        String chars = "";
        int arrs[] = new int[stacks.size()];
        for(int i = 0;i<arrs.length;i++){
            arrs[i] = stacks.pop();
        }
        for(int i = arrs.length-1;i>=0;i--){
            chars = chars + arrs[i];
        }
        System.out.println(chars);
    }
}
