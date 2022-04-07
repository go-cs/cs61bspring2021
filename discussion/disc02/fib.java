public class fib {
    /**Return the nth Fibonacci number.*/
    public static int fib(int n) {
        if (n==0) return 0;
        else if (n==1) return 1;
        else return fib(n-1)+fib(n-2);
    }
    /**More efficient version.*/
    public static int fib2(int n,int k,int f0,int f1) {
        k = n;
        if (n<2) return n;
        else {
            while (n>0) {
                f0=f0+f1;
                f1=f0+f1;
                n-=2;

            }
            if (k%2==0) return f0;
            else return f1;

    }
    }


}
