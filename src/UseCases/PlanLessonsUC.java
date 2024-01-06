package UseCases;

import Model.Interval;
import Model.Lesson;
import Model.Student;
import Model.Teacher;
import java.util.List;

public class PlanLessonsUC {
    public static void buildPlan(List<Lesson> todoLessons) {
        for(Lesson lesson : todoLessons) {
            Interval foundInterval = null;
            Teacher teacher = lesson.getTeacher();
            Student student = lesson.getStudent();
            for(Interval teachersInterval : teacher.getFreeIntervals()) {
                for (Interval studentsInterval : student.getFreeIntervals()) {
                    if(teachersInterval.equals(studentsInterval)) {
                        foundInterval = teachersInterval;
                        break;
                    }
                }
                if(foundInterval != null) {
                    break;
                }
            }
            if(foundInterval != null) {
                lesson.setLesson(foundInterval);
            } else {
                System.out.println("Lesson " + lesson.getName() + " with teacher " + lesson.getTeacher().getName() + " and Student " + lesson.getStudent().getName() + " cannot be placed");
            }
        }
    }




}
