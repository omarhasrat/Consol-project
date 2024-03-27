public class Student {
    private long id;
    private String name;
    private String surname;
    private String birthdate;
    private String email;

    public Student(long id, String name, String surname, String birthdate, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.email = email;
    }
    public Student(){
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getEmail() {
        return email;
    }
}
