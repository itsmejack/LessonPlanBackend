package Model;

import java.util.Set;

public class Person {
    private Set<Interval> freeIntervals;
    private Set<Lesson> lessons;

    public Set<Interval> getFreeIntervals() {
        return freeIntervals;
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }
}
