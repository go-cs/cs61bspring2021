package deque;

import java.util.Iterator;

public class ArrayDeque<Item> {
    private int size;
    public int length;
    private Item[] items = (Item[]) new Object[8];
    private int nextFirst = 4;
    private int nextLast = 5;
    /**Create an empty list.*/
    public ArrayDeque() {
        //Item[] items = (Item[]) new Object[8];
        length = 8;
        size=0;
    }
    /**Return true if the list is full.*/
    private boolean isFull() {
        if (size== items.length) {
        //if (nextFirst==nextLast) {
            return true;
        }
        return false;
    }
    private int getIndex(int i) {
        return (length+i)%length;
    }

    /**Resize the list.*/
    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        for (int i = 0;i<size;i++) {
            a[i] = items[i];
        }
        length = capacity;
        items = a;
        nextFirst= getIndex(-1);
        nextLast=size;

    }
    /**Add an item in the front of the list.*/
    public void addFirst(Item item) {
        if (isFull()) {
            resize(length*2);
        }
        size+=1;
        items[nextFirst] = item;
        nextFirst=getIndex(nextFirst-1);

    }
    /**Add an item in the end of the list.*/
    public void addLast(Item item) {
        if (isFull()) {
            resize(length*2);
        }
        size+=1;
        items[nextLast] = item;
        nextLast=getIndex(nextLast+1);
    }

    /**Retuen True if deque is empty.*/
    public boolean isEmpty() {
        return size==0;

    }
    /**Return the length of deque*/
    public int size() {
        return size;
    }
    /**Prints the items in the deque from front to end.*/
    public void printDeque() {
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i]+" ");
        }
        System.out.println();
    }
    /**Removes and return the item at the front of the deque.*/
    public Item removeFirst() {
        int i = getIndex(nextFirst+1);
        Item result = items[i];
        if (result!=null) {
            nextFirst=i;
            items[i]=null;
            size-=1;
        }
        if (size< length*0.25 && length>16) {
            resize(length/2);
        }
        return result;
    }
    /**Removes and return the item at the end of the deque.*/
    public Item removeLast() {
        int i = getIndex(nextLast-1);
        Item result = items[i];
        if (result!=null) {
            nextLast=i;
            items[i]=null;
            size-=1;
        }
        if (size< length*0.25 && length>16) {
            resize(length/2);
        }
        return result;

    }
    /**Gets the item at the given index.*/
    public Item get(int index) {
        if (index<0||index>length-1) {
            return null;
        }
        int i = getIndex(index+ length)% length;
        return items[i];

    }
    public Iterator<Item> iterator() {

        return new ArrayDequeIterator();

    }

    private class ArrayDequeIterator implements Iterator<Item>{
        private int index;

        private ArrayDequeIterator() {
            index=0;
        }

        public boolean hasNext() {
            return index <size;
        }
        public Item next() {
            Item item = get(index);
            index+=1;
            return item;
        }

    }




    /**Return weather or not object o is equal to this deque.*/
    public boolean equals(Object o) {
        if (o==null) {
            return false;
        }
        if (o==this) {
            return true;
        }
        if (!(o instanceof ArrayDeque)) {
            return false;
        }
        if (((ArrayDeque<?>) o).size != this.size()) {
            return false;
        }
        for (int i = 0;i < size;i++) {
            if (((ArrayDeque<?>) o).get(i)!=get(i)) {
                return false;
            }
        }
        return true;
    }
}
