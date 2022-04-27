package deque;

import java.util.Iterator;

public interface Deque<T> {


    /**Add an item in the front of the list.*/

    public void addFirst(T item) ;
    /**Add an item in the end of the list.*/
    public void addLast(T item) ;

//    /**RetuRn True if deque is empty.*/
//    public boolean isEmpty() ;
    /**Return the length of deque*/
    public int size() ;
    /**Prints the items in the deque from front to end.*/
    public void printDeque() ;
    /**Removes and return the item at the front of the deque.*/
    public T removeFirst() ;
    /**Removes and return the item at the end of the deque.*/
    public T removeLast() ;
    /**Gets the item at the given index.*/
    public T get(int index);
    public Iterator<T> iterator() ;



    /**Return weather or not object o is equal to this deque.*/
    public boolean equals(Object o) ;

    default public boolean isEmpty() {
        return size()==0;
    }
}
