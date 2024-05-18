package collections.exceptions;

public class CheckedException extends RuntimeException{
    
    @SuppressWarnings("unused")
    private String warning;

    public CheckedException(String warning) {
        super();
        this.warning = warning;

    }

}
