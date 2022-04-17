import javax.swing.text.Position;

/*
 * @Author: your name
 * @Date: 2022-04-15 10:40:11
 * @LastEditTime: 2022-04-16 20:46:35
 * @LastEditors: Please set LastEditors
 * @Description: use array to construct AList
 * @FilePath: \07ALists\AList.java
 */

 public class AList<item> implements List61b<item>{
     private item[] items;
     private int size;
    /**Create an empty list. */
     public AList() {
         //items=new item[100];
         items=(item []) new Object[100];
         size=0;
     }
     /**Inserts item into given position.
      * Code from discussion3
     */
    public void insert(item x,int position) {
        item[] newItems=(item[]) new Object[items.length+1];
        System.arraycopy(items, 0, newItems, 0, position);
        newItems[position]=x;

        System.arraycopy(items, position, newItems, position+1, items.length-position);
        items=newItems;
    }
     /**Resize the underlying array to the target capacity. */
     private void resize(int capacity) {
         item[] a = (item []) new Object[capacity];
         System.arraycopy(items,0,a,0,size);
         items=a;
     }
     /*Inserts an item at the front.*/
     public void addFirst(item x) {
         insert(x,0);
     }
     /**Insert x into the back of the last. */
     public void addLast(item x) {
         if (size==items.length) {
            //resize(size+1);
            resize(size*2);//速度有很大提高
         }
         items[size]=x;
         size+=1;
     }
     /*Gets an item from the front.*/
     public item getFirst() {
         return get(0);
     }
     /**Returns the item from the back of the list. */
     public item getLast() {
         return items[size-1];
     }
     /**Gets the ith item in the List (0 is the front). */
     public item get(int i) {
         return items[i];
     }
     /**Returns the number of items in the list. */
     public int size() {
         return size;
     }
     /**Delete item from back of the list and
      * return deleted item.*/
    public item removeLast() {
        item x = getLast();
        //items[size-1]=0;//no need
        items[size-1]=null;//销毁不引用的对象，设为null
        size=size-1;
        return x;
    }
 }