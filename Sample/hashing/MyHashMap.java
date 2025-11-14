package Sample.hashing;

public interface MyHashMap<K, V> {
    public void put(K key, V value);
    public V get(K key);
    public V remove(K key);
    public int size();
    public int capacity();
}
