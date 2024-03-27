public class Teacher {
    private long id;
    private String name;
    private String surname;
    private String birthdate;
    private String email;

    public Teacher(long id,String name,String surname,String birthdate,String email){
        this.name = name;
        this.id = id;
        this.surname = surname;
        this.birthdate =birthdate ;
        this.email =email ;
    }
    public Teacher(){
    }
    public long getId(){
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
