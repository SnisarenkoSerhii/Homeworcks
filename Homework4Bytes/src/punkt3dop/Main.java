package punkt3dop;

/**
 * Created by Sergey on 17.10.2015.
 * �� ����������:
 1. ���� ������ byte[4] (��� 4 ����� �� �����), ���������� �������� int
 */
public class Main {
    public static void main(String[] args) {
        byte[] massiv = {-127, -127, -127, -127};
        Methods.byteToInt(massiv);
    }
}
