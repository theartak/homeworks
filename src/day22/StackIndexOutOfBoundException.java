package day22;

public class StackIndexOutOfBoundException extends RuntimeException {
    public StackIndexOutOfBoundException(int index, int size) {
        super("Index " + index + " is out of bounds for stack size " + size);
    }
}
