import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            printMenu();
            System.out.println();
            System.out.print("gosterilenlerden birini sec : ");
            int option = scanner.nextInt();
            switch (option){
                case 1 : addTeacher(scanner);break;
                case 2 : addStudent(scanner);break;
                case 3 :DataBase.createTeacherStudent();break;
                case 4 : DataBase.printTeachers();break;
                case 5 : DataBase.printStudents();break;
                case 6 :DataBase.showTeacherLessonStudent();break;
                case 7 :DataBase.showStudentStudyTeacher();break;
                case 8 : System.exit(0);break;
                default : System.err.println("Sehv secim!");

            }

        }
    }

    public static void printMenu(){
        String menu = "1) Yeni müəllim yaratmaq\n" +
                "2) Yeni şagird yaratmaq\n" +
                "3) Yeni teacher student əlaqəsi yaratmaq.\n" +
                "4) Mövcud müəllimləri görmək \n" +
                "5) Mövcud şagirdləri görmək\n" +
                "6) Bir şagirdə dərs keçən müəllimləri görmək\n" +
                "7) Bir müəllimin dərs dediyi şagirdləri görmək\n"+
                "8) Sistemden cixis et";
        System.out.println(menu);
    }

    public static Teacher createTeacher(Scanner scanner){
        long id =DataBase.getTeacherIndex() ;

        System.out.print("Muellimin adini qeyd et : ");
        String name = scanner.next();

        System.out.print("Muellimin soyadini qeyd et : ");
        String surname = scanner.next();

        System.out.print("Muellimin dogum tarixini qeyd et : ");
        String birthDate = scanner.next();

        System.out.print("Muellimin emailini qeyd et : ");
        String email = scanner.next();

        Teacher teacher = new Teacher(id,name,surname,birthDate,email);
        return teacher;


    }
    public static Student createStudent(Scanner scanner){

        long id = DataBase.getStudentIndex();

        System.out.print("Telebenin adini qeyd et : ");
        String name = scanner.next();

        System.out.print("Telebenin soyadini qeyd et : ");
        String surname = scanner.next();

        System.out.print("Telebenin dogum tarixini qeyd et : ");
        String birthDate = scanner.next();

        System.out.print("Telebenin emailini qeyd et : ");
        String email = scanner.next();

        Student student = new Student(id,name,surname,birthDate,email);
        return student;


    }
    public static void addTeacher(Scanner scanner){
        Teacher teacher = createTeacher(scanner);

        DataBase.addTeacher(teacher);

    }
    public static void addStudent(Scanner scanner){
        Student student = createStudent(scanner);

        DataBase.addStudent(student);

    }




}