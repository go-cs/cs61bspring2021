package deque;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class MaxArrayDequeTest {
    @Test
    public void maxTest() {
        MaxArrayDeque<Integer> mad = new MaxArrayDeque<>(new IntComparator());
        mad.addLast(1);
        mad.addLast(3);
        assertEquals(2, mad.size());
        assertEquals((Integer) 3, mad.max());
    }

    private static class IntComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer i1, Integer i2) {
            return i1 - i2;
        }
    }

}
