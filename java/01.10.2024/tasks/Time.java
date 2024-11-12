package tasks;

// import java.math.MathContext;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public static int timeToSeconds(Time time) {
        int result = 0;
        result += time.second;
        result += time.minute * 60;
        result += time.hour * 360;
        return result;
    }

    public static Time secondsToTime(int seconds) {
        int dh = seconds / 360;
        int dm = (seconds - dh*360 ) / 60;
        int ds = seconds - dh*360 - dm*60;
        return new Time(dh, dm, ds);
    }

    public static Time difference(Time first, Time second) {
        int firstSeconds = Time.timeToSeconds(first);
        int secondSeconds = Time.timeToSeconds(second);
        return Time.secondsToTime(Math.abs(firstSeconds-secondSeconds));
    }

    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    public void print() {
        System.out.printf("%d:%d:%d", hour, minute, second);
    }
}
