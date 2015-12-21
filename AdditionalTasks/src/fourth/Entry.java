package fourth;

/**
 * Created by Sergey on 12.10.2015.
 */
public class Entry {
    public static void main(String[] args) {
        double radius =  Circle.enterRadius("Enter the radius please: ");
        Circle c = new Circle();
        c.getSquare(radius);
        c.getLength(radius);
    }
}
