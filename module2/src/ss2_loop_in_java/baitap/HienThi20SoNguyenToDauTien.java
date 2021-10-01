package ss2_loop_in_java.baitap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 1;
        int m = 2;
        boolean check = true;
        while (count <= 20) {
            for (int j = 2; j <= Math.sqrt(m); j++) {
                if (m % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("So nguyen to thu " + count + " la: " + m);
                count = count + 1;
            }
                m=m+1;
                check = true;
        }
    }
}
