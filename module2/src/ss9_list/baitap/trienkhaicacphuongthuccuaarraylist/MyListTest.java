package ss9_list.baitap.trienkhaicacphuongthuccuaarraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(1);
        listInteger.add(6);
        System.out.println("Hien thi");
        for (int i=0;i<listInteger.size();i++){
            System.out.println(listInteger.get(i));
        }
        System.out.println("------------------------------------------------");
        System.out.println("Hien thi sau khi xoa");
        listInteger.remove(1);
        for (int i=0;i<listInteger.size();i++){
            System.out.println(listInteger.get(i));
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Lay ra phan tu thu 2");
        System.out.println(listInteger.get(2));
    }
}
