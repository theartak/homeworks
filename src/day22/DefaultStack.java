package day22;

public class DefaultStack implements Stack {
    private static final int MAX_SIZE = 5;
    private final int[] nums;
    private int index;

    public DefaultStack() {
        super();
        this.nums = new int[MAX_SIZE];
    }

    @Override
    public void push(int value) {
        if (this.index == MAX_SIZE) {
            throw new StackIndexOutOfBoundException(this.index, MAX_SIZE);
        }
        this.nums[this.index] = value;
        this.index++;
    }

    @Override
    public int pop() {
        if (index == 0) {
            throw new EmptyStackException("The stack is empty");
        }
        int value = nums[this.index - 1];
        this.nums[this.index - 1] = 0;
        this.index--;
        return value;
    }
}
