package base;

/**
 * Created by DongHyun on 2015-09-09.
 */
public class Node<T> {

    public Node next;
    public T t;

    public Node() {}
    public Node(T t) { this.t = t; }
}
