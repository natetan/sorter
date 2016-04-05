/**
 * Created by Yulong on 4/5/2016.
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
