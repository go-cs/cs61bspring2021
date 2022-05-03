import java.util.Iterator;

/*
 *
 */
public class ArraySet<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    public boolean contains(T x) {
        for (int i = 0; i < size; i++) {
            if (x.equals(items[i])) {
                return true;//items[i].equals(x)
            }
        }
        return false;
    }

    public void add(T x) {
        if (x == null) {
            throw new IllegalArgumentException("You can not add null in the ArraySet.");
        }
        if (!contains(x)) {
            items[size] = x;
            size += 1;
        }
    }

    public int size() {
        return size;
    }

    public Iterator<T> iterator() {
        return new ArraySetIterator();
    }

    private class ArraySetIterator implements Iterator<T> {
        private int wizPos;

        public ArraySetIterator() {
            wizPos = 0;
        }

        public boolean hasNext() {
            return wizPos < size;
        }

        public T next() {
            T returnItem = items[wizPos];
            wizPos += 1;
            return returnItem;
        }


    }


    public static void main(String[] args) {

        ArraySet<Integer> aset = new ArraySet<>();
        aset.add(5);
        aset.add(23);
        aset.add(42);
        for (int i : aset) {
            System.out.println(i);
        }

        /**equals the above*/
        //ArraySet<Integer> jaset = new ArraySet<>();
//        Iterator<Integer> seer = aset.iterator();
//
//        while (seer.hasNext()) {
//            System.out.println(seer.next());
//        }

    }

}