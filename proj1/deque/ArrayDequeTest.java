package deque;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;

import static org.junit.Assert.*;

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
        assertEquals("Should have size 1", 1, lld1.size());
        assertFalse("lld1 should now contain 1 item", lld1.isEmpty());

        lld1.addLast("middle");
        assertEquals("Should have size 2", 2, lld1.size());

        lld1.addLast("back");
        assertEquals("Should have size 3", 3, lld1.size());

        System.out.println("Printing out deque: ");
        lld1.printDeque();
    }

    @Test
    public void addWithResizingTest() {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        for (int i = 0; i < 20; i += 1) {
            ad.addLast(i);
        }
        assertEquals("Should be 20", 20, ad.size());
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
        assertEquals("Should be last", "last", ad.removeLast());
        assertEquals("Should be middle", "middle", ad.removeLast());
        assertEquals("Should be front", "front", ad.removeLast());

        assertTrue("should be empty", ad.isEmpty());
    }

    @Test
    public void removeWithResizingTest() {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        for (int i = 0; i < 20; i++) {
            ad.addLast(i);
        }
        int n = 16;
        while (n > 0) {
            ad.removeLast();
            n--;
        }
        assertEquals("Should be 4", 4, ad.size());
        //asertEquals("Should be 16",16,ad.length);

    }

    @Test
    /**此测试需要nextFirst=4，nextLast=5*/
    public void addRemoveGetResizeTest() {
        ArrayDeque<String> ad = new ArrayDeque<>();
        assertTrue("should be empty", ad.isEmpty());
        ad.addLast("a");
        assertEquals("a", ad.get(0));
        ad.addLast("b");
        assertEquals("b", ad.get(1));
        ad.addFirst("c");
        assertEquals("c", ad.get(0));
        ad.addLast("d");
        ad.addLast("e");
        ad.addLast("f");
        assertEquals("e", ad.get(4));
    }

    @Test
    //此段测试需要nextFirst=7,naxtLast=0
    public void iteratorTest() {

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        for (int i = 0; i < 20; i++) {
            ad.addLast(i);
        }
        int index = 0;
        for (int item : ad) {
            assertEquals("Should be equal", index, item);
            index += 1;
        }
    }

    @Test
    public void addFirstRemoveLast() {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.addFirst(1);
        ad.addFirst(9);
        assertEquals(1, (int) ad.removeLast());
        assertEquals(9, (int) ad.removeLast());
        assertTrue(ad.isEmpty());
    }

    @Test
    public void addLastRemoveFirst() {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.addLast(1);
        ad.addLast(9);
        assertEquals(1, (int) ad.removeFirst());
        assertEquals(9, (int) ad.removeFirst());
        assertTrue(ad.isEmpty());
    }

    @Test
    public void randomizedTest() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        int N = 1000000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 6);
            if (operationNumber == 0) {
                int randVal = StdRandom.uniform(0, 100);
                arrayDeque.addFirst(randVal);
            } else if (operationNumber == 1) {
                int randVal = StdRandom.uniform(0, 100);
                arrayDeque.addLast(randVal);
            } else if (arrayDeque.size() == 0) {
                assertTrue(arrayDeque.isEmpty());
            } else if (operationNumber == 2) {
                assertTrue(arrayDeque.size() > 0);
            } else if (operationNumber == 3) {
                arrayDeque.removeFirst();
            } else if (operationNumber == 4) {
                arrayDeque.removeLast();
            } else if (operationNumber == 5) {
                int randIndex = StdRandom.uniform(0, arrayDeque.size());
                arrayDeque.get(randIndex);
            }
        }
    }

    @Test
    public void getTest() {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.addLast(0);
        ad.addLast(1);
        assertEquals(1, (int) ad.get(1));
        ad.addLast(4);
        assertEquals(4, (int) ad.removeLast());
        ad.addLast(6);
        assertEquals(1, (int) ad.get(1));
        ad.addLast(8);
        assertEquals(8, (int) ad.removeLast());
        ad.addLast(10);
        ad.addFirst(11);
        assertEquals(0, (int) ad.get(1));
        ad.addFirst(13);
        ad.addFirst(14);
        ad.addLast(15);
        ad.addLast(16);
        assertEquals(14, (int) ad.removeFirst());

    }

    @Test
    public void adGetTest() {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.addFirst(0);
        assertEquals(0,(int)ad.removeFirst());
        ad.addFirst(2);
        ad.addFirst(3);
        ad.addFirst(4);
        assertEquals(2,(int)ad.removeLast());
        assertEquals(4,(int)ad.get(0));
        assertEquals(4,(int)ad.removeFirst());
        assertEquals(3,(int)ad.removeFirst());
        ad.addFirst(9);
        ad.addFirst(10);
        assertEquals(9,(int)ad.removeLast());
        assertEquals(10,(int)ad.removeLast());
        ad.addFirst(13);
        assertEquals(13,(int)ad.removeLast());
        ad.addFirst(15);

    }

}
