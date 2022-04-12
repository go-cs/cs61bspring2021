public class QuikMaths {
    public static void multiplyBy3(int[] A) {
        for (int x:A) {
            x=x*3;
        }
//        //下边这种写法会改变A的值，但上边的不会
//        for (int i = 0;i<A.length;i++) {
//            A[i]*=3;
//        }
    }

    public static void multiplyBy2(int[] A) {
        int[] B = A;
        for (int i=0;i<B.length;i+=1) {
            B[i]*=2;
        }
    }

    public static void swap(int A,int B) {
//        int temp = B;
//        B =  A;
//        A = temp;
        A=A+B;
        B=A-B;
        A=A-B;
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{2,3,3,4};
        multiplyBy3(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        /**Value of arr: {2,3,3,4}*/

        arr = new int[]{2,3,3,4};
        multiplyBy2(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        /**Value of arr: {4,6,6,8}*/

        int a=6;
        int b =7;
        swap(a,b);
        System.out.print(a+","+b);
        /**Value of a:6  Value of b: 7*/
    }
}
