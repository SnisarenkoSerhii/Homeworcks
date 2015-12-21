package enums;

import java.util.Random;

/**
 * Created by Sergey on 25.11.2015.
 */
public enum IceCreamName {
    WHITE, CHOCOLATE, ICE, DEFAULT;

    public IceCreamName randomName(){
        Random r = new Random();
        int i = r.nextInt(4);
        if(i == 0){
            IceCreamName iceCreamName = WHITE;
            return iceCreamName;
        }
        if(i == 1){
            IceCreamName iceCreamName = CHOCOLATE;
            return iceCreamName;
        }
        if(i == 2){
            IceCreamName iceCreamName = ICE;
            return iceCreamName;
        } else{
            IceCreamName iceCreamName = DEFAULT;
            return iceCreamName ;
        }
    }
}
