package punkt1bytes;

/*
 * Created by Sergey on 14.10.2015.
 * 1) есть число int (32 бита), требуется получить массив byte[4](или 4 числа по байту)
 */
public class Main {
    public static void main(String[] args) {
        byte[] massiv = new byte[4];
        int number = -2122219135;
        Methods m = new Methods();
        m.mintToByte(massiv, number);
        /*
        System.out.println(Integer.toBinaryString(2147483647));
        System.out.println(Integer.toBinaryString(255));
        System.out.println(Integer.toBinaryString(65280));
        System.out.println(Integer.toBinaryString(16711680));
        System.out.println(Integer.toBinaryString(2130706432));
        */
    }
}
