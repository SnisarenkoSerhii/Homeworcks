package punkt8;

/**
 * Created by Sergey on 22.10.2015.
 * �������� ��������� ��� ���������� �������� ��������� ����������� ���������� * � >>. ��� ��������� �������� �������
 * ����������� long System.currentTimeMillis(). ��� ������������� ����� ����� ����������, ������� ���������� �����
 * �������� ��������� ��� ��� ��������� ������������ ����������.
 */
public class Main {
    public static void main(String[] args) {
        int l = 2;
        long k = 10000000000l;
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < k; i++) {
            int x = l * 2;
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Multiplication by 2 with * :  " + timeSpent + " milliseconds");
        long startTime2 = System.currentTimeMillis();
        for (long i = 0; i < k; i++) {
            int x = l << 1;
        }
        long timeSpent2 = System.currentTimeMillis() - startTime2;
        System.out.println("Multiplication by 2 with << : " + timeSpent2 + " milliseconds");
    }
}
