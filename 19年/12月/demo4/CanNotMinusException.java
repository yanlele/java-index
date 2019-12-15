package demo4;

public class CanNotMinusException extends Exception{
    private String id;

    public CanNotMinusException(String id) {
        this.id = id;
    }
}
