package util;

import model.Database;
import model.Teacher;

import java.util.Scanner;

public class TeacherUtil {
    public static Teacher createTeacher(){
        Scanner scanner = new Scanner(System.in);
        long id = Database.teacherIndex;
        System.out.print("Muellimin adi : ");
        String name = scanner.next();
        System.out.print("Muellimin soyadi : ");
        String surname = scanner.next();
        System.out.print("Muellimin dogum tarixi : ");
        String birthDate = scanner.next();
        System.out.print("Muellimin emaili : ");
        String email = scanner.next();

        return new Teacher(id,name,surname,birthDate,email);

    }
    public static void addTeacher(){
        Teacher teacher = createTeacher();
        Database.teachers[Database.teacherIndex++] = teacher;
        System.out.println("***** Ugurla elave edildi *****");
        System.out.println();
    }
    public static void printTeachers(){
        for(Teacher teacher : Database.teachers){
            if(teacher!=null){
                System.out.println(teacher);
            }
        }
        System.out.println("_____________________________________________");
    }


}
