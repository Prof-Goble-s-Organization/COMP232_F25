package Sample.structures.generic;

/**
 * Implementation of a Queue ADT using an ArrayList as the backingstore.
 * 
 * @author William Goble
 * @author Dickinson College
 * @version Oct 1, 2025
 */

public class MyArrayQueue<E> implements MyQueue<E> {
    private MyArrayList<E> elements;

    /**
     * Create a new Array-based Queue.
     */
    public MyArrayQueue() {
        elements = new MyArrayList<>();
    }

    /**
     * {@inheritDoc}
     */
    public E peek() {
        if (elements.size() > 0) {
            return elements.get(0);
        } else {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    public E remove() {
        if (elements.size() > 0) {
            return elements.remove(0);
        } else {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    public void add(E obj) {
        elements.add(obj);
    }

    /**
     * {@inheritDoc}
     */
    public int size() {
        return elements.size();
    }
    
}
