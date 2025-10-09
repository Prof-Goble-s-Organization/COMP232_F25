package Sample.trees;

/**
 * Interface to be implemented by a binary tree.
 * 
 * @author William Goble
 * @author Dickinson College
 * @version Oct 9, 2025
 */

public interface COMP232BinaryTree<K, V> {
    public int size();
    public boolean contains(K key);
    public V get(K key);
    public void set(K key, V value);
    public void add(K key, V value);
    public V remove(K key);

    public void visitPreOrder(COMP232Visitor<K, V> visitor);
    public void visitPostOrder(COMP232Visitor<K, V> visitor);
    public void visitInOrder(COMP232Visitor<K, V> visitor);
    public void visitLevelOrder(COMP232Visitor<K, V> visitor);
}
