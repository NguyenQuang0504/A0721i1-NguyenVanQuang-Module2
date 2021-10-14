package Template.model;

public class Student extends Person {
    private double scores;
    private String subject;
    public Student(){

    }
    public Student(int id, String name, int age, String address, double scores, String subject){
        super(id, name, age, address);
        this.scores = scores;
        this.subject = subject;
    }
    public void setScores(double scores){
        this.scores = scores;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public double getScores(){
        return this.scores;
    }
    public String getSubject(){
        return this.subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "scores=" + scores +
                ", subject='" + subject + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
