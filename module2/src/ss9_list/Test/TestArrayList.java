package ss9_list.Test;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // Interger là Wraper class
        list.add(1);
        list.add(122);
        System.out.println(list.get(0));
    }
}
