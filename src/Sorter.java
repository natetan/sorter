/**
 *  Yulong Tan
 *  4.06.16
 *
 *  This class attempts to implement various sorting algorithms.
 */

public class Sorter<E> {

    // Does the merge sort algorithm
    // Queue is sorted afterwards
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

    // Merges the left and right together
    private void combine(LinkedQueue<E> list, LinkedQueue<E> left,
                         LinkedQueue<E> right) {
        while (!left.isEmpty() && !right.isEmpty()) {
            if (((Comparable) left.peek()).compareTo(right.peek()) <= 0) {
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
