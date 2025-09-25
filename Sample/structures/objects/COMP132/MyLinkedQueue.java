package Sample.structures.objects.COMP132;

/**
 * A Linked-List based implementation of the Queue ADT.
 * 
 * @author William Goble
 * @author Dickinson College
 * @version Feb 8, 2024
 */
public class MyLinkedQueue implements MyQueue {
    private MyList elements;

    /**
	 * Create a new Linked-list based stack.
	 */
    public MyLinkedQueue() {
        elements = new MySinglyLinkedList();
    }

    /**
	 * {@inheritDoc}
	 */
    public Object peek() {
        if(elements.size() > 0) {
            return elements.get(0);
        } else {
            return null;
        }
    }

    /**
	 * {@inheritDoc}
	 */
    public Object remove() {
        if (elements.size() > 0) {
            return elements.remove(0);
        } else {
            return null;
        }
    }

    /**
	 * {@inheritDoc}
	 */
    public void add(Object obj) {
        elements.add(obj);
    }

    /**
	 * {@inheritDoc}
	 */
    public int size() {
        return elements.size();
    }
}
