package chapter3;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock (int hour, int minute, int second) {
        this.hour = hour ;
        if (hour > 23) {
            this.hour = 0;
        }
        if (minute > 59) {
            this.minute = 0;
        }
        if (minute > 59) {
            this.second = 0 ;
        }
    }

    public void setHour (int hour) {
        this.hour = hour;
    }
    public int getHour () {
        return hour ;
    }
    public void setMinute (int min) {
        minute = min;
    }
    public int getMinute () {
        return minute;
    }
    public void setSecond (int sec) {
        second = sec;
    }
    public int getSecond () {
        return second;
    }
    public void displayTime () {
        System.out.printf("%d: %d: %d", hour, minute, second) ;
    }
}
