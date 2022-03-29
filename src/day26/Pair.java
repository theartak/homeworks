package day26;

public interface Pair<K, V> {
    <K> K getKey();
    <V> V getValue();
}
