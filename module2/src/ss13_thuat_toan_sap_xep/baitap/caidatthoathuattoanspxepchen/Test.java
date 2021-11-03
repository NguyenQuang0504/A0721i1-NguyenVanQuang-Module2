package ss13_thuat_toan_sap_xep.baitap.caidatthoathuattoanspxepchen;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arrs[] = {1,6,5,3,32,1,45,6,3};
        insertionSort(arrs);
        System.out.println(Arrays.toString(arrs));
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
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
