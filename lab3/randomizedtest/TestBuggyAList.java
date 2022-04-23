package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
  @Test
  public void compareTest() {
      AListNoResizing<Integer> L = new AListNoResizing<>();
      BuggyAList<Integer> B = new BuggyAList<>();

      int N = 5000;
      for (int i = 0;i<N;i++) {
          int operationNumber = StdRandom.uniform(0,4);
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
          } else if (operationNumber==3) {
              if (L.size() > 0) {
                  assertEquals(L.removeLast(),B.removeLast());
              }
          }

      }
  }
}
