package model;

public class TeacherStudent {
    private long id;
    private Teacher teacher;
    private Student student;
    private String subject;
    private String classNumber;

    public TeacherStudent(long id, Teacher teacher, Student student, String subject, String classNumber) {
        this.id = id;
        this.teacher = teacher;
        this.student = student;
        this.subject = subject;
        this.classNumber = classNumber;
    }

    public long getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student getStudent() {
        return student;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassNumber() {
        return classNumber;
    }
}
