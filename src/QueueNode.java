/**
 *  Yulong Tan
 *  4.06.16
 *
 *  Node class for LinkedQueue
 */

public class QueueNode<E> implements Comparable<QueueNode> {
    public E data;
    public QueueNode next;

    public QueueNode(E data) {
        this(data, null);
    }

    public QueueNode(E data, QueueNode next) {
        this.data = data;
        this.next = next;
    }

    public int compareTo(QueueNode other) {
        if (this.data instanceof String) {
            return ((String) this.data).compareTo((String)other.data);
        } else if (this.data instanceof Integer) {
            return (Integer) this.data - (Integer) other.data;
        } else { // Doubles
            return (int) Math.signum((Double) this.data - (Double) other.data);
        }
    }
}
