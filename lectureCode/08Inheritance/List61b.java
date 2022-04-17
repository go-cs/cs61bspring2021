/*
 * @Author: your name
 * @Date: 2022-04-16 19:52:31
 * @LastEditTime: 2022-04-17 15:47:20
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \lectureCode\08Inheritance\List61b.java
 */
public interface List61b<Item> {

    public void insert(Item x, int position);
    /**Adds x to the front of the list. */
    public void addFirst(Item x);
     /**Insert x into the back of the last. */
     public void addLast(Item y);
     /**Returns the item from the back of the list. */
     public Item getFirst() ;
     /**Returns the item from the back of the list. */
     public Item getLast();
     /**Gets the ith item in the List (0 is the front). */
     public Item get(int i) ;
     /**Returns the number of items in the list. */
     public int size() ;
     /**Delete item from back of the list and
      * return deleted item.*/
    public Item removeLast() ;
  
    default public void print() {
      for (int i= 0;i<size();i+=1) {
        System.out.print(get(i)+" ");
      }
      System.out.println();
    }
}