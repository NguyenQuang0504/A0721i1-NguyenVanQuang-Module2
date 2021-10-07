package ss4_class_and_object_to_java.baitap.StopWatch;

import java.text.Format;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        this.startTime = java.time.LocalTime.now();
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = java.time.LocalTime.now();
    }

    public void stop() {
        this.endTime = java.time.LocalTime.now();
    }

    public String getElapsedTime() {
        return endTime.getHour() - startTime.getHour() + " : " + (endTime.getMinute() - startTime.getMinute()) + " : " + (endTime.getSecond() - startTime.getSecond()) + " : " + (endTime.getNano() - startTime.getNano());
    }
}
