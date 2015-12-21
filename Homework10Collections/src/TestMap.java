import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Sergey on 04.12.2015.
 */
public class TestMap implements Comparator {
    public int compare(Object obj1, Object obj2) {
        return ((Comparable) ((Map.Entry) (obj1)).getValue()).compareTo(((Map.Entry) (obj2)).getValue());
    }


//    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue2( Map<K, V> map )
//    {
//        Map<K,V> result = new LinkedHashMap<>();
//        Stream<Map.Entry<K,V>> st = map.entrySet().stream();
//
//        st.sorted(Comparator.comparing(e -> e.getValue()))
//                .forEach(e ->result.put(e.getKey(),e.getValue()));
//
//        return result;
//    }
}
