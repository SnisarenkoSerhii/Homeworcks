/**
 * Created by Sergey on 29.09.2015.
 */

/**
 * C����� 2 ����� - ����� � ����. ����������� ������������(����� ���������� ���������, ������������ ������� private),
 * ������������ (����� City ��������� Village ��� ����� ������� ��� ������, ��������
 * ����� .setAmountOfSmallBuildings() �� ��������� � City, ������ ��� ����� ��������=)) � ����������� (� �������
 * createVillage() � createCity()). �������, ��� ������ ����� ������, ����� �������� ���������� , ����� � ������� ����� ��
 * �������� � ��� �����, �� ��� ������� ����� ��������. ���� ���-�� �� ���, �� ������� ���������� ���.
 * */
public class Creator {
    public static void main(String[] args) {
        Village village = new Village(5000, 500, 60000, 100);
        village.printVillage(1000, 500, 50000, 2000);
        village.printVillage();



        City city = new City(65789, 3000, 800000, 700, 40000, 50000, 4564, 678678);
        city.printCity(65745657, 657456, 3434, 32423423);
        city.printCity();

    }
}
