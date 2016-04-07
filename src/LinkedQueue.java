import java.util.NoSuchElementException;

/**
 *  Yulong Tan
 *  4.06.16
 *
 *  LinkedList implementation of queue.
 */
public class LinkedQueue<E> {
    private QueueNode front;
    private int size;

    public LinkedQueue() {
        this.front = null;
        this.size = 0;
    }

    public void add(E data) {
        this.size++;
        if (this.front == null) {
            this.front = new QueueNode(data);
        } else {
            QueueNode current = this.front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new QueueNode(data);
        }
    }

    public E remove() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        this.size--;
        E data = (E)this.front.data;
        this.front = this.front.next;
        return data;
    }

    public E peek() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (E)this.front.data;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public String toString() {
        if (this.isEmpty()) {
            return "[]";
        } else {
            String result = "[" + this.front.data;
            QueueNode current = this.front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            return result + "]";
        }
    }
}
