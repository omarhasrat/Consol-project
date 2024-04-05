package util;

import model.Database;
import model.Student;
import model.Teacher;

import java.util.Scanner;

public class StudentUtil {
    public static Student createStudent(){
        Scanner scanner = new Scanner(System.in);
        long id = Database.studentIndex;
        System.out.print("Telebenin adi : ");
        String name = scanner.next();
        System.out.print("Telebenin soyadi : ");
        String surname = scanner.next();
        System.out.print("Telebenin dogum tarixi : ");
        String birthDate = scanner.next();
        System.out.print("Telebenin emaili : ");
        String email = scanner.next();

        return new Student(id,name,surname,birthDate,email);

    }
    public static void addStudent(){
        Student student= createStudent();
        Database.students[Database.studentIndex++] = student;
        System.out.println("***** Ugurla elave edildi *****");
        System.out.println();
    }
    public static void printStudents(){
        for(Student student : Database.students){
            if(student!=null){
                System.out.println(student);
            }
        }
        System.out.println("_____________________________________________");
    }
}
