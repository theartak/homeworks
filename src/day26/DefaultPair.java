package day26;

public class DefaultPair<K, V> implements Pair {
    private K key;
    private V value;

    public DefaultPair() {
    }

    public DefaultPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
