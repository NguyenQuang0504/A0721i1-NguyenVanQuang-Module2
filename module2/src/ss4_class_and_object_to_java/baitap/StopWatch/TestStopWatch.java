package ss4_class_and_object_to_java.baitap.StopWatch;

public class TestStopWatch {
    public static void main(String[] args) {
        int array[];
        int count;
        array = new int[100000];
        //Khoi tao doi tuong stopwatch
        StopWatch stopwatch = new StopWatch();
        //Hien thi thoi gian bat dau
        stopwatch.start();
        System.out.println("Thoi gian bat dau thuat toan: " + stopwatch.getStartTime());
        //Thuat toan doi cho 100000 so
        for (int i = 0; i < 100000; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            count = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = count;
        }
        //Hien thi thoi gian ket thuc
        stopwatch.stop();
        System.out.println("Thoi gian ket thuc thuat toan: " + stopwatch.getEndTime());
        // Tinh toan thoi gian thuc hien thuat toan
        System.out.println("Thoi gian thuc hien thuat toan: " + stopwatch.getElapsedTime());
    }
}
