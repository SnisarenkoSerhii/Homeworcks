package punkt3;

/**
 * Created by Sergey on 18.10.2015.
 * Напишите программу, печатающую количество максимальных элементов непустого массива, в которой используется
 * только один цикл.
 */
public class Methods {
    public static void maxArraysElements(int[] array) {
        int max = 0;
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] == max){
                count += 1;}
        }
        System.out.println("Maximum number of array is: " + max);
        System.out.println("The amount of maximum numbers in array is: " + count);
    }
}

