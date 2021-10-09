package ss4_class_and_object_to_java.baitap.stopwatch;


public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public String getElapsedTime() {
        return "Ket qua thuc thi chuong trinh la: " +(getEndTime()-getStartTime());
    }
}
