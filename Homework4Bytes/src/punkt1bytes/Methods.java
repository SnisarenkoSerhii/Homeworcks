package punkt1bytes;

/**
 * Created by Sergey on 14.10.2015.
 */
//1111111 11111111 11111111 11111111
//0000000 00000000 00000000 00000000
//0000000 00000000 11111111 00000000
//0000000 11111111 00000000 00000000
//1111111 00000000 00000000 00000000
public class Methods {
    public void intToByte(int i){
        int b1 = (byte)((i & 255));
        int b2 = (byte)((i & 65280) >> 8);
        int b3 = (byte)((i & 16777215) >> 16);
        int b4 = (byte)((i & 0b11111111000000000000000000000000) >>> 24);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
    public void mintToByte(byte[] m, int i){
        m[0] = (byte)((i & 255));
        m[1] = (byte)((i & 65280) >> 8);
        m[2] = (byte)((i & 16777215) >> 16);
        m[3] = (byte)((i & 0b11111111000000000000000000000000) >>> 24);
        System.out.print("Massiv:");
        for(int myInt : m){
            System.out.print(" " + myInt);
        }
    }

}
