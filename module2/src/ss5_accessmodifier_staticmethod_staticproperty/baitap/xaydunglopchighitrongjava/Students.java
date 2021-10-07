package ss5_accessmodifier_staticmethod_staticproperty.baitap.xaydunglopchighitrongjava;

public class Students {
    private String name = "John";
    private String classes = "C02";
    public Students(){

    }
    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }
    public String display(){
        return "Sinh vien: " +this.name +" Lop: " +this.classes;
    }
}
