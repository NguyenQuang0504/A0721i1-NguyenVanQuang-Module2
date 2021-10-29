package case_study.models;

public abstract class Person {
    private int id;
    private String name;
    private int date;
    private String gender;
    private int cmnd;
    private int phone;
    private String email;
    public Person(){

    }

    public Person(int id, String name, int date, String gender, int cmnd, int phone, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", gender='" + gender + '\'' +
                ", cmnd=" + cmnd +
                ", phone=" + phone +
                ", email='" + email + '\''
                ;
    }
}
