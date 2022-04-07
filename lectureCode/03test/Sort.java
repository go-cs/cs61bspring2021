public class Sort {
    public static void sort(String[] x) {
        //找字符串数组中的最小值
        //与第一个位置的元素交换
        //对余下的元素选择排序
        sort(x,0);


    }
    private static void sort(String[] x,int start) {
        if (start == x.length) {
            return;
        }
        int smallIndex = findSmallest(x,start);
        swap(x,start,smallIndex);
        sort(x,start+1);
    }

    /**Swap item a with b.*/
    public static void swap(String[] x,int a,int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    /** Return the smallest string in x.*/
    public static int findSmallest(String[] x,int start) {
        int smallestIndex = start;
        for (int i = start;i<x.length;i++) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp<0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
