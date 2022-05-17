package bstmap;

import java.util.Iterator;
import java.util.Set;

public class BSTMap<K extends Comparable<K>, V> implements Map61B<K, V> {
    private int size;
    private BSTNode root;

    private class BSTNode {
        private K key;
        private V val;
        private BSTNode left, right;

        public BSTNode(K k, V v) {
            this.key = k;
            this.val = v;
        }
    }

    public BSTMap() {
        size = 0;
        root = null;
    }


    @Override
    /** Removes all of the mappings from this map. */
    public void clear() {
        size = 0;
        root = null;
    }

    @Override
    /* Returns true if this map contains a mapping for the specified key. */
    public boolean containsKey(K key) {
        if (root == null) {
            return false;
        } else {
            return containsKey(root, key);
        }
    }

    private boolean containsKey(BSTNode x, K key) {
        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return true;
        } else if (cmp < 0) {
            return containsKey(x.left, key);
        } else {
            return containsKey(x.right, key);
        }
    }

    @Override
    /* Returns the value to which the specified key is mapped, or null if this
     * map contains no mapping for the key.
     */
    public V get(K key) {
        return get(root, key);
    }

    private V get(BSTNode x, K key) {
        if (root == null) {
            return null;
        } else {
            if (key.compareTo(x.key) == 0) {
                return x.val;
            } else if (key.compareTo(x.key) < 0) {
                return get(x.left, key);
            } else {
                return get(x.right, key);
            }
        }
    }

    @Override
    /* Returns the number of key-value mappings in this map. */
    public int size() {
        return size;
    }

    @Override
    /* Associates the specified value with the specified key in this map. */
    public void put(K key, V value) {
        root = put(root, key, value);
    }

    private BSTNode put(BSTNode x, K key, V value) {
        if (x == null) {
            size += 1;
            return new BSTNode(key, value);

        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else {
            x.val = value;
            size += 1;
        }
        return x;
    }

    /*  Prints out your BSTMap in order of increasing Key.*/
    public void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(BSTNode x) {
        if (x != null) {
            System.out.print(x.key + "-" + x.val + " ");
            printInOrder(x.left);
            printInOrder(x.right);
        }
    }

    @Override
    public Iterator<K> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public V remove(K key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V remove(K key, V value) {
        throw new UnsupportedOperationException();
    }
}
