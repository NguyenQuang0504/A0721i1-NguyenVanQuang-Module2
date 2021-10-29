package case_study.models;

public abstract class Facility {
    private String nameService;
    private double Area;
    private double Price;
    private int maxPeople;
    private String styleRent;
    public Facility(){

    }
    public Facility(String nameService, double area, double price, int maxPeople, String styleRent) {
        this.nameService = nameService;
        Area = area;
        Price = price;
        this.maxPeople = maxPeople;
        this.styleRent = styleRent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getStyleRent() {
        return styleRent;
    }

    public void setStyleRent(String styleRent) {
        this.styleRent = styleRent;
    }

    @Override
    public String toString() {
        return
                "nameService='" + nameService + '\'' +
                ", Area=" + Area +
                ", Price=" + Price +
                ", maxPeople=" + maxPeople +
                ", styleRent='" + styleRent + '\''
                ;
    }
}
