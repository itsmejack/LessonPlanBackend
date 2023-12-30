package Model;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private Set<Interval> freeIntervals = new HashSet<>();
    private Set<Lesson> lessons = new HashSet<>();

    public void printInformation() {
        freeIntervals.stream().forEach(Interval::printInformation);
        lessons.stream().forEach(Lesson::printInformation);
    }

    public void printTimetable() {
        //
    }

    public Person(Set<Interval> freeIntervals) {
        this.freeIntervals = freeIntervals;
    }

    public Set<Interval> getFreeIntervals() {
        return freeIntervals;
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }
}
