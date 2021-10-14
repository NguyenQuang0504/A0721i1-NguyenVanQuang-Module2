package Template.model;

public class Teacher extends Person {
    private double salary;
    public Teacher(){

    }
    public Teacher(int id, String name, int age, String address, double salary){
        super(id, name, age, address);
        this.salary = salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
