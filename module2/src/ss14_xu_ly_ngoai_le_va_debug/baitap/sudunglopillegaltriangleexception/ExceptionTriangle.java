package ss14_xu_ly_ngoai_le_va_debug.baitap.sudunglopillegaltriangleexception;

public class ExceptionTriangle extends RuntimeException { //extends Exception neu viet Checked Exception
    public ExceptionTriangle() {
    }

    public ExceptionTriangle(String message) {
        super(message);
    }
}
