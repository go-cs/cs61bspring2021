/*
 * @Date: 2022-05-15 20:01:44
 * @LastEditors: victory-hlx a1272012007@163.com
 * @LastEditTime: 2022-05-15 20:18:09
 * @FilePath: \disc07\findSum.java
 */
public class findSum {
    public static boolean findSum(int[] A, int x) {
        for (int i = 0; i < A.length; i++){
            int aj = x - A[i];
            int lo = 0;
            int hi = A.length;
            int mid = (lo+hi)/2;
            while (lo<hi) {
                if (A[mid] == aj) {
                    return true;
                } else if (A[mid]<aj) {
                    lo = mid+1;
                } else {
                    hi = mid - 1;
                }
                
            }
            return false;
        
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7};
        System.out.println(findSum(arr, 4));
    }
}