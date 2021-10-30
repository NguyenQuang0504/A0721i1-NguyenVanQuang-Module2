package ss12_thuat_toan_tim_kiem.thuchanh.caidatthuattoantimkiemnhiphankhongsudungdequy;

public class BinarySearch {
    public static void main(String[] args) {
     int arrs[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arrs,5));
    }
    static int binarySearch(int[] arrs, int element){
        int first = arrs[0];
        int last = arrs[arrs.length-1];
        while (first<=last){
            int mid = (first+last)/2;
            if(first==last){
                return mid;
            }
            else if(arrs[mid]>element){
                last = mid-1;
            }
            else {
                first = mid+1;
            }
        }
        return -1;
    }
}
