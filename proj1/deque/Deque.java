package deque;

import java.util.Iterator;

public interface Deque<T> {


    /**
     * Add an item in the front of the list.
     */

    void addFirst(T item);

    /**
     * Add an item in the end of the list.
     */
    void addLast(T item);

//    /**RetuRn True if deque is empty.*/
//    public boolean isEmpty() ;

    /**
     * Return the length of deque
     */
    int size();

    /**
     * Prints the items in the deque from front to end.
     */
    void printDeque();

    /**
     * Removes and return the item at the front of the deque.
     */
    T removeFirst();

    /**
     * Removes and return the item at the end of the deque.
     */
    T removeLast();

    /**
     * Gets the item at the given index.
     */
    T get(int index);

    Iterator<T> iterator();


    /**
     * Return weather or not object o is equal to this deque.
     */
    boolean equals(Object o);

    default boolean isEmpty() {
        return size() == 0;
    }
}
