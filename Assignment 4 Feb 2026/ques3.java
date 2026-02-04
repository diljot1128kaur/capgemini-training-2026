import java.util.*;
abstract class CourseType {
    abstract void evaluationType();
}
class ExamCourse extends CourseType {
    void evaluationType() {
        System.out.println("Exam Based Course");
    }
}
class AssignmentCourse extends CourseType {
    void evaluationType() {
        System.out.println("Assignment Based Course");
    }
}
class ResearchCourse extends CourseType {
    void evaluationType() {
        System.out.println("Research Based Course");
    }
}
class Course<T extends CourseType> {
    List<T> courseList = new ArrayList<>();

    void addCourse(T course) {
        courseList.add(course);
    }

    List<T> getCourses() {
        return courseList;
    }
}
class CourseUtil {
    static void showCourses(List<? extends CourseType> list) {
        for (CourseType c : list) {
            c.evaluationType();
        }
    }
}


public class ques3{
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse());

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse());

        CourseUtil.showCourses(examCourses.getCourses());
        CourseUtil.showCourses(researchCourses.getCourses());
    }
}
