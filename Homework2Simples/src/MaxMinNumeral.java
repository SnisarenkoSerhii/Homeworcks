/**
 * Created by Sergey on 03.10.2015.
 *
 * � ���������� n �������� ������������ ���������� ����� � 2-�� ������� ����� �������.
 * �������� ���������, ����������� � ��������� �� ����� max � min ����� ����� n.
 *
 */
public class MaxMinNumeral {
    private int nextNumber;
    private int lastNumber;
    private int max = 0;
    private int min = 9;
    private double number;

    public double getNumber() {
        return number;
    }

    public MaxMinNumeral setNumber(double number) {
        this.number = number;
        return this;
    }

    public void getMinMaxNumerals() {
        number *= 100;
        nextNumber = (int) number;
        System.out.println("Getting numerals " + nextNumber + " from our : " + number / 100);

        while (nextNumber != 0) {
            lastNumber = nextNumber % 10;
            nextNumber = nextNumber / 10;

            if (max < lastNumber){
                max = lastNumber;
            }

            if (min > lastNumber){
                min = lastNumber;
            }
        }
        System.out.println("Maximum numeral in our nimber is: " + max);
        System.out.println("Minimum numeral in our number is: " + min);
    }
}
