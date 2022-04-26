package deque;

import org.junit.Test;
import static org.junit.Assert.*;
import deque.ArrayDeque;
public class ArrayDequeTest {
    @Test
    public void testIsEmpty() {

        ArrayDeque<Integer> lld1 = new ArrayDeque<>();
        assertTrue("A newly initialized LLDeque should be empty", lld1.isEmpty());

    }

    @Test
    public void testAdd() {
        ArrayDeque<String> lld1 = new ArrayDeque<>();


        assertTrue("A newly initialized LLDeque should be empty", lld1.isEmpty());

        lld1.addFirst("front");

        // The && operator is the same as "and" in Python.
        // It's a binary operator that returns true if both arguments true, and false otherwise.
        assertEquals("Should have size 1",1, lld1.size());
        assertFalse("lld1 should now contain 1 item", lld1.isEmpty());

        lld1.addLast("middle");
        assertEquals("Should have size 2",2, lld1.size());

        lld1.addLast("back");
        assertEquals("Should have size 3",3, lld1.size());

        System.out.println("Printing out deque: ");
        lld1.printDeque();
    }

    @Test
    public void addWithResizingTest() {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        for (int i = 0;i<20;i+=1) {
            ad.addLast(i);
        }
        assertEquals("Should be 20",20,ad.size());
    }

    @Test
    /** Adds an item, then removes an item, and ensures that dll is empty afterwards. */
    public void addRemoveTest() {

        System.out.println("Make sure to uncomment the lines below (and delete this print statement).");

        ArrayDeque<Integer> lld1 = new ArrayDeque<Integer>();
        // should be empty
        assertTrue("lld1 should be empty upon initialization", lld1.isEmpty());

        lld1.addFirst(10);
        // should not be empty
        assertFalse("lld1 should contain 1 item", lld1.isEmpty());

        lld1.removeFirst();
        // should be empty
        assertTrue("lld1 should be empty after removal", lld1.isEmpty());

    }

    @Test
    public void removeTest() {
        ArrayDeque<String> ad = new ArrayDeque<>();

        ad.addLast("front");
        ad.addLast("middle");
        ad.addLast("last");
        assertEquals("Should be last","last",ad.removeLast());
        assertEquals("Should be middle","middle",ad.removeLast());
        assertEquals("Should be front","front",ad.removeLast());

        assertTrue("should be empty",ad.isEmpty());
    }

    @Test
    public void removeWithResizingTest() {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        assertEquals(8,ad.length);
        for (int i = 0;i<20;i++) {
            ad.addLast(i);
        }
        int n = 16;
        while (n>=0) {
            ad.removeLast();
            n--;
        }
        assertEquals("Should be 5",4,ad.size());
        assertEquals("Should be 16",16,ad.length);

    }
    @Test
    public void lecTest() {
        ArrayDeque<String> ad = new ArrayDeque<>();
        assertTrue("should be empty", ad.isEmpty());
        ad.addLast("a");
        assertEquals("a",ad.get(5));
        ad.addLast("b");
        assertEquals("b",ad.get(6));
        ad.addFirst("c");
        assertEquals("c",ad.get(4));
        ad.addLast("d");
        ad.addLast("e");
        ad.addLast("f");
        assertEquals("e",ad.get(0));
    }
}
