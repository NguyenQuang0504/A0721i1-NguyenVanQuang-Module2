package ss9_list.thuchanh.trien_khai_lop_list_don_gian;

import java.util.Arrays;
import java.util.Objects;

public class MyList<E> {
    private int size = 0;
    // Luu so phan tu toi da trong danh sach
    private static final int DEFAULT_CAPACITY = 10;
    //Mang doi tuong element chua cac phan tu trong danh sach
    private Object element[];
    // Phuong thuc khoi tao khong tham so
    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }
    // Phuong thuc tang kich thuoc cua mang element len gap doi
    public void ensureCapa(){
        int newSize = element.length*2;
        element = Arrays.copyOf(element,newSize);
    }
    // Phuong thuc add them mot phan tu vao cuoi danh sach
    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }
    //Phuong thuc tra ve phan tu o vi tri thu i trong danh sach mang
    public E get(int i){
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element[i];
    }
}
