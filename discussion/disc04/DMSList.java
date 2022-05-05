public class DMSList {
    private IntNode sentinel;
    public DMSList() {
        sentinel = new IntNode(-1000,new LastIntNode());
    }
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode h) {
            item = i;
            next = h;
        }
        public int max() {
            return Math.max(item, next.item);
        }
    }

    public int max() {
        return sentinel.next.max();
    }

    public class LastIntNode extends IntNode {
        public LastIntNode() {
            super(0,null);
        }
        @Override
        public int max() {
            return 0;
        }
    }

    public void insertFront(int x) {
        sentinel.next = new IntNode(x,sentinel.next);
    }

    public static void main(String[] args) {
        DMSList test = new DMSList();
        test.insertFront(10);
        test.insertFront(20);
        System.out.println(test.max());
    }

}
