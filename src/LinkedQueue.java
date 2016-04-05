import java.util.NoSuchElementException;

/**
 * Created by Yulong on 4/5/2016.
 */
public class LinkedQueue {
    private QueueNode front;
    private int size;

    public LinkedQueue() {
        this.front = null;
        this.size = 0;
    }

    public void add(int data) {
        this.size++;
        if (this.front == null) {
            this.front = new QueueNode(data);
        } else {
            QueueNode current = this.front;
            while (current != null) {
                current = current.next;
            }
            current.next = new QueueNode(data);
        }
    }

    public int remove() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        this.size--;
        int data = this.front.data;
        this.front = this.front.next;
        return data;
    }

    public int peek() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.front.data;
    }

    public int size() {
        return this.size();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }
}
