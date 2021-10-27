package ss10_stack_queue.baitap.dao_nguoc_phan_tu_su_dung_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        Scanner input = new Scanner(System.in);
// Cach1
//        Integer[] arrays = new Integer[10];
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Ban hay nhap phan tu thu " + i + " cua mang!!!!");
//            arrays[i] = Integer.parseInt(input.nextLine());
//        }
//        System.out.println("Mang khi chua dao nguoc la!!!");
//        System.out.println(Arrays.toString(arrays));
//        for (int i = 0; i < 10; i++) {
//            stacks.add(arrays[i]);
//        }
//        for (int i = 0; i < 10; i++) {
//            arrays[i] = stacks.pop();
//        }
//        System.out.println("Mang sau khi dao nguoc la!!!");
//        System.out.println(Arrays.toString(arrays));
// Cach 2
        System.out.println("Ban hay nhap chuoi so nguyen muon doi!!!!");
        String chars = input.nextLine();
        char arraychar[] = chars.toCharArray(); // Chuyen String thanh mang char
        int numArray[] = new int[arraychar.length];
        for(int i=0;i<arraychar.length;i++){
            numArray[i] = Character.getNumericValue(arraychar[i]); // Chuyen tung phan tu kieu char thanh kieu int roi gan vao mang numArray
        }
        System.out.println("Chuoi ban nhap la!!!");
        System.out.println(chars);
        chars = "";
        for(int i =0;i<arraychar.length;i++){
            stacks.push(numArray[i]); // push tung phan tu cua numArray vao stack
        }
        for(int i =0;i<numArray.length;i++){
            numArray[i] = stacks.pop(); // pop tung phan tu cua stack ra numArray
            chars = chars + numArray[i];
        }
        System.out.println("Chuoi sau khi dao nguoc la!!!");
        System.out.println(chars);
    }
}
