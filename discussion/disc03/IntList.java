public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f,IntList r) {
        this.first = f;
        this.rest = r;
    }

    public static void evenOdd(IntList lst) {
        if (lst==null||lst.rest==null) {
            return ;
        }
        IntList p =lst;
        IntList q=lst.rest;
        IntList odd = q;
        while (p.rest!=null&&q.rest!=null) {
            p.rest = p.rest.rest;
            q.rest = q.rest.rest;
            p=p.rest;
            q=q.rest;
        }
        p.rest = odd;
    }

    public static void main(String[] args) {
        IntList lst = new IntList(5,null);
        lst = new IntList(2,lst);
        lst = new IntList(4,lst);
        lst = new IntList(1,lst);
        lst = new IntList(3,lst);
        lst = new IntList(0,lst);
        IntList.evenOdd(lst);
        IntList p = lst;
        while (p!=null) {
            System.out.print(p.first+"->");
            p = p .rest;
        }
        System.out.print("null");
    }
}
