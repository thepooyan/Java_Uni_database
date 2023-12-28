import dao.CourseDao;
import dao.StudentDao;
import dao.TeacherDao;
import dao.UniversityDao;
import domainModel.Course;
import domainModel.Student;
import domainModel.Teacher;
import domainModel.University;

public class MainClass {
    public static void main(String[] args) {
        University uni = new University();
        uni.setName("Olum tahghighat");
        uni.setLocation("Simon Blvd");

        Teacher teacher1 = new Teacher();
        teacher1.setTeacherName("Ali akbari");
        teacher1.setUniversity(uni);

        Teacher teacher2 = new Teacher();
        teacher2.setTeacherName("Pooyan ahmadi");
        teacher2.setUniversity(uni);

        Course course1 = new Course();
        course1.setCourseName("Math");

        Course course2 = new Course();
        course2.setCourseName("Physics");

        Course course3 = new Course();
        course3.setCourseName("Chemistry");

        teacher1.getCourses().add(course1);
        teacher1.getCourses().add(course2);
        teacher2.getCourses().add(course3);

        Student student1 = new Student();
        student1.setName("mamal");
        student1.setLastName("bahal");
        student1.setUniversity(uni);

        Student student2 = new Student();
        student2.setName("saeed");
        student2.setLastName("hamedi");
        student2.setUniversity(uni);

        StudentDao sd = new StudentDao();
        CourseDao cd = new CourseDao();
        TeacherDao td = new TeacherDao();
        UniversityDao ud = new UniversityDao();

        ud.save(uni);

        sd.save(student1);
        sd.save(student2);

        cd.save(course1);
        cd.save(course2);
        cd.save(course3);

        td.save(teacher1);
        td.save(teacher2);

    }
}
