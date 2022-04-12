/*
 * @Author:lucio
 * @Date: 2022-04-11 10:26:08
 * @LastEditTime: 2022-04-12 20:08:59
 * @LastEditors: Please set LastEditors
 * @Description:A SLList is a list of integers, which hides the terrible truth
 *              of the nakedness within.
 * @FilePath: \05SLLists\SLLists.java
 */
public class SLLists {
    public IntNode sentinel;
    private int size;
    /**Create an empty list. */
    public SLLists() {
        sentinel = new IntNode(63,null);
        size=0;
    }

    /**Adds x to the front of the list. */
    public void addFirst(int x) {
        size+=1;
        sentinel.next = new IntNode(x,sentinel.next);
    }
    /**Return the first item in the list. */
    public int getFirst() {
        return sentinel.next.item;
    }
    /**Add an item to the end of the list. */
    public void addLast(int x) {
        size+=1;
        IntNode p = sentinel;
        /**Move p until it reaches the end of the list. */
        while (p.next!=null) {
            p=p.next;
        }
        p.next = new IntNode(x, null);
    }

    // /**Return the size of the list that starts at IntNode p. */
    // private static int size(IntNode p) {
    //     if (p.next==null) {
    //         return 1;
    //     }
    //     return 1+size(p.next);
    // }
    // //计算size()效率低，换一种效率高的方法。
    // public int size() {
    //     return size(first);
    // }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        SLLists L = new SLLists();
        L.addLast(25);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.print(L.size());
    }

}
