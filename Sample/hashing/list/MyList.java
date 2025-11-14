package Sample.hashing.list;

public interface MyList<E> {
    public int size();
    public void add(E element);
    public E get(int index) throws IndexOutOfBoundsException;
    public void set(int index, E element) throws IndexOutOfBoundsException;
    public void insert(int index, E element) throws IndexOutOfBoundsException;
    public E remove(int index) throws IndexOutOfBoundsException;
}
