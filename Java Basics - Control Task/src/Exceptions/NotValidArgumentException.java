package Exceptions;

public class NotValidArgumentException extends Exception{
    private int number;

    public NotValidArgumentException(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
