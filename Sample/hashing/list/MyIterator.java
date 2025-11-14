package Sample.hashing.list;

public interface MyIterator<E> {
    public boolean hasNext();
    public boolean hasPrevious();
    public E next();
    public E previous();
    public void insert(E element);
    public E remove();
}
