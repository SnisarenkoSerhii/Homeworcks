package punkt5;

import java.util.Random;

/**
 * Created by Sergey on 20.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int random = (int) (Math.random() * 100);
        // int[][] array = new int[5][r.nextInt(1)];
        int[][] array = new int[5][random];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[r.nextInt(1)];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt();
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

