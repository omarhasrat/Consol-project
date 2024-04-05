import util.StudentUtil;
import util.TeacherStudentUtil;
import util.TeacherUtil;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            Menu.printMenu();
            System.out.print("Secim edin : ");
            int option = scanner.nextInt();
            switch (option){
                case 1 : TeacherUtil.addTeacher();break;
                case 2 : StudentUtil.addStudent();break;
                case 3 : TeacherStudentUtil.addTeacherStudent();break;
                case 4 : TeacherUtil.printTeachers();break;
                case 5 : StudentUtil.printStudents();break;
                case 6 : TeacherStudentUtil.printTeachersTeachingStudent();break;
                case 7 : TeacherStudentUtil.printStudentsToughtByTeacher();break;
                case 8 : System.exit(0);break;
                default: System.out.println("!!! Invalid operation !!!");
            }
        }
    }
}