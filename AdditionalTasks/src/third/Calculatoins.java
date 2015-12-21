package third;

import java.util.Scanner;

/**
 * Created by Sergey on 10.10.2015.
 */
public class Calculatoins {

    public static double enterNumber(String message) {
        double number = 0;
        boolean finished = false;
        do {
            System.out.println(message);
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextDouble()) {
                number = sc.nextDouble();
                finished = true;
            } else System.out.println("That what you entered is not a number, try again please!");
        } while ((finished != true));
        return number;
    }


}
