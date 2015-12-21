/**
 * Created by Sergey on 06.10.2015.
 * В переменной n хранится вещественное трёхзначное число с 5-мя знаками после запятой. Создайте программу, вычисляющую
 * и выводящую на экран значение формулы: цифра соте + цифра 10-ов - цифра единиц + цифра десятых - цифра сотых и т.д числа n.
 */
public class Calculations {
    private double number;
    private int intNumber;


    public double getNumber() {
        return number;
    }

    public Calculations setNumber(double number) {
        this.number = number;
        return this;
    }

    public int step() {
        int i = intNumber % 10;
        System.out.println(intNumber % 10);
        intNumber /= 10;
        return intNumber;
    }

    public int toInt() {
        number *= 100000;
        intNumber = (int) number;
        System.out.println(intNumber);
        return intNumber;
    }

    public int calc(int number) {
        return number % 10;
    }

    public void calculate() {
        number *= 100000;
        int intNumber = (int) number;
        int number7 = intNumber % 10;
        intNumber /= 10;
        int number6 = intNumber % 10;
        intNumber /= 10;
        int number5 = intNumber % 10;
        intNumber /= 10;
        int number4 = intNumber % 10;
        intNumber /= 10;
        int number3 = intNumber % 10;
        intNumber /= 10;
        int number2 = intNumber % 10;
        intNumber /= 10;
        int number1 = intNumber % 10;
        intNumber /= 10;
        int number0 = intNumber % 10;

        int sum = number0 + number1 - number2 + number3 - number4 + number5 - number6 + number7;
        System.out.println(String.format("%d + %d - %d + %d - %d + %d - %d + %d = %d", number0, number1,
                number2, number3, number4, number5, number6, number7, sum));

        intNumber = (int) number;

        int sum2 = calc(intNumber)
                - calc(intNumber /= 10)
                + calc(intNumber /= 10)
                - calc(intNumber /= 10)
                + calc(intNumber /= 10)
                - calc(intNumber /= 10)
                + calc(intNumber /= 10)
                + calc(intNumber /= 10);
        System.out.println(String.format("%d, %d", sum, sum2));
    }


}