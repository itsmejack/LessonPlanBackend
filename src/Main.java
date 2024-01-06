import Model.*;
import UseCases.PlanLessonsUC;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(getFullWeek(), "Student 1");
        Student student2 = new Student(getFullWeek(), "Student 2");
        Student student3 = new Student(getFullWeek(), "Student 3");

        Teacher teacher1 = new Teacher(getFullWeek(), "Teacher 1");
        Teacher teacher2 = new Teacher(getFullWeek(), "Teacher 2");
        Teacher teacher3 = new Teacher(getFullWeek(), "Teacher 3");

        List<Lesson> lessons = new ArrayList<>();

        lessons.addAll(getManyLessons(new Lesson(teacher1, student1, "MAT"), 9));
        lessons.addAll(getManyLessons(new Lesson(teacher1, student2, "MAT"), 9));
        lessons.addAll(getManyLessons(new Lesson(teacher1, student3, "MAT"), 9));

        lessons.addAll(getManyLessons(new Lesson(teacher2, student1, "ENG"), 9));
        lessons.addAll(getManyLessons(new Lesson(teacher2, student2, "ENG"), 9));
        lessons.addAll(getManyLessons(new Lesson(teacher2, student3, "ENG"), 9));

        lessons.addAll(getManyLessons(new Lesson(teacher3, student1, "CHE"), 9));
        lessons.addAll(getManyLessons(new Lesson(teacher3, student2, "CHE"), 9));
        lessons.addAll(getManyLessons(new Lesson(teacher3, student3, "CHE"), 9));


        teacher1.printTimetable();
        teacher2.printTimetable();
        teacher3.printTimetable();
        student1.printTimetable();
        student2.printTimetable();
        student3.printTimetable();

        System.out.println();
        PlanLessonsUC.buildPlan(lessons);

        teacher1.printTimetable();
        teacher2.printTimetable();
        teacher3.printTimetable();
        student1.printTimetable();
        student2.printTimetable();
        student3.printTimetable();

    }

    private static List<Lesson> getManyLessons(Lesson lesson, int number) {
        List<Lesson> result = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            result.add(new Lesson(lesson));
        }
        return result;
    }

    private static Set<Interval> getFullWeek() {
        Set<Interval> result = new HashSet<>();
        for(Day day : Day.getAllDays()) {
            for(NumberOfLesson hour : NumberOfLesson.getLessonNumbers()) {
                result.add(new Interval(day, hour));
            }
        }
        return result;
    }

    private static Set<Interval> getOnlyHour(NumberOfLesson hour) {
        Set<Interval> result = new HashSet<>();
        for(Day day : Day.getAllDays()) {
            result.add(new Interval(day, hour));
        }
        return result;
    }

    private static Set<Interval> getOnlyDay(Day day) {
        Set<Interval> result = new HashSet<>();
        for(NumberOfLesson hour : NumberOfLesson.getLessonNumbers()) {
            result.add(new Interval(day, hour));
        }
        return result;
    }
}