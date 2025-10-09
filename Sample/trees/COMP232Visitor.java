package Sample.trees;

public interface COMP232Visitor<K, V> {
    /**
     * The visit method will be called at each node in the tree. 
     * The order in which the nodes are visitied is determined by the
     * method that is used.
     * 
     * @param key   The key stored at the node
     * @param value The value stored at the node
     */
    public void visit(K key, V value);
}
