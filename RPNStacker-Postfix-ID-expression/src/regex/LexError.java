package regex;

public class LexError extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public LexError(String msg) {
        super(msg);
    }
}