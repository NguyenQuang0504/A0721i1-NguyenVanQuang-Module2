package ss13_thuat_toan_sap_xep.baitap.minhhoathuattoanspxepchen;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arrs[] = {1,4,2,6,8,2,4,3};
        insertionSort(arrs);
        System.out.println("Ket qua");
        System.out.println(Arrays.toString(arrs));
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            System.out.println("Lan thu" +i);
            System.out.println(Arrays.toString(array));
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
