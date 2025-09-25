package Sample.structures.objects.COMP132;

/**
 * A Linked-List based implementation of the Stack ADT.
 * 
 * @author William Goble
 * @author Dickinson College
 * @version Feb 8, 2024
 */
public class MyLinkedStack implements MyStack{
    private MyList elements;

    /**
	 * Create a new Linked-list based stack.
	 */
    public MyLinkedStack() {
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
    public Object pop() {
        if(elements.size() > 0) {
            return elements.remove(0);
        } else {
            return null;
        }
    }

    /**
	 * {@inheritDoc}
	 */
    public void push(Object obj) {
        elements.insert(0, obj);
    }

    /**
	 * {@inheritDoc}
	 */
    public int size() {
        return elements.size();
    }
}
