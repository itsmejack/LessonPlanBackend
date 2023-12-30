package Model;

import java.util.Set;

public class Student extends Person {
    @Override
    public void printInformation() {
        System.out.println("Student:");
        super.printInformation();
    }
    public Student(Set<Interval> freeIntervals) {
        super(freeIntervals);
    }
}
