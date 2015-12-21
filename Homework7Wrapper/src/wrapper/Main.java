package wrapper;



/**
 * Created by Sergey on 30.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayWrapper a = new ArrayWrapper(8);
        a.add(0, 5);
        a.add(1, 5);
        a.add(2, 5);
        a.add(3, 7);
       // a.add(4, 7);
        a.add(5, 7);
        a.add(6, 5);
       // a.add(7, 7);
        a.add(8, 7);
        a.add(9, 7);
        a.add(10,5);
        a.add(20, 19);
        System.out.println(a.toString());
        a.maxArraysElements();
        a.minArraysElements();
        a.avgArraysElements();
    }
}
