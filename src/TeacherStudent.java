import java.util.Scanner;

public class TeacherStudent {

    private long id;
    private Student student;
    private Teacher teacher;
    private String classNumber;
    private String subject;

    public TeacherStudent(long id,Student student,Teacher teacher,String classNumber,String subject){
        this.id=id;
        this.student=student;
        this.teacher=teacher;
        this.subject=subject;
        this.classNumber=classNumber;

    }
    public long getId(){
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getSubject() {
        return subject;
    }
}

