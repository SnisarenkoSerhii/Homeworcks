package punkt3dop;

/**
 * Created by Sergey on 17.10.2015.
 * На повторение:
 1. есть массив byte[4] (или 4 числа по байту), необходимо получить int
 */
public class Main {
    public static void main(String[] args) {
        byte[] massiv = {-127, -127, -127, -127};
        Methods.byteToInt(massiv);
    }
}
