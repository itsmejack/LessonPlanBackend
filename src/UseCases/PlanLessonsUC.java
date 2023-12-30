package UseCases;

import Model.Interval;
import Model.Lesson;
import Model.Student;
import Model.Teacher;

import java.util.List;

public class PlanLessonsUC {
    public static void buildPlan(List<Lesson> todoLessons) {
        for(Lesson lesson : todoLessons) {
            Teacher teacher = lesson.getTeacher();
            Student student = lesson.getStudent();
            for(Interval teachersInterval : teacher.getFreeIntervals()) {
                for (Interval studentsInterval : student.getFreeIntervals()) {
                    if(teachersInterval.equals(studentsInterval)) {
                        lesson.setLesson(teachersInterval);
                        break;
                    }
                }
                if(lesson.isLessonSet()) {
                    break;
                }
            }
            if(lesson.isLessonSet()) {
                break;
            }
        }
    }




}
