import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *  Yulong Tan
 *  4.06.16
 *
 *  This class attempts to implement various sorting algorithms.
 */

public class Sorter<E> {
    private boolean less;

    public Sorter() {
        this.less = false;
    }

    public void mergeSort(LinkedQueue<E> list) {
        if (list.size() > 1) {
            LinkedQueue<E> left = new LinkedQueue();
            LinkedQueue<E> right = new LinkedQueue();
            int size1 = list.size() / 2;
            int size2 = list.size() - size1;
            for (int i = 0; i < size1; i++) {
                left.add(list.remove());
            }
            for (int i = 0; i < size2; i++) {
                right.add(list.remove());
            }
            this.mergeSort(left);
            this.mergeSort(right);
            this.combine(list, left, right);
        }
    }

    // Redundant code used to make generic types
    private void combine(LinkedQueue<E> list, LinkedQueue<E> left,
                         LinkedQueue<E> right) {
        while (!left.isEmpty() && !right.isEmpty()) {
            E leftData = left.peek();
            E rightData = right.peek();
            this.less = false;
            if (this.isString(leftData) || this.isString(rightData)) {
                if (((String) leftData).compareTo((String) rightData) <= 0) {
                    list.add(left.remove());
                    this.less = true;
                }
            } else if (this.isInt(leftData) || this.isInt(rightData)) {
                if (((Integer) leftData).compareTo((Integer) rightData) <= 0) {
                    list.add(left.remove());
                    this.less = true;
                }
            } else {
                if (((Double) leftData).compareTo((Double) rightData) <= 0) {
                    list.add(left.remove());
                    this.less = true;
                }
            }
            if (!this.less) {
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

    private boolean isString(E data) {
        return data instanceof String;
    }

    private boolean isInt(E data) {
        return data instanceof Integer;
    }

    private boolean isDouble(E data) {
        return data instanceof Double;
    }
}
