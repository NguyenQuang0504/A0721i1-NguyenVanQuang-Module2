package thi_module_2.Service;

public class ExceptionCustom extends Exception {
    public ExceptionCustom(){

    }
    public ExceptionCustom(String message){
        System.out.println(message);
    }
}
