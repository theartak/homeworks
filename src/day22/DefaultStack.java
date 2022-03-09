package day22;

public class DefaultStack implements Stack {
    private final int MAX_SIZE = 5;
    private int[] nums = new int[MAX_SIZE];
    private int index = 0;

    @Override
    public void push(int value) {
        if (index >= MAX_SIZE) {
            throw new StackIndexOutOfBoundException(index + " is out of bounds");
        }
        this.index++;
        this.nums[index - 1] = value;
    }

    @Override
    public int pop() {
        if (index == 0) {
            throw new EmptyStackException("The stack is empty");
        } else index--;
        return nums[index];
    }
}
