package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
//import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class testThreeAddThreeRemove {
    @Test
    public void test1() {
        AListNoResizing<Integer> A = new AListNoResizing<>();
        BuggyAList<Integer> B = new BuggyAList<>();
        A.addLast(4);
        B.addLast(4);
        A.addLast(5);
        B.addLast(5);
        A.addLast(6);
        B.addLast(6);
        assertEquals(A.size(),B.size());
        assertEquals(A.removeLast(),B.removeLast());
        assertEquals(A.removeLast(),B.removeLast());
        assertEquals(A.removeLast(),B.removeLast());
    }
    @Test
    public void randomTest() {
        AListNoResizing<Integer> L = new AListNoResizing<>();
        int N = 500;
        for (int i = 0;i<N;i++) {
            int operationNumber = StdRandom.uniform(0,3);
            if (operationNumber == 0) {
                //addLast
                int randVal = StdRandom.uniform(0,100);
                L.addLast(randVal);
                System.out.println("addLast(" + randVal+")");
            } else if (operationNumber == 1) {
                //size
                int size = L.size();
                System.out.println("size: " + size);
            } else if (operationNumber==2) {
                if (L.size()>0) {
                    int last = L.getLast();
                    System.out.println("getLast:("+last+")");
                }
            }

        }
    }
    @Test
    public void compareTest() {
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList<Integer> B = new BuggyAList<>();
        int N = 500;
        for (int i = 0;i<N;i++) {
            int operationNumber = StdRandom.uniform(0,3);
            if (operationNumber == 0) {
                //addLast
                int randVal = StdRandom.uniform(0,100);
                L.addLast(randVal);
                B.addLast(randVal);
                System.out.println("addLast(" + randVal+")");
            } else if (operationNumber == 1) {
                //size
                int size = L.size();
                System.out.println("size: " + size);
            } else if (operationNumber==2) {
                if (L.size()>0) {
                    int lastL = L.getLast();
                    int lastB = B.getLast();
                    assertEquals(lastL,lastB);
                    System.out.println("getLast:("+lastL+")");
                }
            }

        }
    }

}
