package ss2_loop_in_java.baitap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int m =2;
        int count =1;
        boolean check = true;
        while (m<=100){
            for(int i = 2;i<=Math.sqrt(m);i++){
                if(m%i==0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("So nguyen to thu " +count +" la: " +m);
                count = count +1;
            }
            m=m+1;
            check = true;
        }
    }
}
