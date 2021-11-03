package ss13_thuat_toan_sap_xep.thuchanh.caidatthuattoansapxepnoibot;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
    double arrs[] = {3,4,4,1,2,5,7,8};
        search(arrs);
        System.out.println(Arrays.toString(arrs));
    }
    public static void search(double[] arrs){
        boolean check = true;
        for(int i = 0;i<arrs.length-1&& check;i++){
            check = false;
            for(int j = arrs.length -1;j>i;j--){
                if(arrs[j]<arrs[j-1]){
                    double temp = arrs[j];
                    arrs[j] = arrs[j-1];
                    arrs[j-1]= temp;
                    check  = true;
                }
            }
        }

    }
}
