package deque;

import java.util.Iterator;

public class ArrayDeque<T> implements Iterable<T>, Deque<T> {
    private int size;
    private int length;
    private T[] items = (T[]) new Object[8];
    private int nextFirst = 3;
    private int nextLast = 4;

    /**
     * Create an empty list.
     */
    public ArrayDeque() {
        //T[] items = (T[]) new Object[8];
        length = 8;
        size = 0;
    }


    /**
     * Return true if the list is full.
     */
    private boolean isFull() {
        if (size == items.length) {
            //if (nextFirst==nextLast) {
            return true;
        }
        return false;
    }

    private int getIndex(int i) {
        return (length + i) % length;
    }

    /**
     * Resize the list.
     */
    private void resize(int capacity) {
        T[] a = (T[]) new Object[capacity];
        System.arraycopy(items, nextFirst + 1, a, (capacity - size) / 2, size);
        length = capacity;
        items = a;
        nextFirst = Math.abs(capacity - size) / 2 - 1;
        nextLast = nextFirst + size + 1;

    }

    /**
     * Add an item in the front of the list.
     */
    @Override
    public void addFirst(T item) {
        if (nextFirst < 0) {
            resize(length * 2);

        }
        size += 1;
        items[nextFirst] = item;
        nextFirst = nextFirst - 1;


    }

    /**
     * Add an item in the end of the list.
     */
    @Override
    public void addLast(T item) {
        if (nextLast == items.length) {
            resize(length * 2);

        }
        size += 1;
        items[nextLast] = item;
        nextLast = nextLast + 1;

    }

    /**
     * Return the length of deque
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Prints the items in the deque from front to end.
     */
    @Override
    public void printDeque() {
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    /**
     * Removes and return the item at the front of the deque.
     */
    @Override
    public T removeFirst() {
        int i = nextFirst + 1;
        T result = items[i];
        if (result != null) {
            nextFirst = i;
            items[i] = null;
            size -= 1;
        }
        if (size < length * 0.25 && length > 16) {
            resize(length / 2);
        }
        return result;
    }

    /**
     * Removes and return the item at the end of the deque.
     */
    @Override
    public T removeLast() {
        int i = nextLast - 1;
        T result = items[i];
        if (result != null) {
            nextLast = i;
            items[i] = null;
            size -= 1;
        }
        if (size < length * 0.25 && length > 16) {
            resize(length / 2);
        }
        return result;

    }

    /**
     * Gets the item at the given index.
     */
    @Override
    public T get(int index) {
        if (index < 0 || index > length - 1) {
            return null;
        }
        int i = nextFirst + 1 + index;
        return items[i];

    }

    @Override
    public Iterator<T> iterator() {

        return new ArrayDequeIterator();

    }

    private class ArrayDequeIterator implements Iterator<T> {
        private int index;

        ArrayDequeIterator() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            T item = get(index);
            index += 1;
            return item;
        }

    }


    /**
     * Return weather or not object o is equal to this deque.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof Deque)) {
            return false;
        }
        if (((Deque) o).size() != this.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!((Deque) o).get(i).equals(get(i))) {
                return false;
            }
        }
        return true;
    }
}



