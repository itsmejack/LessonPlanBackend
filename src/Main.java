import Model.Interval;
import Model.Lesson;
import Model.Student;
import Model.Teacher;
import UseCases.PlanLessonsUC;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Interval freeIntervalTeacher = new Interval(1,1);
        Interval freeIntervalStudent = new Interval(2, 1);
        Interval freeIntervalCommon = new Interval(2, 2);

        Teacher teacher = new Teacher(new HashSet<>(Arrays.asList(freeIntervalTeacher, freeIntervalCommon)));
        Student student = new Student(new HashSet<>(Arrays.asList(freeIntervalStudent, freeIntervalCommon)));

        Lesson lesson = new Lesson(teacher,student);

        System.out.println("Before:");
        System.out.println("==========");
        teacher.printInformation();
        student.printInformation();

        System.out.println();
        PlanLessonsUC.buildPlan(Arrays.asList(lesson));

        System.out.println("After:");
        System.out.println("==========");
        teacher.printInformation();
        student.printInformation();


    }
}