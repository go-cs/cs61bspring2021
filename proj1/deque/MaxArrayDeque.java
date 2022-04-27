package deque;

import java.util.Comparator;

public class MaxArrayDeque<T> extends ArrayDeque<T> {

    private Comparator<T> comparator;

    /**Create a MaxArrayDeque with the given Comparator.*/
    public MaxArrayDeque(Comparator<T> c) {
        comparator = c;
    }
    /**Return the max item in the deque.*/
    public T max() {
        return max(comparator);

    }
    public T max(Comparator<T> c) {
        int maxIndex = 0;
        for (int i = 0;i<size();i++) {
            if (c.compare(get(i),get(maxIndex))>0) {
                maxIndex = i;
            }
        }
        return get(maxIndex);
    }


}
