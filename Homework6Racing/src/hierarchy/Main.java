package hierarchy;

/**
 * Created by Sergey on 25.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Truck t = new Truck("Truck", 5, 74747, 150, "blue", 10000);
        t.getParameters();
        System.out.println();
        Truck t2 = new Truck();
        t2.getParameters();
    }
}
