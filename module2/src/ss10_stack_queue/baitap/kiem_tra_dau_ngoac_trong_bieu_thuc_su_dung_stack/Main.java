package ss10_stack_queue.baitap.kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stacks = new Stack<>();
        Scanner input  = new Scanner(System.in);
        boolean check = true;
        char left = ' ';
        System.out.println("Ban hay nhap bieu thuc kiem tra!!!");
        String chars = input.nextLine();
        char arrs[] = chars.toCharArray();
        for(int i = 0;i<arrs.length;i++){
            if(arrs[i]=='('){
                stacks.add(arrs[i]);
            }
            if(arrs[i] ==')'){
                if(stacks.isEmpty()){
                    check = false;
                    break;
                }
                left = stacks.pop();
                if(left!='('){
                    check = false;
                    break;
                }
            }
        }
        if(stacks.isEmpty()&&check){
            System.out.println("Su dung dung dau ngoac!!!!!");
        }
        else {
            System.out.println("Su dung sai dau ngoac!!!!!!");
        }
    }
}
