package ss9_list.baitap.trienkhaicacphuongthuccuaarraylist;

import java.util.Arrays;
import java.util.Objects;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] element;

    //Phuong thuc khoi tao khong tham so cai dat mang mac dinh 10 pt
    public MyList() {
        element = (E[]) new Object[DEFAULT_CAPACITY];
    }

    // Phuong thuc khoi tao 1 tham so capacity khoi tao mot object co so luong phan tu la capacity
    public MyList(int capacity) {
        element = (E[]) new Object[capacity];
    }

    // Phuong thuc size tra ve size la so phan tu hien co cua object
    public int size() {
        return size;
    }

    // Phuong thuc xoa het cac phan tu cua object va set size  = 0
    public void clear() {
        for (int i = 0; i < element.length; i++) {
            element[i] = null;
        }
        size = 0;
    }

    // Phuong thuc them 1 phan tu vao cuoi mang
    public void add(E elements) {
//        if (size == element.length) {
//            ensureCapacity(5);
//        }
        element[size] = elements;
        size++;
    }

    // Phuong thuc tang kich thuoc mang len
    public void ensureCapacity(int minCapacity) {
        int newSize = element.length + minCapacity;
        element = Arrays.copyOf(element, newSize);
    }

    // Phuong thuc them phan tu vao mang o vi tri xac dinh
    public void add(int index, E o) {
        if (index > size) {
            throw new IllegalArgumentException("index: " + index);
        } else if (element.length == size) {
            ensureCapacity(5);
        }
        if (element[index] == null) {
            element[index] = o;
        } else {
            for (int i = size + 1; i > index; i--) {
                element[i] = element[i - 1];
            }
            element[index] = o;
            size++;
        }
    }

    // Phuong thuc lay ra phan tu o vi tri i
    public E get(int i) {
        if (i >= size) {
            return (E) element[size];
        } else if (i < 0) {
            return (E) element[0];
        } else {
            return (E) element[i];
        }
    }

    // Phuong thuc kiem tra element co nam trong mang hay khong
    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (element[i].equals(o)) {
                return i;
            }
        }
        return index;
    }

    // Phuong thuc kiem tra xem doi tuong co thuoc mang khong
    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (element[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    // Phuong thuc xoa 1 phan tu cua mang tai mot vi tri xac dinh
    public E remove(int index) {
        if (index < 0 || index > element.length) {
            throw new IllegalArgumentException("Sai");
        }
        E element1 = element[index];
        for (int i = index; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        element[size - 1] = null;
        return element1;
    }
}
