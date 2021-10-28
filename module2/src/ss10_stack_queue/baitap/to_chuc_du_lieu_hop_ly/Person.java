package ss10_stack_queue.baitap.to_chuc_du_lieu_hop_ly;

import java.util.Date;

public class Person implements Comparable<Person> {
    private String gender;
    private String name;
    private int age;
    private String address;
    public Person(){

    }
    public Person(String gender, String name, int age, String address) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age  = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
// Overiding phuong thuc compareTo de so sanh va sap xep theo tuoi tu thap den cao
    @Override
    public int compareTo(Person o) {
        return this.getAge()-(o.getAge());
    }
}
