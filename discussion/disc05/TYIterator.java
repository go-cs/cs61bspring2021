import java.util.Iterator;

public class TYIterator extends OHIterator {
    OHRequest first;
    public TYIterator(OHRequest queue) {
        super(queue);
        first = queue;
    }

    public OHRequest next() {
        OHRequest result = super.next();
        if (result!=null && result.description.contains("thank u")) {
            result =  super.next();
        }
        return result;
    }
}
