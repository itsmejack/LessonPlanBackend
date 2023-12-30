package Model;

public class Lesson extends Interval {
    private Teacher teacher;
    private Student student;

    public Lesson(Teacher teacher, Student student) {
        //?? do we need this info here?
        this.teacher = teacher;
        this.student = student;
        this.occupied = true;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public void printInformation() {
        System.out.println("Lesson day " + getDay() + " hour " + getHour());
    }

    public void setLesson(Interval interval) {
        setDay(interval.getDay());
        setHour(interval.getHour());
        teacher.getFreeIntervals().remove(interval);
        teacher.addLesson(this);
        student.getFreeIntervals().remove(interval);
        student.addLesson(this);
    }
    public boolean isLessonSet() {
        return getDay() != 0 && getHour() != 0;
    }
}
