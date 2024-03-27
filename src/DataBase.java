import java.rmi.StubNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DataBase {
    private static Teacher[] teachers = new Teacher[20];
    private static Student[] students = new Student[20];
    private static TeacherStudent[] teacherStudents = new TeacherStudent[20];
    private static int teacherIndex = 1;

    public static int getTeacherIndex() {
        return teacherIndex;
    }



    public static int getStudentIndex() {
        return studentIndex;
    }

    private static int studentIndex =1;
    private static int teacherStudentIndex=1;

    public static void addTeacher(Teacher teacher){
        teachers[teacherIndex]=teacher;
        teacherIndex++;

        System.out.println("Yeni muellim elave olundu!");
        System.out.println();
    }
    public static void printTeachers(){
        for(Teacher teacher : teachers){
            if(teacher!=null){
                System.out.println("Muellimin id : "+teacher.getId());
                System.out.println("Muellimin adi : "+teacher.getName());
                System.out.println("Muellimin soyadi : "+teacher.getSurname());
                System.out.println("Muellimin dogum tarixi : "+teacher.getBirthdate());
                System.out.println("Muellimin emaili : "+teacher.getEmail());
                System.out.println("-----------------------------------------------------------");

            }
        }
    }

    public static void addStudent(Student student){
        students[studentIndex]=student;
        studentIndex++;

        System.out.println("Yeni telebe elave olundu!");
        System.out.println();
    }
    public static void printStudents(){
        for(Student student : students){
            if(student!=null){
                System.out.println("Telebenin id : "+student.getId());
                System.out.println("Telebenin adi : "+student.getName());
                System.out.println("Telebenin soyadi : "+student.getSurname());
                System.out.println("Telebenin dogum tarixi : "+student.getBirthdate());
                System.out.println("Telebenin emaili : "+student.getEmail());
                System.out.println("-----------------------------------------------------------");

            }
        }
    }
    public static TeacherStudent createTeacherStudent(){
        Scanner scanner = new Scanner(System.in);

        int indexTS =teacherStudentIndex;
        System.out.print("Muellimin id-sini daxil et : ");
        int indexT = scanner.nextInt();

        System.out.print("Telebe id-sini daxil et : ");
        int indexS = scanner.nextInt();
        System.out.print("Muellimin kecdiyi ders : ");
        String subject = scanner.next();
        System.out.print("Sinif nomresi : ");
        String classNUmber = scanner.next();
        TeacherStudent teacherStudent = new TeacherStudent(indexTS, students[indexS],teachers[indexT],classNUmber,subject);
        addTeacherStudent(teacherStudent);
        return teacherStudent;
    }
    public static void addTeacherStudent(TeacherStudent teacherStudent){
        teacherStudents[teacherStudentIndex] =teacherStudent;
        teacherStudentIndex++;

        System.out.println("Yeni muellim-telebe elaqesi elave olundu!");
    }
    public static void showTeacherLessonStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hal-hazirda datada olan sagordler : ");
        printStudents();
        System.out.print("Secdiyin sagirdin id-sini daxil et: ");
        int indexS = scanner.nextInt();
        for(TeacherStudent teacherStudent : teacherStudents){
            if(teacherStudent!=null){
                if(indexS==teacherStudent.getStudent().getId()){
                    System.out.println(teacherStudent.getTeacher().getName()+" "+teacherStudent.getTeacher().getSurname());
                    System.out.println("kecdiyi ders : "+teacherStudent.getSubject());
                    System.out.println("Sinif nomresi : "+ teacherStudent.getClassNumber());
                    System.out.println("-------------------");


                }
            }
        }
    }

    public static void showStudentStudyTeacher(){
        Scanner scanner = new Scanner(System.in);
        printTeachers();
        System.out.println("------------------");
        System.out.println("Muellim id-sini daxil et : ");
        int indexT = scanner.nextInt();
        for(TeacherStudent teacherStudent : teacherStudents){
            if(teacherStudent!=null){
                if(indexT==teacherStudent.getStudent().getId()){
                    System.out.println(teacherStudent.getStudent().getName()+" "+teacherStudent.getStudent().getSurname());
                    System.out.println("kecdiyi ders : "+teacherStudent.getSubject());
                    System.out.println("Sinif nomresi : "+ teacherStudent.getClassNumber());
                    System.out.println("-------------------");


                }
            }
        }


    }



}
