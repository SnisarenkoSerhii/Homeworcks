package punkt7;

/**
 * Created by Sergey on 22.10.2015.
 * � ������ N ������ � ������� �������������� �� �������� �������� �������. ������ ������ ���������� ���� ����������
 * � ������� ���������� ����� ������� � �������� �� 000001 �� 999999. ����������� ��������� ������� � �������� �����
 * ������ ��� ���� ������ ����� ����� ��������� ��� ����, ���, ��������, � ������� � �������� 003102 ��� 567576.
 * ���������� ���� ������ �������� ������� ���������� ������� ����������� ������ � ������ �����������, ��� �����
 * ��������� �����������. � ������� ��������� ����������� ������� ���������� ������� � ����� ������?
 */
public class Main {
    public static void main(String[] args) {
        int count = -1;
        for (int numeral1 = 0; numeral1 < 10; numeral1++)
            for (int numeral2 = 0; numeral2 < 10; numeral2++)
                for (int numeral3 = 0; numeral3 < 10; numeral3++)
                    for (int numeral4 = 0; numeral4 < 10; numeral4++)
                        for (int numeral5 = 0; numeral5 < 10; numeral5++)
                            for (int numeral6 = 0; numeral6 < 10; numeral6++)
                                if (numeral1 + numeral2 + numeral3 == numeral4 + numeral5 + numeral6) {
                                    count++;
                                }
        System.out.print(count);
    }
}
