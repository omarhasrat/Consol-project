package util;

import model.Database;
import model.Student;
import model.Teacher;
import model.TeacherStudent;

import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TeacherStudentUtil {
    public static TeacherStudent createTeacherStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Muellimin id-si : ");
        long teacherId = scanner.nextInt();
        Teacher teacher = Database.teachers[(int) teacherId];
        System.out.print("Telebenin id-si : ");
        long studentId = scanner.nextInt();
        Student student = Database.students[(int) studentId];
        System.out.print("Dersin adi : ");
        String subject = scanner.next();
        System.out.print("Otaq nomresi : ");
        String classNumber = scanner.next();
        long id = Database.teacherStudentIndex;

        return new TeacherStudent(id, teacher, student, subject, classNumber);
    }

    public static void addTeacherStudent() {
        TeacherStudent teacherStudent = createTeacherStudent();
        Database.teacherStudents[Database.teacherStudentIndex++] = teacherStudent;
        System.out.println("***** Ugurla elave edildi *****");
    }

    public static void printStudentsToughtByTeacher() {
        int s = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Muellimin id-si : ");
        long teacherId = scanner.nextLong();
        System.out.println("Muellim : "+Database.teachers[(int) teacherId]);
        for (TeacherStudent teacherStudent : Database.teacherStudents) {
            if (teacherStudent != null && teacherId == teacherStudent.getTeacher().getId()) {
                System.out.println(s + ". " + "Telebe : " + teacherStudent.getStudent());
                System.out.println("Dersin adi : "+teacherStudent.getSubject());
                System.out.println("otaq nomresi : "+teacherStudent.getClassNumber());
                s++;
            }
        }
    }

    public static void printTeachersTeachingStudent() {
        int s = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Telebenin id-si : ");
        long studentId = scanner.nextLong();
        System.out.println("Telebe : "+Database.students[(int) studentId]);
        for (TeacherStudent teacherStudent : Database.teacherStudents) {
            if (teacherStudent != null && studentId == teacherStudent.getStudent().getId()) {
                System.out.println(s + ". " + "Muellim : " + teacherStudent.getTeacher());
                System.out.println("Dersin adi : "+teacherStudent.getSubject());
                System.out.println("otaq nomresi : "+teacherStudent.getClassNumber());
                s++;
            }
        }
    }
}