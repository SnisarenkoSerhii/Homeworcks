package punkt1;

/**
 * Created by Sergey on 17.10.2015.
 * 1. Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
 * Вывести массив на экран
 */
public class Main {
    public static void main(String[] args) {
        int[][] doubleArrays = new int[8][5];
        for (int i = 0; i < doubleArrays.length; i++) {
            for (int j = 0; j < doubleArrays[i].length; j++) {
                doubleArrays[i][j] = (int) (Math.random()*90+10 ); //[10,100) 10-99
                System.out.print(doubleArrays[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
