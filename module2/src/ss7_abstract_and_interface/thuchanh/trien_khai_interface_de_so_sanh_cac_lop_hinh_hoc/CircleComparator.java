package ss7_abstract_and_interface.thuchanh.trien_khai_interface_de_so_sanh_cac_lop_hinh_hoc;

import ss6_inheritance.thuchanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o1.getRadius()) return 1;
        else if (o1.getRadius() < o1.getRadius()) return -1;
        else return 0;
    }
}
