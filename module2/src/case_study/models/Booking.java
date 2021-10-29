package case_study.models;

public class Booking {
    private int idBooking;
    private int dateStart;
    private int dateEnd;
    private int idCustomer;
    private String nameService;
    private String opctionService;

    public Booking(int idBooking, int dateStart, int dateEnd, int idCustomer, String nameService, String opctionService) {
        this.idBooking = idBooking;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.opctionService = opctionService;
    }
    public Booking(){

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
                '}';
    }
}
