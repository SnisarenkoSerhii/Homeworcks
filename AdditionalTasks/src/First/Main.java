package First;

/**
 * Created by Sergey on 09.10.2015.
 * 1.	Написать программу, которая находит среднее арифметическое значение трёх вещественных чисел.
 */
public class Main {
    public static void main(String[] args) {
        PullAndSumNumbers p = new PullAndSumNumbers();
        p.setNumberOne(3523);
        p.setNumberTwo(43554);
        p.setNumberThree(78997);
        p.doMath();
    }
}
