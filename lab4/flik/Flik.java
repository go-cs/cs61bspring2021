package flik;

/**
 * An Integer tester created by Flik Enterprises.
 *
 * @author Josh Hug
 */
public class Flik {
    /**
     * @param a Value 1
     * @param b Value 2
     * @return Whether a and b are the same
     */
    public static boolean isSameNumber(Integer a, Integer b) {
        return a.equals(b);
        //return a == b;
        //在i=j=128时存储地址不一样了，128893786 VS 1732398722
    }
}
