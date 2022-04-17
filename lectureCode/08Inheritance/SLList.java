/*
 * @Author:lucio
 * @Date: 2022-04-11 10:26:08
 * @LastEditTime: 2022-04-17 15:48:58
 * @LastEditors: Please set LastEditors
 * @Description:A SLList is a list of integers, which hides the terrible truth
 *              of the nakedness within.
 * @FilePath: \05SLLists\SLLists.java
 */
public class SLList<Blorp> implements List61b<Blorp> {
    private class Node {
        public Blorp item;
        public Node next;

        public Node(Blorp i, Node h) {
            item=i;
            next=h;
        }
    }
    /* The first item (if it exists) is at sentinel.next. */
    private Node sentinel;
    private int size;

    /**Create an empty SLList. */
    public SLList() {
        sentinel = new Node(null,null);
        size=0;
    }

    public SLList(Blorp x) {
        size=0;
        sentinel=new Node(null,null);
        sentinel.next=new Node(x,null);
    }
    /** Inserts the item into the given position in
	  *  the list. If position is greater than the
	  *  size of the list, inserts at the end instead.
	  */
	 public void insert(Blorp item, int position) {
		 Node p = sentinel;
		 while (position > 1 && p.next != null) {
			 position--;
			 p = p.next;
		 }
		 Node newNode = new Node(item, p.next);
		 p.next = newNode;
	 }



    /**Adds x to the front of the list. */
    public void addFirst(Blorp x) {
        size+=1;
        sentinel.next = new Node(x,sentinel.next);
    }
    /**Return the first item in the list. */
    public Blorp getFirst() {
        return sentinel.next.item;
    }
    /**Add an item to the end of the list. */
    public void addLast(Blorp x) {
        size+=1;
        Node p = sentinel;
        /**Move p until it reaches the end of the list. */
        while (p.next!=null) {
            p=p.next;
        }
        p.next = new Node(x, null);
    }
    /** Returns the back node of our list. */
	 private Node getLastNode() {
		 Node p = sentinel;

		 /* Move p until it reaches the end. */
		 while (p.next != null) {
			 p = p.next;
		 }
		 return p;
	 }
    
   /** Returns last item */
	 public Blorp getLast() {
		 Node back = getLastNode();
		 return back.item;
	 } 
   /** Returns the ith item in the list. */
 	public Blorp get(int i) {
		return get(i, sentinel.next);
	}

	private Blorp get(int i, Node p) {
 		if (i == 0) {
 			return p.item;
		}
 		return get(i - 1, p.next);
	} 
    public int size(){
        return size;
    }
    /** Deletes and returns last item. */
	 public Blorp removeLast() {
		 Node back = getLastNode();
		 if (back == sentinel) {
			 return null;
		 }

		 Node p = sentinel;

		 while (p.next != back) {
			 p = p.next;
		 }
		 p.next = null;
		 return back.item;
	 }

    @Override
	public void print() {
	 	System.out.println("THIS IS THE OVERRIDDEN VERSION.");
	 	Node p = sentinel.next;
	 	while (p != null) {
	 		System.out.print(p.item + " ");
	 		p = p.next;
		}
	}



}