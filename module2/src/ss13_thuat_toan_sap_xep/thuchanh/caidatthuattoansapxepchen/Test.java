package ss13_thuat_toan_sap_xep.thuchanh.caidatthuattoansapxepchen;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int ars[] = {1,5,6,3,2,6,9,9,44,2};
        selectionSort(ars);
        System.out.println(Arrays.toString(ars));
    }
    public static void selectionSort(int[] array) {
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
}
