import org.junit.Test;
import static org.junit.Assert.*;
/**Test the mystery method*/
public class testMystery {
    @Test
    public void test() {
        int[] inputArray = new int[] {1,4,3,9};
        int k = 2;
        int expected = 2;
        int actual = Mystery.mystery(inputArray,k);
        assertEquals(expected,actual);

    }
    @Test
    public void test2() {
        int[] inputArray = new int[] {6,5,4,3,2,1};
        int k = 2;
        int expected = 5;
        int actual = Mystery.mystery(inputArray,k);
        assertEquals(expected,actual);

    }
}
