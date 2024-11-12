package tasks;

import tasks.Time;

public class Seventh {
    public static void main(String[] args) {
        Time time1 = new Time(0, 0, 59);
        Time time2 = new Time(0, 1, 1);

        Time.difference(time1, time2).print();
    }
}
