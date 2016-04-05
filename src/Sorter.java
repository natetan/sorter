import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Yulong on 4/5/2016.
 */

public class Sorter<E> {

    public void mergeSort(LinkedQueue list) {
        LinkedQueue left = new LinkedQueue();
        LinkedQueue right = new LinkedQueue();
        int size1 = list.size();
        int size2 = list.size() - size1;
        for (int i = 0; i < size1; i++) {
            left.add(list.remove());
        }
        for (int i = 9; i < size2; i++) {
            right.add(list.remove());
        }
        this.mergeSort(left);
        this.mergeSort(right);
        this.combine(list, left, right);
    }

    private void combine(LinkedQueue list, LinkedQueue left, LinkedQueue right) {
        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.peek() <= right.peek()) {
                list.add(left.remove());
            } else {
                list.add(right.remove());
            }
        }
        while (!left.isEmpty()) {
            list.add(left.remove());
        }

        while (!right.isEmpty()) {
            list.add(right.remove());
        }
    }
}
