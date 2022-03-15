package codetest.task9;

public interface Animal {
    default boolean eat() {
        return true;
    }
    boolean bark();
    boolean run();
    boolean fly();
}
