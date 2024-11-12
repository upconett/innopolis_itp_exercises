import java.util.Scanner;

public class Ex3 {
    
    public static class Time {
        private int hour;
        private int minute;
        private int second;

        public static int timeToSeconds(Time time) {
            int result = 0;
            result += time.second;
            result += time.minute * 60;
            result += time.hour * 3600;
            return result;
        }

        public static Time secondsToTime(int seconds) {
            int dh = seconds / 3600;
            int dm = (seconds - dh*3600 ) / 60;
            int ds = seconds - dh*3600 - dm*60;
            return new Time(dh, dm, ds);
        }

        public static Time difference(Time first, Time second) {
            int firstSeconds = Time.timeToSeconds(first);
            int secondSeconds = Time.timeToSeconds(second);
            return Time.secondsToTime(Math.abs(firstSeconds-secondSeconds));
        }

        public Time inc() {
            int seconds = Time.timeToSeconds(this);
            Time t = Time.secondsToTime(seconds+1);

            this.hour = t.hour;
            this.minute = t.minute;
            this.second = t.second;

            return this;
        }

        public Time(int h, int m, int s) {
            hour = h;
            minute = m;
            second = s;
        }

        public String toString() {
            return String.format(
                "%d:%d:%d", 
                hour, minute, second
            );
        }
    }
    
    public static class TimeCreator {
        public static Time createTime(int h, int m, int s) {
            return new Time(h, m, s); 
        }
        
        public static Time createTime(Scanner scanner) {
            System.out.println("Enter new Time in format (h m s): ");
            return new Time(
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt()
            );
        }
    }

    public static void main(String[] args) {
        Time time1 = TimeCreator.createTime(10, 30, 5);
        Time time2 = TimeCreator.createTime(9, 38, 58);
        System.out.println("Time1: " + time1);
        System.out.println("Time2: " + time2);

        Time timeDiff = Time.difference(time1, time2);
        System.out.println("Difference: " + timeDiff);

        System.out.println();
        Scanner scanner = new Scanner(System.in);

        time1 = TimeCreator.createTime(scanner);
        time2 = TimeCreator.createTime(scanner);

        timeDiff = Time.difference(time2, time1);
        System.out.println("Difference: " + timeDiff);
        System.out.println(
            "Adding 3 seconds: " + timeDiff.inc().inc().inc()
        );
    }
}
