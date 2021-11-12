package ss16_binary_file_serialization.baitap.quanlysanphamluurafilenhiphan;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private int costProduct;
    public Product(){

    }

    public Product(int idProduct, String nameProduct, int costProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.costProduct = costProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getCostProduct() {
        return costProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setCostProduct(int costProduct) {
        this.costProduct = costProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", costProduct=" + costProduct +
                '}';
    }
}
