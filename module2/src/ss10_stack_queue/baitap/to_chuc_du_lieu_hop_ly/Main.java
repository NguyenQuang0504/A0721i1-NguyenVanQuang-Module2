package ss10_stack_queue.baitap.to_chuc_du_lieu_hop_ly;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> listPerson = new TreeSet<>();
        listPerson.add(new Person("Nam", "Quang", 20, "Hue"));
        listPerson.add(new Person("Nu", "Thuy", 21, "Hue"));
        listPerson.add(new Person("Nam", "Thanh", 19, "Hue"));
        listPerson.add(new Person("Nu", "Ngoc Anh", 17, "Gia Lai"));
        listPerson.add(new Person("Nam", "Hieu", 28, "Da Nang"));
        listPerson.add(new Person("Nu", "Uyen Nhi", 22,"Hue"));
        Queue<Person> Nu = new ArrayDeque<>();
        Queue<Person> Nam = new ArrayDeque<>();
        int size = listPerson.size();
        Person element;
        for (int i = 0; i < size;i++){
           element = listPerson.first();
           if(element.getGender() == "Nu"){
               Nu.add(element);
           }
           else {
               Nam.add(element);
           }
           listPerson.remove(listPerson.first());
        }
        int sizeNu = Nu.size();
        int sizeNam = Nam.size();
        for(int i = 0;i<sizeNu;i++){
            System.out.println(Nu.poll());
        }
        for(int i = 0;i<sizeNam;i++){
            System.out.println(Nam.poll());
        }
    }
}
