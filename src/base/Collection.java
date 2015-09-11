package base;

/**
 * Created by DongHyun on 2015-09-09.
 */
public abstract class Collection<T> {

    protected int size;
    public int size() { return size; }

    public abstract Node<T> get(int index);
}
