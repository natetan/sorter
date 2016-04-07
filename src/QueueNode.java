/**
 *  Yulong Tan
 *  4.06.16
 *
 *  Node class for LinkedQueue
 */

public class QueueNode<E> {
    public E data;
    public QueueNode next;

    public QueueNode(E data) {
        this(data, null);
    }

    public QueueNode(E data, QueueNode next) {
        this.data = data;
        this.next = next;
    }
}
