package UseCases;

import Model.Interval;
import Model.Lesson;

import java.util.List;

public class PlanLessonsUC {
    public void buildPlan(List<Lesson> todoLessons) {
        for(Lesson lesson : todoLessons) {
            for(Interval teachersInterval : lesson.getTeacher().getFreeIntervals()) {
                for (Interval studentsInterval : lesson.getStudent().getFreeIntervals()) {
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
