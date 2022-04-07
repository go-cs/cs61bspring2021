/**Tests the sort class.*/
import org.junit.Test;

import static org.junit.Assert.*;

public class testSort {
    /**Test the sort.sort method.*/
    @Test
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        //org.junit.Assert.assertEquals(expected, input);//assertEquals上画了一道删除线，意思是作者已放弃这个方法。
        assertArrayEquals(expected, input);
        //用一行替代下边的for循环
//        for (int i = 0; i < input.length; i++) {
//            if(!input[i].equals(expected[i])) {
//                System.out.print("Missmatch in position " + i + ", expected: " + expected[i] + "but got:" + input[i]);
//                return;
//            }
//        }
    }

    /**Test the swap method.*/
    @Test
    public void testSwap() {
        String[] input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;
        Sort.swap(input,a,b);
        String[] expected = {"an", "have", "i", "egg"};
        assertArrayEquals(expected,input);
    }

    /**Test the findSmallest method.*/
    @Test
    public void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;
        int actual = Sort.findSmallest(input,0);
        assertEquals(expected, actual);

        String[] input2 = {"there", "are", "many", "people"};
        int  expected2 = 2;
        int actual2 = Sort.findSmallest(input2,2);
        assertEquals(expected2, actual2);
    }

}
