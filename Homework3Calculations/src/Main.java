/**
 * Created by Sergey on 06.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Calculations c = new Calculations();
        c.setNumber(123.45678);
        c.toInt();
        c.step();
        c.step();
        c.step();
        c.step();
        c.step();
        c.step();
        c.step();
        c.step();
        c.setNumber(123.45678);
        c.calculate();
    }
}
