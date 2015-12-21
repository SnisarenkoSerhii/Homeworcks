import java.util.Comparator;

/**
 * Created by Sergey on 03.12.2015.
 */
public class TestComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
