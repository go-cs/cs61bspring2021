/*
 * @Author: your name
 * @Date: 2022-04-16 16:11:10
 * @LastEditTime: 2022-04-16 16:14:03
 * @LastEditors: Please set LastEditors
 * @Description: Test the speed of program.
 * @FilePath: \07ALists\SpeedTestAList.java
 */
public class SpeedTestAList {
    public static void main(String[] args) {
        AList L = new AList();
        int i = 0;
        while (i<100000) {
            L.addLast(i);
            i+=1;
        }
    }
}
