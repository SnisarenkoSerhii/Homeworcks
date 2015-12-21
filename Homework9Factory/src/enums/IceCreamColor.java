package enums;

import java.util.Random;

/**
 * Created by Sergey on 26.11.2015.
 */
public enum IceCreamColor {
    GREEN, WHITE, BROWN, ORANGE, RED;

    public IceCreamColor randomColor(){
        Random r = new Random();
        int i = r.nextInt(5);
        if(i == 0){
            IceCreamColor iceCreamColor = GREEN;
            return iceCreamColor;
        }
        if(i == 1){
            IceCreamColor iceCreamColor = WHITE;
            return iceCreamColor;
        }
        if(i == 2){
            IceCreamColor iceCreamColor = BROWN;
            return iceCreamColor;
        }
        if(i == 3){
            IceCreamColor iceCreamColor = ORANGE;
            return iceCreamColor;
        }else{
            IceCreamColor iceCreamColor = RED;
            return iceCreamColor ;
        }
    }
}
