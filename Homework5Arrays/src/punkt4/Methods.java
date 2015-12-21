package punkt4;

/**
 * Created by Sergey on 18.10.2015.
 * 4. Напишите программу, печатает массив, затем инвертирует (то есть меняет местами первый элемент с последним,
 * второй — с предпоследним и т.д.), и вновь печатает.
 */
public class Methods {
    public static void invertArray(int[] array) {
        System.out.print("Before: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\nAfter: ");
        for (int i = 0; i < array.length / 2; i++) {
            int j = array[i];
            array[i] = array[array.length - 1 - i]; // посследнее значение в первое
            array[array.length - 1 - i] = j; // первое в последнее
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

}
