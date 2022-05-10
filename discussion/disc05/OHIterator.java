

import java.util.Iterator;

public class OHIterator implements Iterator<OHRequest>{
    OHRequest curr;

    //怎么使用super继承？？
    public OHIterator(OHRequest queue) {
        curr = queue;
    }

    public boolean isGood(String description) {
        return description != null && description.length() > 5;
    }

    @Override
    public boolean hasNext() {
        while (curr!=null && !isGood(curr.description)) {
            curr = curr.next;
        }
        if (curr == null) {
            return false;
        }
        return true;
    }

    @Override
    public OHRequest next() {
        if (hasNext()==false) {
            //throw new NoSuchFieldException();
        }
        OHRequest currRequest = curr;
        curr = curr.next;
        return currRequest;
    }

}