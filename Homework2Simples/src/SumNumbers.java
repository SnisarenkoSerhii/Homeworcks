/**
 * Created by Sergey on 03.10.2015.
 *
 * � ���������� n �������� ������������ ���������� ����� � 2-�� ������� ����� �������. �������� ���������,
 * ����������� � ��������� �� ����� ����� ���� ���� ����� n.
 *�������� ���� ����� 69. ����� ��� ������������ - 6 � 9. � �� ����� ����� 6+9 = 15.
 */
public class SumNumbers {
    private int nextNumber;
    private int sumAllNumbers;
    private double number;

    public double getNumber() {
        return number;
    }

    public SumNumbers setNumber(double number) {
        this.number = number;
        return this;
    }

    public void sumNumerals(){
        number *= 100;
        nextNumber = (int) number;
        System.out.println("Getting numerals " + nextNumber + " from our : " + number/100);
        /**
         * ��� �� ���������� ��� ����, ������� � ��������� ������ ���� � ����� ������� ����� ����, ����� ������ ��
         * ���������, � �������� ��� � ���. �� ����� ������� �������� 8.56 * 100 = 856.0, � �������� � ��� => 856
         */
        while(nextNumber != 0){
            sumAllNumbers = sumAllNumbers + (nextNumber % 10);
            /**
             * ��� �� �������� "������� �� �������"
             */
            nextNumber = nextNumber / 10;
            /**
             * ��� ��������� ��������� �� ��������� ����� ������ 856\10 = 85.6, ������� �� ������� 6, ��� ���
             * � ��� nextNumber int, �� ����� ���� ����� "���������" � �������� 85,�����
             * 85\10 = 8.5, �������� ������� �� ������� 5 � ������� �� ����� 8
             * ����� 8\10 = 0.8 , ������� �� ������� 8 � ��� nextNumber ���� �������� 0. ����� ����� ������� � �����.
              */
        }
        System.out.println("Getting sum of numerals which is : " + sumAllNumbers);
    }


}
