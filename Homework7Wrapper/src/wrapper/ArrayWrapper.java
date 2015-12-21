package wrapper;

import java.util.Arrays;

/**
 * Created by Sergey on 26.10.2015.
 * Создайте класс-обертку для массива, который бы делал: инициализацию массива с учетом начального размера; увеличение
 * размера массива при его переполнении;
 * добавление/удаление элементов массива (со сжатием массива); вычислял min, max, avg значения элементов массива.
 * Доп условия: Массив должен быть строго определенного типа,
 * для этого создайте иерархию классов по вашему усмотрению и корень вашей иерархии будет типом массива в обертке.
 * К примеру: есть базовый обьект Base у которого есть методы: Number getValue(), setValue(Number n),
 * multipleValue(Number n), divValue(Number n), ...
 * Обертка должна использовать определенные в Base методы для вычисления min, max, avg значений.
 * symmetry
 */
public class ArrayWrapper implements Methods {
    private Integer[] arr;

    public ArrayWrapper(int length) {
        this.arr = new Integer[length];
    }

    public void add(Integer position, Integer value) {

        if (arr.length > position) {
            arr[position] = value;
            filter();
        } else {
            int n = position - arr.length + 1;
            Integer[] arrCopy = new Integer[arr.length + n];
            System.arraycopy(arr, 0, arrCopy, 0, arr.length);
            arrCopy[position] = value;
            arr = arrCopy;
            filter();
        }
    }

    public void filter() {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                count++;
            }
        }
        Integer[] arrCopy = new Integer[arr.length - count];
        count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                arrCopy[count] = arr[i];
                count++;
            }
        }
        arr = arrCopy;
    }

    public void maxArraysElements() {
        int max = -2147483648;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number of array is: " + max);

    }

    public void minArraysElements() {
        int min = 2147483647;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number of array is: " + min);
    }

    public void avgArraysElements() {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double result = (double) sum / arr.length;
        System.out.println("Average number of array is: " + result);
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
