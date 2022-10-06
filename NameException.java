

public class NameException extends Exception {
    
    public NameException(String message) {
        super(message);
    }

    public NameException() {

    }

    public void nameError() {
        System.out.println("There is no dessert with the given!");
    }
}