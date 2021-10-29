package case_study.models;

public class Employee extends Person {
    private String levelEmployee;
    private String position;
    private int salary;
    public Employee(){

    }
    public Employee(int id, String name, int date, String gender, int cmnd, int phone, String email, String level, String position, int salary) {
        super(id, name, date, gender, cmnd, phone, email);
        this.levelEmployee = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevelEmployee() {
        return levelEmployee;
    }

    public void setLevelEmployee(String level) {
        this.levelEmployee = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                "level='" + levelEmployee + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
