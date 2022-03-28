package day23iterable;

public interface List extends Iterable<Integer> {
    int size();
    boolean isEmpty();
    int get(int index);
    void add(int val);
    void add(int index, int val);
    void delete(int index);
}
