package deque;

import java.util.Iterator;

public class LinkedListDeque<T> implements Deque<T> {
    int size;

    private class Node {
        Node prev;
        T item;
        Node next;

        private Node(Node p, T i, Node n) {
            prev = p;
            item = i;
            next = n;
        }
    }

    Node sentinel = new Node(null, null, null);

    /**
     * Create an empty list.
     */
    public LinkedListDeque() {
        size = 0;
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
    }

    /**
     * Add an item in the front of the list.
     */
    @Override
    public void addFirst(T item) {
        size += 1;
        Node p = new Node(sentinel, item, sentinel.next);
        sentinel.next.prev = p;
        sentinel.next = p;
    }

    /**
     * Add an item in the end of the list.
     */
    @Override
    public void addLast(T item) {
        size += 1;
        Node q = new Node(sentinel.prev, item, sentinel);
        sentinel.prev.next = q;
        sentinel.prev = q;
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
        if (!isEmpty()) {
            Node p = sentinel.next;
            while (p != sentinel) {
                System.out.print(p.item + " ");
                p = p.next;
            }
            System.out.println();
        }
    }

    /**
     * Removes and return the item at the front of the deque.
     */
    @Override
    public T removeFirst() {
        T temp = null;
        if (!isEmpty()) {
            size -= 1;
            temp = sentinel.next.item;
            sentinel.next.next.prev = sentinel;
            sentinel.next = sentinel.next.next;

        }
        return temp;
    }

    /**
     * Removes and return the item at the end of the deque.
     */
    @Override
    public T removeLast() {
        T temp = null;
        if (!isEmpty()) {
            size -= 1;
            temp = sentinel.prev.item;
            sentinel.prev.prev.next = sentinel;
            sentinel.prev = sentinel.prev.prev;

        }
        return temp;
    }

    /**
     * Gets the item at the given index.
     */
    @Override
    public T get(int index) {
        Node p = sentinel.next;
        index = index % size;
        T temp = null;
        while (p != sentinel && index > 0) {
            temp = p.item;
            p = p.next;
            index -= 1;
        }
        return temp;
    }

    public T getRecursive(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }
        return getRecursiveHelper(index, sentinel.next);

    }

    private T getRecursiveHelper(int index, Node current) {
        if (index == 0) {
            return current.item;
        }
        return getRecursiveHelper(index - 1, current.next);
    }

    /**
     * Return an iterator.
     */

    public Iterator<T> iterator() {
        return new LinkedListDequeIterator();

    }

    private class LinkedListDequeIterator implements Iterator<T> {
        //private int index;
        private Node p;

        LinkedListDequeIterator() {
            p = sentinel.next;
        }

        public boolean hasNext() {
            return p == sentinel;
        }

        public T next() {
            T item = p.item;
            p = p.next;
            return item;
        }
    }

    /**
     * Return weather or not object o is equal to this deque.
     */
    @Override
    public boolean equals(Object o) {
        return o instanceof deque.LinkedListDeque;
    }

}
