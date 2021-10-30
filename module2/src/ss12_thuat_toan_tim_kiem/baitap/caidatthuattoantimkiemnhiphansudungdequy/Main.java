package ss12_thuat_toan_tim_kiem.baitap.caidatthuattoantimkiemnhiphansudungdequy;

public class Main {
    public static void main(String[] args) {
        int arrs[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arrs,5,arrs[0],arrs[arrs.length-1]));
    }
    static int binarySearch(int array[], int x, int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (array[mid] == x)
                return mid;
            if (array[mid] > x)
                return binarySearch(array, x, low, mid - 1);
            return binarySearch(array, x, mid + 1, high);
        }
        return -1;
    }
}
