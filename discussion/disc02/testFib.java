import org.junit.Test;
import static org.junit.Assert.*;
public class testFib {
    @Test
    public void testfib() {
        int n = 5;
        int expected = 5;
        int actual = fib.fib(5);
        assertEquals(expected,actual);
    }
    @Test
    public void testfib2() {
        int n = 8;
        int expected = 21;
        int actual = fib.fib2(n,0,0,1);
        assertEquals(expected,actual);
        int n2 = 1;
        int expected2 = 1;
        int actual2 = fib.fib2(n2,0,0,1);
        assertEquals(expected2,actual2);
    }
}
