/**
 *  Yulong Tan
 *  4.06.16
 *
 *  Node class for LinkedQueue
 */

public class QueueNode {
    public int data;
    public QueueNode next;

    public QueueNode(int data) {
        this(data, null);
    }

    public QueueNode(int data, QueueNode next) {
        this.data = data;
        this.next = next;
    }
}
