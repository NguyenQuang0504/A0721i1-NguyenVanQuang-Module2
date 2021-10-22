package ss9_list.baitap.trienkhaicacphuongthuccuaarraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        System.out.println("Hien thi");
        for (int i=0;i<listInteger.size();i++){
            System.out.println(listInteger.get(i));
        }
    }
}
