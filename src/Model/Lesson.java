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


    public void setLesson(Interval interval) {
        setDay(interval.getDay());
        setHour(interval.getHour());
        teacher.getFreeIntervals().remove(interval);
        student.getFreeIntervals().remove(interval);
    }
    public boolean isLessonSet() {
        return getDay() != 0 && getHour() != 0;
    }
}
