public class MovieException extends Exception {
    public MovieException (String message) {
        super(message);
    }

    public String notNumber() {
        return "Your input is not a number.";
    }
}