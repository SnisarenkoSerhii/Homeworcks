package punkt3dop;

/**
 * Created by Sergey on 17.10.2015.
 */
public class Methods {

    public static void byteToInt(byte[] bytes) {
        int i = (bytes[3] << 24 & 0b11111111000000000000000000000000) +
                (bytes[2] << 16 & 0b00000000111111110000000000000000) +
                (bytes[1] << 8  & 0b00000000000000001111111100000000) +
                (bytes[0]       & 0b00000000000000000000000011111111);
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
    }
}
