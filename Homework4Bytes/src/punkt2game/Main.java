package punkt2game;

import java.util.Random;

/**
 * Created by Sergey on 14.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("The new game has been started!");
        Random random = new Random();
        Methods game = new Methods();
        game.startGame(random.nextInt(100));
    }
}
