package enums;

import java.util.Random;

/**
 * Created by Sergey on 26.11.2015.
 */
public enum IceCreamShape {
    CYLINDRICAL, SPHERICAL, TRIANGULAR;

    public IceCreamShape randomShape() {
        Random r = new Random();
        int i = r.nextInt(3);
        if (i == 0) {
            IceCreamShape iceCreamShape = CYLINDRICAL;
            return iceCreamShape;
        }
        if (i == 1) {
            IceCreamShape iceCreamShape = SPHERICAL;
            return iceCreamShape;
        } else {
            IceCreamShape iceCreamShape = TRIANGULAR;
            return iceCreamShape;
        }
    }
}
