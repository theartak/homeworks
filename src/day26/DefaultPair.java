package day26;

public class DefaultPair<K, V> implements Pair {
    K key;
    V value;

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public DefaultPair() {
    }

    public DefaultPair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
