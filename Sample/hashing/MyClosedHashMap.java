package Sample.hashing;

public class MyClosedHashMap<K, V> implements MyHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private static final double MAX_LOAD_FACTOR = 0.5;

    private keyValuePair<K, V>[] table;
    public MyClosedHashMap() {
        table = (keyValuePair<K, V>[]) new keyValuePair<?, ?>[INITIAL_CAPACITY];
    }

    private static class keyValuePair<K, V> {
        K key;
        V value;

        keyValuePair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
