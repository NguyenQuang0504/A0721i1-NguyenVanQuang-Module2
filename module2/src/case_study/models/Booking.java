package case_study.models;

import java.util.Comparator;

public class Booking implements Comparable<Booking> {
    private int idBooking;
    private int dateStart;
    private int dateEnd;
    private int idCustomer;
    private String nameService;
    private String opctionService;
    private int years;

    public Booking(int idBooking, int dateStart, int dateEnd, int years, int idCustomer, String nameService, String opctionService) {
        this.idBooking = idBooking;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.opctionService = opctionService;
        this.years = years;
    }
    public Booking(){

    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getDateStart() {
        return dateStart;
    }

    public void setDateStart(int dateStart) {
        this.dateStart = dateStart;
    }

    public int getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(int dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getOpctionService() {
        return opctionService;
    }

    public void setOpctionService(String opctionService) {
        this.opctionService = opctionService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", idCustomer=" + idCustomer +
                ", nameService='" + nameService + '\'' +
                ", opctionService='" + opctionService + '\'' +
                ", years=" + years +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        if(this.getDateStart()-o.getDateStart()!=0){
            return this.getDateStart()-o.getDateStart();
        }
        else {
            return this.getDateEnd() - o.getDateEnd();
        }
    }
}
