package ss10_stack_queue.baitap.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stacks = new  Stack<>();
        Queue<Character> queues = new ArrayDeque<>();
        boolean check = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Ban hay nhap chuoi muon kiem tra!!!!");
        String chars = input.nextLine();
        char arrs[] = chars.toCharArray();
        for(int i = 0;i<arrs.length;i++){
            stacks.add(arrs[i]);
            queues.add(arrs[i]);
        }
        while (!stacks.isEmpty()){
            if(!(stacks.pop() == queues.poll())){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Chuoi nay la chuoi PALINDROME!!!!!!");
        }
        else {
            System.out.println("Not PALINDROME!!!!");
        }
    }
}
