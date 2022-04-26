package deque;

import java.util.Iterator;

public class LinkedListDeque<Items> {
    int size;
    private class Node {
        Node prev;
        Items item;
        Node next;
        private Node(Node p,Items i,Node n) {
            prev = p;
            item = i;
            next = n;
        }
    }
    Node sentinel=new Node(null,null,null);
    /**Create an empty list.*/
    public LinkedListDeque() {
        size=0;
        sentinel.prev=sentinel;
        sentinel.next=sentinel;
    }
    /**Add an item in the front of the list.*/
    public void addFirst(Items item) {
        size+=1;
        Node p = new Node(sentinel,item,sentinel.next);
        sentinel.next.prev = p;
        sentinel.next = p;
    }
    /**Add an item in the end of the list.*/
    public void addLast(Items item) {
        size+=1;
        Node q=new Node(sentinel.prev,item,sentinel);
        sentinel.prev.next = q;
        sentinel.prev=q;
    }

    /**Retuen True if deque is empty.*/
    public boolean isEmpty() {
        if (sentinel.next==sentinel&&sentinel.prev==sentinel) {
            return true;
        } else {
            return false;
        }
    }
    /**Return the length of deque*/
    public int size() {
        return size;
    }
    /**Prints the items in the deque from front to end.*/
    public void printDeque() {
        if(!isEmpty()) {
            Node p = sentinel.next;
            while (p!=sentinel) {
                System.out.print(p.item+" ");
                p=p.next;
            }
            System.out.println();
        }
    }
    /**Removes and return the item at the front of the deque.*/
    public Items removeFirst() {
        Items temp = null;
        if (!isEmpty()) {
            size-=1;
            temp = sentinel.next.item;
            sentinel.next.next.prev=sentinel;
            sentinel.next=sentinel.next.next;

        }
        return temp;
    }
    /**Removes and return the item at the end of the deque.*/
    public Items removeLast() {
        Items temp = null;
        if (!isEmpty()) {
            size-=1;
            temp = sentinel.prev.item;
            sentinel.prev.prev.next=sentinel;
            sentinel.prev=sentinel.prev.prev;

        }
        return temp;
    }
    /**Gets the item at the given index.*/
    public Items get(int index) {
        Node p = sentinel.next;
        index = index % size;
        Items temp = null;
        while (p!=sentinel&&index>0) {
            temp = p.item;
            p=p.next;
            index-=1;
        }
        return temp;
    }
    /**Return an iterator.*/
    public Iterator<Integer> iterator() {
        LinkedListDeque ls = new LinkedListDeque();
        Iterator<Integer> iterator = ls.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        return iterator;

    }
    /**Return weather or not object o is equal to this deque.*/
    public boolean equals(Object o) {
        return o instanceof deque.LinkedListDeque;
    }

}
