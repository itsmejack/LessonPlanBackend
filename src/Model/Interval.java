package Model;

import java.util.Objects;

public class Interval {
    private int day;
    private int hour;

    public Interval(int day, int hour) {
        this.day = day;
        this.hour = hour;
    }
    public Interval() {
        //
    }

    public void printInformation() {
        System.out.println("Interval day " + day + " hour " + hour);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return day == interval.day && hour == interval.hour && occupied == interval.occupied;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, hour, occupied);
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }
    protected boolean occupied = false;

    public boolean isOccupied() {
        return occupied;
    }
}
