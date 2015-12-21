package enums;

import java.util.Random;

/**
 * Created by Sergey on 26.11.2015.
 */
public enum IceCreamTaste {
    APPLE, MILK, PEAR, ORANGE, CHOCOLATE;

    public IceCreamTaste randomTaste(){
        Random r = new Random();
        int i = r.nextInt(5);
        if(i == 0){
            IceCreamTaste iceCreamTaste = APPLE;
            return iceCreamTaste;
        }
        if(i == 1){
            IceCreamTaste iceCreamTaste = MILK;
            return iceCreamTaste;
        }
        if(i == 2){
            IceCreamTaste iceCreamTaste = PEAR;
            return iceCreamTaste;
        }
        if(i == 3){
            IceCreamTaste iceCreamTaste = ORANGE;
            return iceCreamTaste;
        }else{
            IceCreamTaste iceCreamTaste = CHOCOLATE;
            return iceCreamTaste ;
        }
    }
}
